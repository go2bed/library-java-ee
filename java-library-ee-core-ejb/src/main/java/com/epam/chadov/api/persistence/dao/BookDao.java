package com.epam.chadov.api.persistence.dao;

import com.epam.chadov.api.persistence.entities.Book;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Andrey_Chadov on 3/2/2017.
 */
public interface BookDao  extends Dao<Book, Long>{

    List<Book> getAllBooks();

}
