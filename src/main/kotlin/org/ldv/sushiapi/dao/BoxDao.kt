package org.ldv.sushiapi.dao

import org.ldv.sushiapi.model.entity.Box
import org.springframework.data.jpa.repository.JpaRepository

interface BoxDao : JpaRepository<Box, Long>{
}