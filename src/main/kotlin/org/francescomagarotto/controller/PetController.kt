package org.francescomagarotto.controller

import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.francescomagarotto.dto.Pet
import org.francescomagarotto.entity.PetEntity
import org.francescomagarotto.service.PetService

@Path("/pets")
class PetController {

    @Inject
    lateinit var petService: PetService

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getAll(): List<PetEntity> {
        return petService.listAll()
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun add(pet: Pet): PetEntity {
        return petService.addPet(pet)
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    fun findByName(@PathParam(value = "name") name: String): PetEntity {
        return petService.findByName(name)
    }

    @DELETE
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    fun deleteByName(@PathParam(value = "name") name: String): Response {
        val result = petService.deleteByName(name)
        return if (result) {
            Response.ok().build();
        } else {
            Response.status(Response.Status.NOT_FOUND).build()
        }
    }
}