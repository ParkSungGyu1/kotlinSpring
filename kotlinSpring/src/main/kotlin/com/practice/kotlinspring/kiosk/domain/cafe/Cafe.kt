package com.practice.kotlinspring.kiosk.domain.cafe

abstract class Cafe {
    var cafeName = ""
    var cafeCost = 0
    var cafeDesc = ""

    abstract fun displayInfo()
}