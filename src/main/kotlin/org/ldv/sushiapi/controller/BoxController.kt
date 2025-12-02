package org.ldv.sushiapi.controller

import org.ldv.sushiapi.dao.BoxDao
import org.ldv.sushiapi.dto.BoxDtoApi
import org.ldv.sushiapi.service.boxToBoxDtoApi
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
@CrossOrigin
class BoxController (val boxDao: BoxDao) {
    @GetMapping("/boxes")
    @CrossOrigin(origins = ["*"])
    fun allBoxes(): ResponseEntity<List<BoxDtoApi>> {
        return ResponseEntity.ok(boxDao.findAll().map { boxToBoxDtoApi(it) })
    }
}
