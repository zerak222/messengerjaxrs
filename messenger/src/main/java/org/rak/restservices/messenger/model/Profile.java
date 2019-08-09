// Planon Enterprise Edition Source file: Profile.java
// Copyright Planon 1997-2019. All Rights Reserved.
package org.rak.restservices.messenger.model;

import javax.xml.bind.annotation.*;

import java.util.*;

/**
 * Profile
 */
@XmlRootElement public class Profile
{
  //~ Instance Variables ---------------------------------------------------------------------------

  private Date created;

  private long id;
  private String firstName;
  private String lastName;
  private String profileName;

  //~ Constructors ---------------------------------------------------------------------------------

  /**
   * Creates a new Profile object.
   */
  public Profile()
  {
  }


  /**
   * Creates a new Profile object.
   *
   * @param id          DOCUMENT ME!
   * @param profileName DOCUMENT ME!
   * @param firstName   DOCUMENT ME!
   * @param lastName    DOCUMENT ME!
   */
  public Profile(long id, String profileName, String firstName, String lastName)
  {
    this.id = id;
    this.profileName = profileName;
    this.firstName = firstName;
    this.lastName = lastName;
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
  public String getProfileName()
  {
    return profileName;
  }


  /**
   * DOCUMENT ME!
   *
   * @param profileName DOCUMENT ME!
   */
  public void setProfileName(String profileName)
  {
    this.profileName = profileName;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getFirstName()
  {
    return firstName;
  }


  /**
   * DOCUMENT ME!
   *
   * @param firstName DOCUMENT ME!
   */
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getLastName()
  {
    return lastName;
  }


  /**
   * DOCUMENT ME!
   *
   * @param lastName DOCUMENT ME!
   */
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
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
}
