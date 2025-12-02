package org.ldv.sushiapi.dao

import org.ldv.sushiapi.model.entity.AlimentBox
import org.ldv.sushiapi.model.id.AlimentBoxId
import org.springframework.data.jpa.repository.JpaRepository

interface AlimentBoxDao : JpaRepository<AlimentBox, AlimentBoxId>{
}