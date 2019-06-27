package com.dao;

import com.heima.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductDao {

    @Select("select * from product")
    List<Product> findAll() throws Exception;
}
