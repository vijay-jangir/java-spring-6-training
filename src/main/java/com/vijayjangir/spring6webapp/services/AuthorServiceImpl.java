package com.vijayjangir.spring6webapp.services;

import com.vijayjangir.spring6webapp.domain.Author;
import com.vijayjangir.spring6webapp.domain.Book;
import com.vijayjangir.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
