package org.francescomagarotto.service

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.transaction.Transactional
import org.francescomagarotto.dto.Pet
import org.francescomagarotto.entity.PetEntity
import org.francescomagarotto.repository.PetRepository

@Singleton
class PetService(@Inject var petRepository: PetRepository) {

    fun listAll(): List<PetEntity> {
        return petRepository.listAll();
    }

    @Transactional
    fun addPet(pet: Pet): PetEntity {
        val petEntity = PetEntity()
        with(petEntity) {
            name = pet.name
            age = pet.age
        }
        petRepository.persistAndFlush(petEntity)
        return petEntity
    }

    fun findByName(name: String): PetEntity {
        return petRepository.findById(name);
    }

    fun deleteByName(name: String): Boolean {
        return petRepository.deleteById(name);
    }


}
