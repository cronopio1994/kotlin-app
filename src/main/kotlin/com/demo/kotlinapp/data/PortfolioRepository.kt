package com.demo.kotlinapp.data

import com.demo.kotlinapp.data.models.PortfolioTable
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component

@Component
interface PortfolioRepository : CrudRepository<PortfolioTable, Long> {

}