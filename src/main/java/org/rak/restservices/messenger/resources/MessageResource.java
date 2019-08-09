// Planon Enterprise Edition Source file: MessageResource.java
// Copyright Planon 1997-2019. All Rights Reserved.
package org.rak.restservices.messenger.resources;

import org.rak.restservices.messenger.model.*;
import org.rak.restservices.messenger.service.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import java.util.*;

/**
 * MessageResource
 */
@Path("/messages")
public class MessageResource
{

	MessengerService messageService = new MessengerService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id) {

		return messageService.getMessage(id);

	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(Message aMessage) {

		return messageService.addMessage(aMessage);

	}
	
	@PUT
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateMessage(@PathParam("messageId") long id, Message aMessage) {
		aMessage.setId(id);
		 messageService.updateMessage(aMessage);

	}
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId") long id) {

		 messageService.removeMessage(id);

	}
}
