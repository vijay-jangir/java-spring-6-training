package com.vijayjangir.spring6webapp.repositories;

import com.vijayjangir.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
