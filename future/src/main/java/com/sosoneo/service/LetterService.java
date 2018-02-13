package com.sosoneo.service;

import com.sosoneo.dto.LetterDto;
import com.sosoneo.entity.Letter;

import java.util.Date;
import java.util.List;

/**
 * Created by sosoneo on 2018/2/12.
 */
public interface LetterService {
    /**
     * 创建一个新的信件
     * @param content 信件内容
     * @param email 信件送达地址
     * @param deliveryTime 信件目标送达时间
     * @param createTime 信件创建时间
     * @return
     */
    LetterDto newLetter(String content, String email, Date deliveryTime, Date createTime);

    /**
     * 获取全部信件
     * @return
     */
    List<LetterDto> getAllLetter();

    /**
     * 根据id获取信件
     * @param letterID 信件id
     * @return
     */
    LetterDto getLetterById(long letterID);

}
