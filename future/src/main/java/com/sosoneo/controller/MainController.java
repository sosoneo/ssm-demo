package com.sosoneo.controller;

import com.sosoneo.dao.LetterDao;
import com.sosoneo.dto.LetterDto;
import com.sosoneo.entity.Letter;
import com.sosoneo.service.LetterService;
import com.sosoneo.service.impl.LetterServiceImpl;
import com.sosoneo.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by sosoneo on 2018/2/9.
 */

@Controller
public class MainController {

    @Autowired
    LetterService letterService;


    @RequestMapping(value = "/api/index",  method = {RequestMethod.POST,RequestMethod.GET}, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ResponseResult<Object> api_index () {
        ResponseResult<Object> result = new ResponseResult<Object>();
        result.setCode("200");
        result.setDesc("Hello World!");
        return result;
    }

    @RequestMapping(value = "/view/index", method = {RequestMethod.POST, RequestMethod.GET})
    public String view_index () {
        return "index";
    }

    @RequestMapping(value = "/api/letter/addP", method = {RequestMethod.POST,RequestMethod.GET}, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ResponseResult<LetterDto> api_letter_addP (
            @RequestParam("content") String content,
            @RequestParam("email") String email,
            @RequestParam("deliveryTime") String deliveryTimeStr
    ) {
        ResponseResult<LetterDto> result = new ResponseResult<LetterDto>();
        result.setCode("200");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setLenient(false);
            Date deliveryTime;
            deliveryTime = simpleDateFormat.parse(deliveryTimeStr);
            Letter letter = new Letter(content, email, deliveryTime, new Date(), 0, 0);
            LetterDto letterDto = letterService.newLetter(content, email, deliveryTime, new Date());
            result.setData(letterDto);
        } catch (ParseException e) {
            e.printStackTrace();
            result.setCode("100");
        }
        return result;
    }

    @RequestMapping(value = "/api/letter/all", method = {RequestMethod.POST,RequestMethod.GET}, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ResponseResult<List<LetterDto>> api_letter_all () {
        ResponseResult<List<LetterDto>> result = new ResponseResult<List<LetterDto>>();
        result.setCode("200");
        List<LetterDto> list = letterService.getAllLetter();
        result.setData(list);
        return result;
    }

    @RequestMapping(value = "/api/letter", method = {RequestMethod.POST,RequestMethod.GET}, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ResponseResult<LetterDto> api_letter_id (@RequestParam("id") long letterId) {
        ResponseResult<LetterDto> result = new ResponseResult<LetterDto>();
        result.setCode("200");
        LetterDto letterDto = letterService.getLetterById(letterId);
        result.setData(letterDto);
        return result;
    }
}
