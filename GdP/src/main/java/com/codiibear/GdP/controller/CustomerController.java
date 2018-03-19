package com.codiibear.GdP.controller;

import com.codiibear.GdP.biz.CustomerBiz;
import com.codiibear.GdP.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by codiibear on 2018/3/19.
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerBiz customerBiz;

    @RequestMapping(value = "/all")
    public ModelAndView all(){
        List<Customer>  customerList = customerBiz.findAll();
        ModelAndView mav = new ModelAndView();
        mav.addObject("customerlist",customerList);
        mav.setViewName("customerlist");
        return mav;
    }
}
