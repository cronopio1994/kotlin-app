package com.demo.kotlinapp.data

import com.demo.kotlinapp.data.models.PortfolioTable
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import javax.sound.sampled.Port

@Component
interface PortfolioRepository : CrudRepository<PortfolioTable, Long> {
    fun findByNameAndTwitterUser(name: String, twitterUser: String): PortfolioTable?
}