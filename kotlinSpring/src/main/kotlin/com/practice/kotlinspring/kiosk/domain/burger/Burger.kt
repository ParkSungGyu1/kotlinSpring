package com.practice.kotlinspring.kiosk.domain.burger

abstract class Burger {
    var burgerName = ""
    var burgerCost = 0
    var burgerDesc = ""

    abstract fun displayInfo()

}