package com.codiibear.GdP.biz;

import com.codiibear.GdP.domain.Customer;

import java.util.List;

/**
 * Created by codiibear on 2018/3/19.
 */
public interface CustomerBiz {
    List<Customer> findAll();
}
