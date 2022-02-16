package com.demo.kotlinapp.data.response

data class PortfolioResponse(
    var id: Long,
    var experience: String,
    var imagePath: String,
    var name: String,
    var twitterUser: String,
    var email: String,
    var address: String,
    var phone: String,
    var zipCode: String
)
