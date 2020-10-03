package com.shaoshao.service;

import com.shaoshao.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2020/10/3 14:42
 */
public interface BookService {
    int addBook (Books books);
    int deleteBookById ( int id);
    int updateBook(Books books);
    Books querybookById( int id);
    List<Books> queryBook();
}
