package com.qa.REST;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.service.ServiceInterface;


@Path("/classroom")
public class ClassroomEndpoint {

		@Inject
		private ServiceInterface service;

		@Path("/getAllClassroom")
		@GET
		@Produces({ "application/json" })
		public String getAllAccounts() {
			return service.getAllClassroom();
		}

		@Path("/createClassroom")
		@POST
		@Produces({ "application/json" })
		public String addAccount(String account) {
			return service.addClassroom(account);
		}

		@Path("/updateClassroom/{id}")
		@PUT
		@Produces({ "application/json" })
		public String updateAccount(@PathParam("id") Long id, String account) {
			return service.updateClassroom(id, account);
		}

		@Path("/deleteClassroom/{id}")
		@DELETE
		@Produces({ "application/json" })
		public String deleteAccount(@PathParam("id") Long id) {
			return service.deleteClassroom(id);

		}

		public void setService(ServiceInterface service) {
			this.service = service;
		}

	}
	

