/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.util;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alef Arendsen
 */
public class MockLog4jAppender extends AppenderSkeleton {

	public static final List<String> loggingStrings = new ArrayList<String>();

	public static boolean closeCalled = false;


	@Override
	protected void append(LoggingEvent evt) {
		loggingStrings.add(evt.getMessage().toString());
	}

	@Override
	public void close() {
		closeCalled = true;
	}

	@Override
	public boolean requiresLayout() {
		return false;
	}

}
