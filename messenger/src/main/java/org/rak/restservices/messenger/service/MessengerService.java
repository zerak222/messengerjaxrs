// Planon Enterprise Edition Source file: MessengerService.java
// Copyright Planon 1997-2019. All Rights Reserved.
package org.rak.restservices.messenger.service;

import org.rak.restservices.messenger.database.*;
import org.rak.restservices.messenger.model.*;

import java.util.*;

/**
 * MessengerService
 */
public class MessengerService
{
  //~ Instance Variables ---------------------------------------------------------------------------

  private Map<Long, Message> messages = DatabaseClass.getMessages();

  //~ Constructors ---------------------------------------------------------------------------------

  /**
   * Creates a new MessengerService object.
   */
  public MessengerService()
  {
    messages.put(1L, new Message(1, "Hello World", "RestEasy"));
    messages.put(2L, new Message(2, "Hello Jersey", "Jersey"));
  }

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */

  public List<Message> getAllMessages()
  {
    return new ArrayList<Message>(messages.values());
  }


  /**
   * DOCUMENT ME!
   *
   * @param  id DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Message getMessage(long id)
  {
    return messages.get(id);
  }


  /**
   * DOCUMENT ME!
   *
   * @param  message DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Message addMessage(Message message)
  {
    message.setId(messages.size() + 1);
    messages.put(message.getId(), message);
    return message;
  }


  /**
   * DOCUMENT ME!
   *
   * @param  message DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Message updateMessage(Message message)
  {
    if (message.getId() <= 0)
    {
      return null;
    }
    messages.put(message.getId(), message);
    return message;
  }


  /**
   * DOCUMENT ME!
   *
   * @param  id DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Message removeMessage(long id)
  {
    return messages.remove(id);
  }
}
