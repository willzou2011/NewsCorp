package com.newscorp.truncate.controller;

import com.newscorp.truncate.service.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: willzou
 * Created on 7/19/17.
 */

@RestController
public class SubscriptionController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/subscribe", method = RequestMethod.GET)
    public String subscribe(HttpServletRequest request){

        String orderDetails = getOrderDetails(request);
        String truncatedOrderDetails = StringUtils.truncate(orderDetails, StringUtils.DEFAULT_TRUNCATE_LENGTH);
        logger.debug(truncatedOrderDetails);
        //the return string content is not specified
        return truncatedOrderDetails;
    }

    private String getOrderDetails(HttpServletRequest request){
        return request.getParameter("orderDetails");
    }
}
