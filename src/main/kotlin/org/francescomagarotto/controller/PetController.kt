package org.francescomagarotto

import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import org.francescomagarotto.dto.Pet
import org.francescomagarotto.entity.PetEntity

@Path("/pets")
class PetController {
    @Inject
    lateinit var petService: PetService

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getAll(): List<PetEntity> {
        return petService.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun add(pet: Pet): PetEntity {
        return petService.addPet(pet)
    }
}