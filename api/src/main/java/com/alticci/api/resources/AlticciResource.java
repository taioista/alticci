package com.alticci.api.resources;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.alticci.api.services.AlticciService;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class AlticciResource {

    @Inject
    AlticciService service;

    @GET
    @Path("/{n}")
    @Produces(MediaType.APPLICATION_JSON)
    public Long getAlticciSequence(@NotBlank @PathParam Long n) {
        return service.applyAlticci(n);
    }
}