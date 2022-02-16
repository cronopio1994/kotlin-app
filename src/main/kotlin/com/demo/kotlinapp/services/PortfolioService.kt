package com.demo.kotlinapp.services

import com.demo.kotlinapp.data.PortfolioRepository
import com.demo.kotlinapp.data.models.PortfolioTable
import com.demo.kotlinapp.data.request.PortfolioRequest
import com.demo.kotlinapp.data.response.PortfolioResponse
import org.hibernate.DuplicateMappingException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.web.client.HttpClientErrorException
import java.lang.Exception

@Component
class PortfolioService(
    val portfolioRepository: PortfolioRepository
) {
    fun createPortfolio(portfolioRequest: PortfolioRequest) {
        val existingUser =
            portfolioRepository.findByNameAndTwitterUser(portfolioRequest.name, portfolioRequest.twitterUser)
        if (existingUser != null) {
            throw Exception("The user is already exist")

        } else {
            portfolioRepository.save(
                PortfolioTable(
                    null,
                    portfolioRequest.experience,
                    portfolioRequest.imagePath,
                    portfolioRequest.name,
                    portfolioRequest.twitterUser,
                    portfolioRequest.email,
                    portfolioRequest.address,
                    portfolioRequest.phone,
                    portfolioRequest.zipCode
                )
            )
        }
    }

    fun getPortfolioById(id: Long): PortfolioResponse {
        val existingPortfolio = portfolioRepository.findByIdOrNull(id)

        if (existingPortfolio != null) {
            return existingPortfolio.toPortfolioResponse()
        } else {
            throw Exception("Portfolio not found")
        }
    }
}