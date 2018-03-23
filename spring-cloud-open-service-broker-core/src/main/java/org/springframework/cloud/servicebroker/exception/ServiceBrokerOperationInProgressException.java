/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.servicebroker.exception;

/**
 * Thrown to indicate that a request was received while processing of an asynchronous operation is in progress.
 *
 * <p>
 * Throwing this exception will result in an HTTP status code {@literal 404 NOT FOUND}
 * being returned to the platform.
 *
 * @author Scott Frederick
 */
public class ServiceBrokerOperationInProgressException extends RuntimeException {

	private static final long serialVersionUID = -1879753092397657116L;

	/**
	 * Construct an exception with a default message.
	 */
	public ServiceBrokerOperationInProgressException() {
		super("Service broker operation is in progress for the requested service instance or binding");
	}

	/**
	 * Construct an exception with a default message that includes the provided {@literal operation} description.
	 *
	 * @param operation a description of the operation in progress
	 */
	public ServiceBrokerOperationInProgressException(String operation) {
		super("Service broker operation is in progress for the requested service instance or binding: " +
				"operation=" + operation);
	}
}