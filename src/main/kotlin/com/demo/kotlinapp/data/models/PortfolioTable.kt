package com.demo.kotlinapp.data.models

import com.demo.kotlinapp.data.response.PortfolioResponse
import javax.persistence.*

@Entity
@Table(name = "portfolio")
data class PortfolioTable(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(name = "experience")
    val experience: String,

    @Column(name = "imagePath")
    val imagePath: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "twitterUser")
    val twitterUser: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "address")
    val address: String,

    @Column(name = "phone")
    val phone: String,

    @Column(name = "zipCode")
    val zipCode: String
)
{
    fun toPortfolioResponse(): PortfolioResponse = PortfolioResponse(
        id = this.id!!,
        experience = this.experience,
        imagePath = this.imagePath,
        name = this.name,
        twitterUser = this.twitterUser,
        email = this.email,
        address = this.address,
        phone = this.phone,
        zipCode = zipCode
    )
}