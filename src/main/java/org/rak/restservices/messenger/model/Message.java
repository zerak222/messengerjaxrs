// Planon Enterprise Edition Source file: Message.java
// Copyright Planon 1997-2019. All Rights Reserved.
package org.rak.restservices.messenger.model;

import javax.xml.bind.annotation.*;

import java.util.*;

/**
 * Message
 */
@XmlRootElement public class Message
{
  //~ Instance Variables ---------------------------------------------------------------------------

  private Date created;

  private long id;
  private String author;
  private String message;

  //~ Constructors ---------------------------------------------------------------------------------

  /**
   * Creates a new Message object.
   */
  public Message()
  {
  }


  /**
   * Creates a new Message object.
   *
   * @param id      DOCUMENT ME!
   * @param message DOCUMENT ME!
   * @param author  DOCUMENT ME!
   */
  public Message(long id, String message, String author)
  {
    this.id = id;
    this.message = message;
    this.author = author;
    this.created = new Date();
  }

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public long getId()
  {
    return id;
  }


  /**
   * DOCUMENT ME!
   *
   * @param id DOCUMENT ME!
   */
  public void setId(long id)
  {
    this.id = id;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getMessage()
  {
    return message;
  }


  /**
   * DOCUMENT ME!
   *
   * @param message DOCUMENT ME!
   */
  public void setMessage(String message)
  {
    this.message = message;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getCreated()
  {
    return created;
  }


  /**
   * DOCUMENT ME!
   *
   * @param created DOCUMENT ME!
   */
  public void setCreated(Date created)
  {
    this.created = created;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAuthor()
  {
    return author;
  }


  /**
   * DOCUMENT ME!
   *
   * @param author DOCUMENT ME!
   */
  public void setAuthor(String author)
  {
    this.author = author;
  }
}
