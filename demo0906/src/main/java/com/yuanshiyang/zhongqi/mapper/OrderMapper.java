package com.yuanshiyang.zhongqi.mapper;

import com.yuanshiyang.zhongqi.pojo.OrderHumanName;
import com.yuanshiyang.zhongqi.pojo.OrderHumanNameParms;
import org.mapstruct.Mapper;

/**
 * OrderMapper：
 *
 * @author: Yuanshiyang
 * @date: 2020/9/6 14:35
 */
@Mapper
public interface OrderMapper {

    OrderHumanNameParms duiying(OrderHumanName orderHumanName);
}
