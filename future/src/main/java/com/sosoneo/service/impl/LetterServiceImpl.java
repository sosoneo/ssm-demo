package com.sosoneo.service.impl;

import com.sosoneo.dao.LetterDao;
import com.sosoneo.dto.LetterDto;
import com.sosoneo.entity.Letter;
import com.sosoneo.enums.LetterJurisdictionEnum;
import com.sosoneo.enums.LetterStateEnum;
import com.sosoneo.service.LetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sosoneo on 2018/2/12.
 */
@Service
public class LetterServiceImpl implements LetterService {
    @Autowired
    LetterDao letterDao;

    @Override
    @Transactional
    public LetterDto newLetter(String content, String email, Date deliveryTime, Date createTime) {
        try {
            Letter letter = new Letter(content, email, deliveryTime, createTime, 0, 0);
            letterDao.insertLetter(letter);
            long letterId = letter.getLetterId();
            LetterDto letterDto = new LetterDto(letterId, LetterStateEnum.WAIT_SEND, LetterJurisdictionEnum.PRIVATE, letter);
            return letterDto;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional
    public List<LetterDto> getAllLetter() {
        try {
            List<Letter> list = letterDao.queryAll();
            List<LetterDto> dtoList = new ArrayList<LetterDto>();
            for (Letter letter:list) {
                LetterDto letterDto = new LetterDto(letter.getLetterId(), LetterStateEnum.stateOf(letter.getState()), LetterJurisdictionEnum.stateOf(letter.getJurisdiction()), letter);
                dtoList.add(letterDto);
            }
            return dtoList;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional
    public LetterDto getLetterById(long letterID) {
        Letter letter = letterDao.queryById(letterID);
        LetterDto letterDto = new LetterDto(letter.getLetterId(), LetterStateEnum.stateOf(letter.getState()), LetterJurisdictionEnum.stateOf(letter.getJurisdiction()), letter);
        return letterDto;
    }
}
