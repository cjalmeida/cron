/**
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.scheduling.exception;

/**
 * Exception thrown when there is a problem starting the Seam Scheduling module.
 * @author Peter Royle
 */
public class SchedulerInitialisationException extends RuntimeException
{

    /**
     * Create a new instance of SchedulerInitialisationException with the given error message.
     * @param message The error message.
     */
    public SchedulerInitialisationException(String message)
    {
        super(message);
    }

    /**
     * Create a new instance of SchedulerInitialisationException with the given error message and cause.
     * @param message The error message.
     * @param cause The orginal cause of the error.
     */
    public SchedulerInitialisationException(String message, Throwable cause)
    {
        super(message, cause);
    }
}