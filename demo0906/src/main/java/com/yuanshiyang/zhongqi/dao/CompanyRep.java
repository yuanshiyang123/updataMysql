package com.yuanshiyang.zhongqi.dao;

import com.yuanshiyang.zhongqi.pojo.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Company：
 *
 * @author: Yuanshiyang
 * @date: 2020/9/6 19:23
 */
public interface CompanyRep extends JpaRepository<Company, Long> {

}
