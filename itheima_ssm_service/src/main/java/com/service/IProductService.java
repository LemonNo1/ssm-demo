package com.service;

import com.heima.domain.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll() throws Exception;
}
