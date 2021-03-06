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

import java.io.Serializable;

import org.wicketstuff.chat.channel.api.ChannelEvent;
import org.wicketstuff.chat.channel.api.IChannelPublisher;

/**
 * Publisher that could be associated with a {@link TimerChannelBehavior} for more documentation see
 * {@link TimerChannelBehavior}
 * 
 * @author Vincent Demay
 */
public class TimerChannelPublisher implements IChannelPublisher, Serializable
{
	private static final long serialVersionUID = 1L;

	@Override
	public void publish(final ChannelEvent event)
	{
		EventStore.get().add(event);
	}
}
