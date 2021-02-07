package com.example.demo.controller

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.example.demo.dao.CardsMapper
import com.example.demo.entity.Cards
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/hello")
class HelloController {
    @Autowired
   lateinit var cardsMapper:CardsMapper
   //todo 注意要lateInit



    @RequestMapping("firsts")
    fun firsts(@RequestParam("name") name: String, @PathVariable("id") id: Long): Cards {
        var names:String=name
        var ids: Long =id
////        return "data is $names id is $id"

var cards:Cards=cardsMapper.selectById(1)
return cards
//        return Pair(names,ids)
    }
    @GetMapping("/pot")
    fun pot(): List<Cards> {
var lists:List<Cards> =cardsMapper.selectList(QueryWrapper<Cards>().eq("bid", 4))
        return lists
    }
    @GetMapping("/sends")
    fun sends(): MutableList<Cards>? {
        var idList:MutableList<Int> = mutableListOf()
        idList.add(4)
        idList.add(5)
        idList.add(6)
        var lists: MutableList<Cards>? =cardsMapper.selectBatchIds(idList)
        return lists
//cardsMapper.insert(cards)
//        return "success"
    }
    @GetMapping("/rop")
    fun rop(): MutableList<Map<String, Any>>? {

        val page: Page<Cards> = Page<Cards>(1, 6)
        val mapIPage: IPage<Map<String, Any>> = cardsMapper.selectMapsPage(page,
                QueryWrapper<Cards>())

      return mapIPage.records
    }
}