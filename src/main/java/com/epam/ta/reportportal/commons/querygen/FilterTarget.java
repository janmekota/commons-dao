package com.epam.ta.reportportal.commons.querygen;

import com.epam.ta.reportportal.entity.integration.Integration;
import com.epam.ta.reportportal.entity.item.TestItem;
import com.epam.ta.reportportal.entity.launch.Launch;
import com.epam.ta.reportportal.entity.log.Log;
import com.epam.ta.reportportal.entity.project.Project;
import com.epam.ta.reportportal.jooq.enums.JStatusEnum;
import com.epam.ta.reportportal.jooq.tables.*;
import org.jooq.Record;
import org.jooq.SelectQuery;
import org.jooq.impl.DSL;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.epam.ta.reportportal.jooq.Tables.TEST_ITEM_RESULTS;
import static com.epam.ta.reportportal.jooq.Tables.TEST_ITEM_STRUCTURE;
import static org.jooq.impl.DSL.*;

public enum FilterTarget {

	LAUNCH(Launch.class, Arrays.asList(
			//@formatter:off
			new CriteriaHolder("description", "l.description", String.class, false),
			new CriteriaHolder("name", "l.name", String.class, false),
			new CriteriaHolder("project", "p.name", String.class, false)
			//@formatter:on
	)) {
		public SelectQuery<? extends Record> getQuery() {
			JLaunch l = JLaunch.LAUNCH.as("l");
			JTestItemStructure ti = JTestItemStructure.TEST_ITEM_STRUCTURE.as("ti");
			JProject p = JProject.PROJECT.as("p");
			JTestItemResults tr = TEST_ITEM_RESULTS.as("tr");

			return DSL.select(l.ID, l.PROJECT_ID, l.USER_ID, l.NAME, l.DESCRIPTION, l.START_TIME, l.NUMBER, l.LAST_MODIFIED, l.MODE,
					sum(when(tr.STATUS.eq(JStatusEnum.PASSED), 1).otherwise(0)).as("passed"),
					sum(when(tr.STATUS.eq(JStatusEnum.FAILED), 1).otherwise(0)).as("failed"),
					sum(when(tr.STATUS.eq(JStatusEnum.SKIPPED), 1).otherwise(0)).as("skipped"), count(tr.STATUS).as("total")
			)
					//@formatter:off
					.from(l)
					.leftJoin(ti).on(l.ID.eq(ti.LAUNCH_ID))
					.leftJoin(tr).on(ti.STRUCTURE_ID.eq(tr.RESULT_ID))
					.leftJoin(p).on(l.PROJECT_ID.eq(p.ID))
					.groupBy(l.ID, l.PROJECT_ID, l.USER_ID, l.NAME, l.DESCRIPTION, l.START_TIME, l.NUMBER, l.LAST_MODIFIED, l.MODE)
					.getQuery();
					//@formatter:on
		}
	},

	INTEGRATION(Integration.class, Arrays.asList(

			new CriteriaHolder("project", "p.name", String.class, false), new CriteriaHolder("type", "it.name", String.class, false))) {
		public SelectQuery<? extends Record> getQuery() {
			JIntegration i = JIntegration.INTEGRATION.as("i");
			JIntegrationType it = JIntegrationType.INTEGRATION_TYPE.as("it");
			JProject p = JProject.PROJECT.as("p");

			return DSL.select(i.ID, i.PROJECT_ID, i.TYPE, i.PARAMS, i.CREATION_DATE)
					.from(i).leftJoin(it).on(i.TYPE.eq(it.ID)).leftJoin(p).on(i.PROJECT_ID.eq(p.ID))
					.groupBy(i.ID, i.PROJECT_ID, i.TYPE, i.PARAMS, i.CREATION_DATE)
					.getQuery();
		}
	},

	PROJECT(Project.class, Arrays.asList(

			new CriteriaHolder("name", "p.name", String.class, false))) {
		public SelectQuery<? extends Record> getQuery() {
			JProject p = JProject.PROJECT.as("p");

			return DSL.select(p.ID, p.NAME).from(p).getQuery();

		}
	},

	LOG(Log.class, Arrays.asList(

			new CriteriaHolder("log_message", "l.log_message", String.class, false))) {
		@Override
		public SelectQuery<? extends Record> getQuery() {
			JLog l = JLog.LOG.as("l");
			JTestItem ti = JTestItem.TEST_ITEM.as("ti");

			return DSL.select(l.ID, l.LOG_TIME, l.LOG_MESSAGE, l.LAST_MODIFIED, l.LOG_LEVEL, l.ITEM_ID, l.FILE_PATH, l.THUMBNAIL_FILE_PATH,
					l.CONTENT_TYPE
			)
					.from(l).leftJoin(ti).on(l.ITEM_ID.eq(ti.ITEM_ID))
					.groupBy(l.ID, l.LOG_TIME, l.LOG_MESSAGE, l.LAST_MODIFIED, l.LOG_LEVEL, l.ITEM_ID)
					.getQuery();
		}
	},

	TEST_ITEM(TestItem.class, Arrays.asList(

			new CriteriaHolder("name", "ti.name", String.class, false))) {
		@Override
		public SelectQuery<? extends Record> getQuery() {
			JTestItem ti = JTestItem.TEST_ITEM.as("ti");
			JTestItemStructure tis = TEST_ITEM_STRUCTURE.as("tis");
			JLaunch l = JLaunch.LAUNCH.as("l");
			JParameter p = JParameter.PARAMETER.as("p");

			return DSL.select(ti.ITEM_ID, tis.LAUNCH_ID, ti.NAME, ti.TYPE, ti.START_TIME, ti.DESCRIPTION, ti.LAST_MODIFIED, ti.UNIQUE_ID)
					.select(p.KEY, p.VALUE)
					.from(ti)
					.join(tis)
					.on(ti.ITEM_ID.eq(tis.STRUCTURE_ID))
					.leftJoin(l)
					.on(tis.LAUNCH_ID.eq(l.ID))
					.leftJoin(p)
					.on(ti.ITEM_ID.eq(p.ITEM_ID))
					.getQuery();
		}
	};

	private Class<?> clazz;
	private List<CriteriaHolder> criterias;

	FilterTarget(Class<?> clazz, List<CriteriaHolder> criterias) {
		this.clazz = clazz;
		this.criterias = criterias;
	}

	public abstract SelectQuery<? extends Record> getQuery();

	public Class<?> getClazz() {
		return clazz;
	}

	public List<CriteriaHolder> getCriterias() {
		return criterias;
	}

	public Optional<CriteriaHolder> getCriteriaByFilter(String filterCriteria) {
		return criterias.stream().filter(holder -> holder.getFilterCriteria().equals(filterCriteria)).findAny();
	}

	public static FilterTarget findByClass(Class<?> clazz) {
		return Arrays.stream(values())
				.filter(val -> val.clazz.equals(clazz))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException(String.format("No target query builder for clazz %s", clazz)));
	}

}
