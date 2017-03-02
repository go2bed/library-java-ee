package com.epam.chadov.api.persistence.dao.impl;

import com.epam.chadov.api.persistence.dao.BookDao;
import com.epam.chadov.api.persistence.dao.DaoQualifier;
import com.epam.chadov.api.persistence.dao.DaoType;
import com.epam.chadov.api.persistence.entities.Book;

import javax.ejb.Stateless;
import java.util.Collections;
import java.util.List;

/**
 * @author Andrey_Chadov on 3/2/2017.
 */
@Stateless
@DaoQualifier(type = DaoType.BOOK_DAO)
public class BookDaoImpl implements BookDao{

    @Override
    public Long create(Book entity) {
        return 0L;
    }

    @Override
    public Long update(Book entity) {
        return 0L;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public Book find(Long key) {
        return new Book();
    }

    @Override
    public List<Book> getAllBooks() {
        return Collections.emptyList();
    }
}
