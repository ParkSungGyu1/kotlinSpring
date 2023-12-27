package com.practice.kotlinspring.kiosk.domain.order

import com.practice.kotlinspring.kiosk.domain.burger.LotteBurger
import com.practice.kotlinspring.kiosk.domain.burger.ShackBurger
import com.practice.kotlinspring.kiosk.domain.cafe.ACafe
import com.practice.kotlinspring.kiosk.domain.cafe.BCafe

/**
 * 추상화가 되어있지 않을 경우
 */

class NAOrder {


    fun orderLotteBurger(lotteBurger: LotteBurger){
        TODO("롯데리아 주문하는 어떤 로직")
    }

    fun orderShackBurger(shackBurger: ShackBurger){
        TODO("쉑쉑버거 주문하는 어떤 로직")
    }

    fun orderACafe(aCafe: ACafe){
        TODO("ACafe 주문하는 어떤 로직")
    }

    fun orderBCafe(bCafe: BCafe){
        TODO("BCafe 주문하는 어떤 로직")
    }

    /**
     * 매장이 1000개가 넘어가면 어떻게 할래???
     * 주문뿐만 아니라 취소 수정까지 하려면 * 3~4배 증가
     */
}