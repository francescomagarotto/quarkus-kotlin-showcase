package org.francescomagarotto.entity

import io.quarkus.hibernate.orm.panache.PanacheEntityBase
import jakarta.persistence.*

@Entity
@Table(name = "pet")
open class PetEntity : PanacheEntityBase() {

    @field:Id
    @field:Column(name = "name")
    open var name: String? = null

    @field:Column(name = "age")
    open var age: Int? = null
}
