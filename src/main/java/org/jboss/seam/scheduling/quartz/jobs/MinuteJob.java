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
package org.jboss.seam.scheduling.quartz.jobs;

import java.util.GregorianCalendar;
import org.jboss.seam.scheduling.events.AbstractTimeEvent;
import org.jboss.seam.scheduling.events.Minute;

/**
 * Fires the Minute event with the @Every binding.
 * @author Peter Royle
 */
public class MinuteJob extends AbstractTimeEventJob
{

    /**
     *Create an event payload instance of type Minute with the current system time.
     * @return an instance of Minute.
     */
    protected AbstractTimeEvent createEventPayload()
    {
        return new Minute(System.currentTimeMillis(), gc.get(GregorianCalendar.MINUTE));
    }
}