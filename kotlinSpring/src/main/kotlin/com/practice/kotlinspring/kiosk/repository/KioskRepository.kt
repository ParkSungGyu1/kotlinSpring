package com.practice.kotlinspring.kiosk.repository

import com.practice.kotlinspring.kiosk.domain.burger.Burger
import com.practice.kotlinspring.kiosk.domain.burger.LotteBurger
import com.practice.kotlinspring.kiosk.domain.burger.ShackBurger
import com.practice.kotlinspring.kiosk.domain.cafe.ACafe
import com.practice.kotlinspring.kiosk.domain.cafe.BCafe
import com.practice.kotlinspring.kiosk.domain.cafe.Cafe
import org.springframework.stereotype.Repository

@Repository
class KioskRepository {
    fun getBurgerMenus(): ArrayList<Burger> {
        var burgerMenus = ArrayList<Burger>()

        burgerMenus.add(LotteBurger("롯데버거1",1000,"맛있는 롯데버거 1"))
        burgerMenus.add(LotteBurger("롯데버거2",2000,"맛있는 롯데버거 2"))
        burgerMenus.add(LotteBurger("롯데버거3",3000,"맛있는 롯데버거 3"))
        burgerMenus.add(LotteBurger("롯데버거4",4000,"맛있는 롯데버거 4"))

        burgerMenus.add(ShackBurger("쉑쉑버거1",1000,"맛있는 쉑쉑버거 1"))
        burgerMenus.add(ShackBurger("쉑쉑버거2",2000,"맛있는 쉑쉑버거 2"))
        burgerMenus.add(ShackBurger("쉑쉑버거3",3000,"맛있는 쉑쉑버거 3"))
        burgerMenus.add(ShackBurger("쉑쉑버거4",4000,"맛있는 쉑쉑버거 4"))

        return burgerMenus
    }

    fun getCafeMenus(): ArrayList<Cafe> {
        var cafeMenus = ArrayList<Cafe>()

        cafeMenus.add(ACafe("A커피1", 1000, "시원한 A커피1"))
        cafeMenus.add(ACafe("A커피2", 2000, "시원한 A커피2"))
        cafeMenus.add(ACafe("A커피3", 3000, "시원한 A커피3"))
        cafeMenus.add(ACafe("A커피4", 4000, "시원한 A커피4"))

        cafeMenus.add(BCafe("B커피1", 1000, "시원한 B커피1"))
        cafeMenus.add(BCafe("B커피2", 2000, "시원한 B커피2"))
        cafeMenus.add(BCafe("B커피3", 3000, "시원한 B커피3"))
        cafeMenus.add(BCafe("B커피4", 4000, "시원한 B커피4"))

        return cafeMenus
    }
}