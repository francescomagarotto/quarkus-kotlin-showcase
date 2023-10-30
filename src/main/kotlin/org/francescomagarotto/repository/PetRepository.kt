package org.francescomagarotto.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import jakarta.enterprise.context.ApplicationScoped
import org.francescomagarotto.entity.PetEntity

@ApplicationScoped
class PetRepository : PanacheRepositoryBase<PetEntity, String> {

}
