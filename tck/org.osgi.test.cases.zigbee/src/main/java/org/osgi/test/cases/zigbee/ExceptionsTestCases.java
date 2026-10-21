/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0 
 *******************************************************************************/

package org.osgi.test.cases.zigbee;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.osgi.service.zigbee.APSException;
import org.osgi.service.zigbee.ZCLException;
import org.osgi.service.zigbee.ZDPException;
import org.osgi.service.zigbee.ZigBeeException;

/**
 * Tests the following exceptions classes;
 * 
 * <ul>
 * <li>{@link ZigBeeException}
 * <li>{@link ZCLException}
 * <li>{@link ZDPException}
 * <li>{@link APSException}
 * </ul>
 */
public final class ExceptionsTestCases {

	private static final String message = "This is an error description.";

	/**
	 * Tests the {@link ZigBeeException} class.
	 */
	@Test
	public void testZigBeeException() {

		String prefix = "ZigBeeException: check on 1 parameter constructor: ";

		ZigBeeException exception = new ZigBeeException(message);

		assertThat(exception.getErrorCode()).as(prefix + "ZigBeeException.getErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "ZigBeeException.getZigBeeErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.getMessage()).as(prefix + "ZigBeeException.getMessage()").isEqualTo(message);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "ZigBeeException.hasZigBeeErrorCode()").isFalse();

		prefix = "ZigBeeException: check on 2 parameters constructor: ";

		exception = new ZigBeeException(50, message);

		assertThat(exception.getErrorCode()).as(prefix + "ZigBeeException.getErrorCode()").isEqualTo(50);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "ZigBeeException.getZigBeeErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.getMessage()).as(prefix + "ZigBeeException.getMessage()").isEqualTo(message);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "ZigBeeException.hasZigBeeErrorCode()").isFalse();

		prefix = "ZigBeeException: check on the 3 parameters constructor: ";

		exception = new ZigBeeException(51, 60, message);

		assertThat(exception.getErrorCode()).as(prefix + "ZigBeeException.getErrorCode()").isEqualTo(51);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "ZigBeeException.getZigBeeErrorCode()").isEqualTo(60);
		assertThat(exception.getMessage()).as(prefix + "ZigBeeException.getMessage()").isEqualTo(message);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "ZigBeeException.hasZigBeeErrorCode()").isTrue();
	}

	/**
	 * Tests the {@link ZCLException} class.
	 */
	@Test
	public void testZCLException() {

		String prefix = "ZCLException: check on 1 parameter constructor: ";

		ZCLException exception = new ZCLException(message);

		assertThat(exception.getErrorCode()).as(prefix + "ZCLException.getErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "ZCLException.getZigBeeErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "ZCLException.hasZigBeeErrorCode()").isFalse();
		assertThat(exception.getMessage()).as(prefix + "ZCLException.getMessage()").isEqualTo(message);

		prefix = "ZigBeeException: check on 2 parameters constructor: ";

		exception = new ZCLException(50, message);

		assertThat(exception.getErrorCode()).as(prefix + "ZCLException.getErrorCode()").isEqualTo(50);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "ZCLException.getZigBeeErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "ZCLException.hasZigBeeErrorCode()").isFalse();
		assertThat(exception.getMessage()).as(prefix + "ZCLException.getMessage()").isEqualTo(message);

		prefix = "ZigBeeException: check on the 3 parameters constructor: ";

		exception = new ZCLException(51, 60, message);

		assertThat(exception.getErrorCode()).as(prefix + "ZCLException.getErrorCode()").isEqualTo(51);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "ZCLException.getZigBeeErrorCode()").isEqualTo(60);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "ZCLException.hasZigBeeErrorCode()").isTrue();
		assertThat(exception.getMessage()).as(prefix + "ZCLException.getMessage()").isEqualTo(message);
	}

	/**
	 * Tests the {@link ZDPException} class.
	 */
	@Test
	public void testZDPException() {

		String prefix = "ZDPException: check on 1 parameter constructor: ";

		ZDPException exception = new ZDPException(message);

		assertThat(exception.getErrorCode()).as(prefix + "ZDPException.getErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "ZDPException.getZigBeeErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "ZDPException.hasZigBeeErrorCode()").isFalse();
		assertThat(exception.getMessage()).as(prefix + "ZDPException.getMessage()").isEqualTo(message);

		prefix = "ZigBeeException: check on 2 parameters constructor: ";

		exception = new ZDPException(50, message);

		assertThat(exception.getErrorCode()).as(prefix + "ZDPException.getErrorCode()").isEqualTo(50);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "ZDPException.getZigBeeErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "ZDPException.hasZigBeeErrorCode()").isFalse();
		assertThat(exception.getMessage()).as(prefix + "ZDPException.getMessage()").isEqualTo(message);

		prefix = "ZigBeeException: check on the 3 parameters constructor: ";

		exception = new ZDPException(51, 60, message);

		assertThat(exception.getErrorCode()).as(prefix + "ZDPException.getErrorCode()").isEqualTo(51);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "ZDPException.getZigBeeErrorCode()").isEqualTo(60);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "ZDPException.hasZigBeeErrorCode()").isTrue();
		assertThat(exception.getMessage()).as(prefix + "ZDPException.getMessage()").isEqualTo(message);
	}

	/**
	 * Tests the {@link APSException} class.
	 */
	@Test
	public void testAPSException() {

		String prefix = "APSException: check on 1 parameter constructor: ";

		APSException exception = new APSException(message);

		assertThat(exception.getErrorCode()).as(prefix + "APSException.getErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "APSException.getZigBeeErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "APSException.hasZigBeeErrorCode()").isFalse();
		assertThat(exception.getMessage()).as(prefix + "APSException.getMessage()").isEqualTo(message);

		prefix = "ZigBeeException: check on 2 parameters constructor: ";

		exception = new APSException(50, message);

		assertThat(exception.getErrorCode()).as(prefix + "APSException.getErrorCode()").isEqualTo(50);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "APSException.getZigBeeErrorCode()").isEqualTo(ZigBeeException.UNKNOWN_ERROR);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "APSException.hasZigBeeErrorCode()").isFalse();
		assertThat(exception.getMessage()).as(prefix + "APSException.getMessage()").isEqualTo(message);

		prefix = "ZigBeeException: check on the 3 parameters constructor: ";

		exception = new APSException(51, 60, message);

		assertThat(exception.getErrorCode()).as(prefix + "APSException.getErrorCode()").isEqualTo(51);
		assertThat(exception.getZigBeeErrorCode()).as(prefix + "APSException.getZigBeeErrorCode()").isEqualTo(60);
		assertThat(exception.hasZigBeeErrorCode()).as(prefix + "APSException.hasZigBeeErrorCode()").isTrue();
		assertThat(exception.getMessage()).as(prefix + "APSException.getMessage()").isEqualTo(message);
	}
}
