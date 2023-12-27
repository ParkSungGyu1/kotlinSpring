package com.practice.kotlinspring.kiosk.domain.cafe


class ACafe() : Cafe() {
    override fun displayInfo() {
        println("")
    }
    constructor(cafeName: String, cafeCost: Int, cafeDesc: String) : this() {
        super.cafeName = cafeName;
        super.cafeCost = cafeCost;
        super.cafeDesc = cafeDesc;
    }
}