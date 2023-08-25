package com.vijayjangir.spring6webapp.services;

import com.vijayjangir.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
