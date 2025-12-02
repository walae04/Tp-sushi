package org.ldv.sushiapi.model.entity

import jakarta.persistence.*
import org.ldv.sushiapi.model.id.AlimentBoxId

@Entity
@Table(name = "aliments_boxes")
class AlimentBox(
    @EmbeddedId
    val alimentBoxId: AlimentBoxId,
    @ManyToOne
    @MapsId("boxId")
    @JoinColumn(name = "fk_box_id")
    //@JsonBackReference
    val box: Box,
    @ManyToOne
    @MapsId("alimentId")
    @JoinColumn(name = "fk_aliment_id")
    //@JsonBackReference
    val aliment: Aliment,
    val quantite: Int

) {
}