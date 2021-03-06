/**
 * Copyright (C) 2015 Asterios Raptis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wicketstuff.chat.channel;

import java.util.ArrayList;
import java.util.List;

import org.wicketstuff.chat.channel.api.ChannelEvent;
import org.wicketstuff.chat.channel.api.EventStoreListener;

/**
 * Here we are simulating a bus with this event store It is an Internal class (volontary package)
 * 
 * 
 * @author Vincent Demay
 */
class EventStore
{

	private final static EventStore eventStore = new EventStore();

	public static EventStore get()
	{
		return eventStore;
	}

	private transient final List<EventStoreListener> listenerList = new ArrayList<EventStoreListener>();

	public void add(final ChannelEvent value)
	{
		for (final EventStoreListener listener : listenerList)
		{
			listener.eventTriggered(value.getChannel(), value.getData());
		}
	}

	/**
	 * Adds a listener to this list which will be notified whenever the list is modified
	 * 
	 * @param listener
	 *            the listener to add
	 */
	public void addEventStoreListener(final EventStoreListener listener)
	{
		listenerList.add(listener);
	}
}
