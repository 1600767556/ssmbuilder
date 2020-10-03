package com.shaoshao.dao;

import com.shaoshao.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2020/10/3 12:49
 */
public interface BookMapper {
    int addBook (Books books);
    int deleteBookById (@Param("bookId") int id);
    int updateBook(Books books);
    Books querybookById(@Param("bookId") int id);
    List<Books> queryBook();

}
