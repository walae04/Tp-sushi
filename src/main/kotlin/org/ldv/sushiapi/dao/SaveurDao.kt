package org.ldv.sushiapi.dao

import org.ldv.sushiapi.model.entity.Saveur
import org.springframework.data.jpa.repository.JpaRepository

interface SaveurDao: JpaRepository<Saveur, Long> {
}