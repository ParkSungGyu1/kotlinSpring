package com.practice.kotlinspring.kiosk.domain.burger


class ShackBurger() : Burger() {
    override fun displayInfo() {
        println("쉑쉑버거입니다!")
        println("버거이름 : $burgerName  |  버거가격 : $burgerCost  |  설명 : $burgerDesc")
    }

    constructor(burgerName: String, burgerCost: Int, burgerDesc: String) : this() {
        super.burgerName = burgerName;
        super.burgerCost = burgerCost;
        super.burgerDesc = burgerDesc;
    }
}