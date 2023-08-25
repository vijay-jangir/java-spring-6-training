package com.vijayjangir.spring6webapp.bootstrap;

import com.vijayjangir.spring6webapp.domain.Author;
import com.vijayjangir.spring6webapp.domain.Book;
import com.vijayjangir.spring6webapp.domain.Publisher;
import com.vijayjangir.spring6webapp.repositories.AuthorRepository;
import com.vijayjangir.spring6webapp.repositories.BookRepository;
import com.vijayjangir.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("523523");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("Domain Driven Design");
        noEJB.setIsbn("523525");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        Publisher bpb = new Publisher();
        bpb.setName("BPB Publications");
        bpb.setCountry("India");
        Publisher bpbSaved = publisherRepository.save(bpb);


        bpbSaved.getBooks().add(dddSaved);;
        bpbSaved.getBooks().add(noEJBSaved);;

        System.out.println("In Bootstrap");
        System.out.println("Author count:" + authorRepository.count());
        System.out.println("Book count:" + bookRepository.count());
        System.out.println("Publisher count:" + publisherRepository.count());



    }
}
