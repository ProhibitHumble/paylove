package com.example.lovepay.service;

import com.example.lovepay.mapper.LovePayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：szz
 * @date ：Created in 2021/9/13 18:13
 * @description：
 * @modified By：
 */
@Service
public class LovePayService {

    @Autowired
    private LovePayMapper lovePayMapper;

    public String getboy(){
        String boy = lovePayMapper.getboy();
        return boy;
    }
}
