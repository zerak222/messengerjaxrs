// Planon Enterprise Edition Source file: DatabaseClass.java
// Copyright Planon 1997-2019. All Rights Reserved.
package org.rak.restservices.messenger.database;

import org.rak.restservices.messenger.model.*;

import java.util.*;

/**
 * DatabaseClass
 */
public class DatabaseClass
{
  //~ Static Variables & Initializers --------------------------------------------------------------

  private static Map<Long, Message> messages = new HashMap<Long, Message>();
  private static Map<Long, Message> profiles = new HashMap<Long, Message>();

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static Map<Long, Message> getMessages()
  {
    return messages;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static Map<Long, Message> getProfiles()
  {
    return profiles;
  }
}
