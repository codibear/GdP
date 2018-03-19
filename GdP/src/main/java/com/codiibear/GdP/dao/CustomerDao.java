package com.codiibear.GdP.dao;

import com.codiibear.GdP.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by codiibear on 2018/3/19.
 */
@Repository
public interface CustomerDao {
    List<Customer> findAll();
}
