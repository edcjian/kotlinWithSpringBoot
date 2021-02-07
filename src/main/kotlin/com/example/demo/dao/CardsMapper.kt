package com.example.demo.dao;

import com.example.demo.entity.Cards;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xxxxxx
 * @since 2021-01-30
 */
@Mapper
interface CardsMapper : BaseMapper<Cards>
