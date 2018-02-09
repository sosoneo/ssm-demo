package com.sosoneo.controller;

import com.sosoneo.util.ResponseResult;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sosoneo on 2018/2/9.
 */

@Controller
public class MainController {
    @RequestMapping(value = "/api/index",  method = {RequestMethod.POST,RequestMethod.GET}, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ResponseResult<Object> api_index () {
        ResponseResult<Object> result = new ResponseResult<Object>();
        result.setCode("200");
        result.setDesc("Hello World!");
        return result;
    }

    @RequestMapping(value = "/view/index", method = {RequestMethod.POST, RequestMethod.GET})
    public java.lang.String view_index () {
        return "index";
    }
}
