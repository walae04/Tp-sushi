package org.ldv.sushiapi.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.GenerationType
import jakarta.persistence.ManyToMany


@Entity
@Table(name = "saveurs")
class Saveur (
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val saveurId: Long? = null,
    val nom: String,
// La relation many to many est gérée dans la classe Box sur l'attribut saveurs :
    @ManyToMany(mappedBy="saveurs")
    val boxes: MutableSet<Box>
){
}