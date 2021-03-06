package com.qeagle.devtools.protocol.commands;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2019 TL
 * %%
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
 * #L%
 */

import com.qeagle.devtools.protocol.events.console.MessageAdded;
import com.qeagle.devtools.protocol.support.annotations.EventName;
import com.qeagle.devtools.protocol.support.types.EventHandler;
import com.qeagle.devtools.protocol.support.types.EventListener;

/** This domain is deprecated - use Runtime or Log instead. */
@Deprecated
public interface Console {

  /** Does nothing. */
  void clearMessages();

  /**
   * Disables console domain, prevents further console messages from being reported to the client.
   */
  void disable();

  /**
   * Enables console domain, sends the messages collected so far to the client by means of the
   * `messageAdded` notification.
   */
  void enable();

  /** Issued when new console message is added. */
  @EventName("messageAdded")
  EventListener onMessageAdded(EventHandler<MessageAdded> eventListener);
}
