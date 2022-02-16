package com.demo.kotlinapp.services

import com.demo.kotlinapp.data.PortfolioRepository
import com.demo.kotlinapp.data.models.PortfolioTable
import com.demo.kotlinapp.data.request.PortfolioRequest
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.data.repository.findByIdOrNull

class PortfolioServiceTest {

    private val portfolioRepository: PortfolioRepository = mockk()
    private val portfolioService = PortfolioService(portfolioRepository)


    @Test
    fun `should create new portfolio when is not found in the db`() {
        every {
            portfolioRepository.findByNameAndTwitterUser(any(), any())
        } returns null

        every {
            portfolioRepository.save(any())
        } returns PortfolioTable(1, "", "", "", "", "", "", "", "")

        portfolioService.createPortfolio(stubRequest())

        verify(exactly = 1) {
            portfolioRepository.save(any())
        }
    }

    @Test
    fun `should throw an exception when the user already exist in the db`() {
        every {
            portfolioRepository.findByNameAndTwitterUser(any(), any())
        } returns PortfolioTable(1, "exp", "", "Name", "@twi", "mail@mail.com", "", "", "")

        assertThrows<Exception> {
            portfolioService.createPortfolio(stubRequest())

        }

        verify(exactly = 0) {
            portfolioRepository.save(any())
        }
    }

    @Test
    fun `should return a complete portfolio from db when it exist`() {
        val userId = 1L

        every {
            portfolioRepository.findByIdOrNull(userId)
        } returns PortfolioTable(
            userId,
            "experience",
            "op",
            "John Doe",
            "@john",
            "mail@mail.com",
            "address",
            "1111",
            "zip"
        )

        val result = portfolioService.getPortfolioById(userId)

        assertThat(result.id).isEqualTo(userId)
    }

    @Test
    fun `should throw an exception portfolio from db when does not exist`() {
        val userId = 1L

        every {
            portfolioRepository.findByIdOrNull(userId)
        } returns null

        assertThrows<Exception> {
            portfolioService.getPortfolioById(userId)
        }

    }

    private fun stubRequest(): PortfolioRequest = PortfolioRequest(
        experience = "other experience",
        imagePath = "img",
        name = "Same",
        twitterUser = "",
        email = "test@mail.com",
        address = "new address",
        phone = "phone",
        zipCode = "new zip"
    )
}