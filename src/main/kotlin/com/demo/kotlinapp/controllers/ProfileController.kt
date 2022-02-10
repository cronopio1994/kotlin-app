package com.demo.kotlinapp.controllers

import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class ProfileController {
    @GetMapping("v1/profile/{profileId}")
    @Operation(
        summary = "Endpoint used to get an specific profile",
    )
    @ResponseStatus(code = HttpStatus.OK)
    fun getProfile(
        @PathVariable
        profileId: Long
    ): ResponseEntity<String>{
        return ResponseEntity("Hola", HttpStatus.OK)
    }

    @PutMapping("v1/profile/{profileId}")
    @ResponseStatus(code= HttpStatus.CREATED)
    fun modifyProfile(
        @PathVariable
        profileId: Long
    ): ResponseEntity<String>{
        return ResponseEntity("Hola", HttpStatus.OK)

    }

}