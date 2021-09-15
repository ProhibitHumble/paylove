package com.example.lovepay;

import com.example.lovepay.mapper.LovePayMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LovepayApplicationTests {

    @Autowired
    private LovePayMapper lovePayMapper;

    @Test
    void contextLoads() {
    }

    //@Test
    //void test01(){
    //    System.out.println(lovePayMapper.getboy());
    //}

}
