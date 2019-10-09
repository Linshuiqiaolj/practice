package com.alipay.demo.trade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Linshuiqiao
 * @ClassName: PayController
 * @description: TODO
 * @date 2019年10月10日 0:20
 * @version: 1.0
 **/
@Controller
@RequestMapping("/view")
public class PayController {

    @RequestMapping("/hello")
    public String hello() {
        return "test_pay";
    }

}
