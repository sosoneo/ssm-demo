package com.sosoneo.dao;

import com.sosoneo.dto.LetterDto;
import com.sosoneo.entity.Letter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by sosoneo on 2018/2/12.
 */
public interface LetterDao {
    /**
     * 新建信件
     * @param letter 信件实体
     * @return
     */
    int insertLetter(Letter letter);

    /**
     * 获取全部信件
     * @return
     */
    List<Letter> queryAll();

    /**
     * 根据id获取信件
     * @param letterId 信件id
     * @return
     */
    Letter queryById(@Param("letterId") long letterId);
}
