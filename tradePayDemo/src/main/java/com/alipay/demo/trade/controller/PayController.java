package com.alipay.demo.trade.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

    private static Log log = LogFactory.getLog(PayController.class);

    @RequestMapping("/hello")
    public String hello() {
        log.info("into test_pay.jsp");
        return "test_pay.jsp";
    }

    @RequestMapping("/index")
    public String index() {
        log.info("into index.html");
        return "index.html";
    }

    @RequestMapping("/trade_pay")
    public String trade_pay() {
        log.info("into trade_pay.jsp");
        return "trade_pay.jsp";
    }

    @RequestMapping("/trade_precreate")
    public String trade_precreate() {
        log.info("into trade_precreate.jsp");
        return "trade_precreate.jsp";
    }

    @RequestMapping("/trade_query")
    public String trade_query() {
        log.info("into trade_query.jsp");
        return "trade_query.jsp";
    }

    @RequestMapping("/trade_refund")
    public String trade_refund() {
        log.info("into trade_refund.jsp");
        return "trade_refund.jsp";
    }

}
