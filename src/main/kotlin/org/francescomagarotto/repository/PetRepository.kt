package org.francescomagarotto;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class PetRepository : PanacheRepository<PetEntity> {

}
