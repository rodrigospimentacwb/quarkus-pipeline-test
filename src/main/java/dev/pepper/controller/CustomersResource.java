package dev.pepper.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.pepper.integration.CustomerDTO;
import dev.pepper.service.CustomersService;

@Path("customers")
public class CustomersResource {

    @Inject
    CustomersService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CustomerDTO> list() {
        return service.list();
    }
}