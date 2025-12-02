package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "boxes")
class Box (
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val boxId: Long? = null,
    val nom: String,
    val nbPieces: Int,
    val prix: Double,
    val nomImage: String? = null,

// Relation many to many des boxes aux saveurs :
    @ManyToMany
    @JoinTable(
        name = "saveurs_boxes",
        joinColumns = [JoinColumn(name = "fk_box_id")],
        inverseJoinColumns = [JoinColumn(name = "fk_saveur_id")]
    )
    val saveurs: MutableSet<Saveur>,
// Relation one to many d'une box à ses aliments :
    @OneToMany(mappedBy = "box")
    val alimentBoxes: MutableSet<AlimentBox>
){
}