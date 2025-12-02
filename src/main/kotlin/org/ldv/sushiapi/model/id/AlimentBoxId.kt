package org.ldv.sushiapi.model.id

import jakarta.persistence.Embeddable
import jakarta.persistence.Table
import java.io.Serializable

@Embeddable
@Table(name = "aliments_boxes")
class AlimentBoxId (
    val boxId: Long,
    val alimentId: Long,
): Serializable{
}