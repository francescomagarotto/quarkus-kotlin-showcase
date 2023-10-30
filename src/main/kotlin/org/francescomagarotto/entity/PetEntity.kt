package org.francescomagarotto

import io.quarkus.hibernate.orm.panache.PanacheEntityBase
import jakarta.persistence.*

@Entity
@Table(name = "pet")
open class PetEntity : PanacheEntityBase() {
    @get:GeneratedValue(strategy = GenerationType.SEQUENCE)
    @get:Id
    @get:SequenceGenerator(name = "pet_SEQ", sequenceName = "pet_SEQ")
    open var id: Long? = null

    @get:Column(name = "name")
    open var name: String? = null
        set
        get
    @get:Column(name = "age")
    open var age: Int? = null
        set
        get
}
