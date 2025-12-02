package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "aliments")
class Aliment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val alimentId: Long? = null,
    val nom: String,
// Relation one to many avec la alimentBox :
    @OneToMany(mappedBy = "aliment")
    val alimentBoxes: MutableSet<AlimentBox>
){
}