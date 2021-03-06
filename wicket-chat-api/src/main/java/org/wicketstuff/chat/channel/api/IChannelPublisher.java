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
package org.wicketstuff.chat.channel.api;

/**
 * A class allowing the server to send an event on listener. This publisher is able to send a
 * {@link ChannelEvent}
 * <p>
 * 
 * @author Vincent Demay
 * 
 * @see IChannelService
 */
public interface IChannelPublisher
{
	/**
	 * Publish a {@link ChannelEvent}
	 * 
	 * @param event
	 *            event to publish
	 */
	public void publish(final ChannelEvent event);
}
