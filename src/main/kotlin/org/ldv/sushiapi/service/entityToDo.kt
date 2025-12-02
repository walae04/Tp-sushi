package org.ldv.sushiapi.service

import org.ldv.sushiapi.dto.AlimentBoxDtoApi
import org.ldv.sushiapi.dto.BoxDtoApi
import org.ldv.sushiapi.model.entity.Box

fun boxToBoxDtoApi(box: Box): BoxDtoApi {
    return BoxDtoApi(
        box.boxId,
        box.nbPieces,
        box.nom,
        box.nomImage,
        box.prix,
        HashSet(box.saveurs.stream().map { it.nom }.toList()),
        box.alimentBoxes.stream().map { AlimentBoxDtoApi(it.aliment.nom, it.quantite) }.toList()
    )
}