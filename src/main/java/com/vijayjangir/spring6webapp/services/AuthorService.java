package com.vijayjangir.spring6webapp.services;

import com.vijayjangir.spring6webapp.domain.Author;
import com.vijayjangir.spring6webapp.domain.Book;

public interface AuthorService {
    Iterable<Author> findAll();
}
