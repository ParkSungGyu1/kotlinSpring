package com.practice.kotlinspring.kiosk.controller

import com.practice.kotlinspring.kiosk.domain.burger.Burger
import com.practice.kotlinspring.kiosk.service.KioskService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/kiosk")
@RestController
class KioskController (
    private val kioskService: KioskService
){
    @GetMapping("/menuList")
    fun menuList(){
        kioskService.menuList()
    }

    @GetMapping("/getMenu/{menuNum}")
    fun getMenu(@PathVariable menuNum:Long) : ResponseEntity<Burger>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(kioskService.getMenu(menuNum))
    }

}