package com.practice.kotlinspring.kiosk.domain.order

import com.practice.kotlinspring.kiosk.domain.burger.Burger
import com.practice.kotlinspring.kiosk.domain.cafe.Cafe

/**
 * 추상화가 되어있을 경우
 */
class AOrder {
    fun orderBurger(burger: Burger){
        TODO("롯데버거든 쉑쉑버거든 상관없이 주문 가능!")
        TODO("Burger라는 추상클래스를 상속받은 녀석은 다 들어와!")
    }

    fun orderCafe(burger: Cafe){
        TODO("ACafe든 BCafe든 상관없이 주문 가능!")
        TODO("Cafe라는 추상클래스를 상속받은 녀석은 다 들어와!")
    }


    /**
     * 로직 감소 및 관리 수월
     * 생각해볼것 :: orderBurger와 orderCafe를 하나의 메서드인 order로 합칠 수 없을까?
     */
}