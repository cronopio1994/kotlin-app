package com.demo.kotlinapp.data.request

import io.swagger.v3.oas.annotations.media.Schema
import org.intellij.lang.annotations.RegExp
import org.jetbrains.annotations.NotNull
import javax.validation.Valid
import javax.validation.constraints.Email

data class PortfolioRequest(
    @field:Schema(description = "Submit the last 5 years work experience")
    @field:Valid
    @NotNull
    var experience: String,

    @field:Schema(description = "Path for the user image")
    @field:Valid
    @NotNull
    var imagePath: String,

    @field:Schema(description = "Name of the user")
    @field:Valid
    @NotNull
    var name: String,

    @field:Schema(description = "Twitter username")
    @field:Valid
    @NotNull
    @RegExp(prefix = "@")
    var twitterUser: String,

    @field:Schema(description = "Email")
    @field:Valid
    @NotNull
    @Email
    var email: String,

    @field:Schema(description = "Address")
    @field:Valid
    @NotNull
    var address: String,

    @field:Schema(description = "Phone number")
    @field:Valid
    @NotNull
    var phone: String,

    @field:Valid
    @NotNull
    var zipCode: String
)
