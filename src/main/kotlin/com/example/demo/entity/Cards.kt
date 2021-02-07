package com.example.demo.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import java.io.Serializable
/**
 * <p>
 * 
 * </p>
 *
 * @author xxxxxx
 * @since 2021-01-30
 */
class Cards : Serializable {


    /**
     * 图书编号
     */
    @TableId(value = "bid", type = IdType.AUTO)
    var bid: Int? = null

    /**
     * 图书名称
     */
    var bname: String? = null

    /**
     * 图书作者
     */
    var bauthor: String? = null


    override fun toString(): String {
        return "Cards{" +
        "bid=" + bid +
        ", bname=" + bname +
        ", bauthor=" + bauthor +
        "}"
    }
}
