package com.codiibear.GdP.biz.impl;

import com.codiibear.GdP.biz.CustomerBiz;
import com.codiibear.GdP.dao.CustomerDao;
import com.codiibear.GdP.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by codiibear on 2018/3/19.
 */
@Service
public class CustomerBizImpl implements CustomerBiz {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
