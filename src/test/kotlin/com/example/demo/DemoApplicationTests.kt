package com.example.demo

import com.example.demo.dao.CardsMapper
import com.example.demo.entity.Cards
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    lateinit var cardsMapper:CardsMapper
    //todo cao,强行跑的通
    fun findWhere(str: String, findChar: Char): Pair<Int, Int> {
        var index = -1
        var count = 0

        return Pair(index, count)
    }

    @Test
    fun contextLoads() {
//        val (index, count) = findWhere("abcabcabcabc", 'c')
//        println(index)
        var cards: Cards =cardsMapper.selectById(1)
        println(cards)
//        cards.map(::println)
    }

}
