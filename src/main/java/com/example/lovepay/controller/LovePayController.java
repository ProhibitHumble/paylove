package com.example.lovepay.controller;

import com.example.lovepay.service.LovePayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：szz
 * @date ：Created in 2021/9/14 9:07
 * @description：
 * @modified By：
 */
@RestController
@RequestMapping("/lovepay")
public class LovePayController {

    @Autowired
    private LovePayService lovePayService;

    @RequestMapping(value = "getboy",method = RequestMethod.POST)
    public String getboy(){
        return lovePayService.getboy();
    }
}
