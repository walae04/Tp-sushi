package org.ldv.sushiapi.dao

import org.ldv.sushiapi.model.entity.Aliment
import org.springframework.data.jpa.repository.JpaRepository

interface AlimentDao: JpaRepository<Aliment, Long> {
}