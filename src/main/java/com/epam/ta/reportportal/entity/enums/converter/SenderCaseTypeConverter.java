/*
 * Copyright (C) 2018 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.entity.enums.converter;

import com.epam.ta.reportportal.entity.project.email.SendCaseType;
import com.epam.ta.reportportal.exception.ReportPortalException;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author Pavel Bortnik
 */
@Converter(autoApply = true)
public class SenderCaseTypeConverter implements AttributeConverter<SendCaseType, String> {
	@Override
	public String convertToDatabaseColumn(SendCaseType attribute) {
		return attribute.getCaseTypeString();
	}

	@Override
	public SendCaseType convertToEntityAttribute(String dbSendCaseName) {
		return SendCaseType.findByName(dbSendCaseName)
				.orElseThrow(() -> new ReportPortalException("Can not convert send case name from database."));
	}
}