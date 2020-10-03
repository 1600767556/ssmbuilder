package com.shaoshao.service;

import com.shaoshao.dao.BookMapper;
import com.shaoshao.pojo.Books;

import java.util.List;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2020/10/3 14:44
 */
public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books querybookById(int id) {
        return bookMapper.querybookById(id);
    }

    public List<Books> queryBook() {
        return bookMapper.queryBook();
    }
}
