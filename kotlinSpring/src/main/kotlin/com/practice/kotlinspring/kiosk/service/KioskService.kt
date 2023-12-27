package com.practice.kotlinspring.kiosk.service

import com.practice.kotlinspring.kiosk.domain.burger.Burger
import com.practice.kotlinspring.kiosk.domain.burger.LotteBurger
import com.practice.kotlinspring.kiosk.domain.burger.ShackBurger
import com.practice.kotlinspring.kiosk.domain.cafe.ACafe
import com.practice.kotlinspring.kiosk.domain.cafe.BCafe
import com.practice.kotlinspring.kiosk.domain.cafe.Cafe
import com.practice.kotlinspring.kiosk.repository.KioskRepository
import org.springframework.stereotype.Service

@Service
class KioskService (
    private val kioskRepository: KioskRepository
) {
    fun getMenu(menuNum: Long): Burger {
        var burgerMenus = kioskRepository.getBurgerMenus()
        var cafeMenus = kioskRepository.getCafeMenus()

        return burgerMenus[menuNum.toInt()]
    }

    fun menuList() {
        var burgerMenus = kioskRepository.getBurgerMenus()
        var cafeMenus = kioskRepository.getCafeMenus()


        for (burgerMenu in burgerMenus) {
            burgerMenu.displayInfo()
        }

    }

}