package br.com.otta.enterpriseApi.api;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.http.ResponseEntity;

import br.com.otta.enterpriseApi.model.Enterprise;

@Path("enterprise")
public interface EnterpriseApi {

    @GET
    @Produces("application/json")
    ResponseEntity<Collection<Enterprise>> listAllEnterprises();
    @GET
    @Produces("application/json")
    @Path("/{id}")
    ResponseEntity<Enterprise> findEnterpriseById(@PathParam("id") long id);
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    ResponseEntity<Enterprise> saveEnterprise(Enterprise enterprise);
    @PUT
    @Produces("application/json")
    @Consumes("application/json")
    ResponseEntity<Enterprise> updateEnterprise(Enterprise enterprise);
}
