package com.example.newscorp.truncate.controller;

import com.example.newscorp.truncate.service.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by willzou on 7/19/17.
 */

@Controller
public class SubscriptionController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/subscribe1", method = RequestMethod.GET)
    public String subscribe(HttpServletRequest request){
        String orderDetails = getOrderDetails(request);

        String truncatedOrderDetails = StringUtils.truncate(orderDetails, 250);


        logger.debug(truncatedOrderDetails);
        return truncatedOrderDetails;
    }

    private String getOrderDetails(HttpServletRequest request){
        return "";
    }


}
