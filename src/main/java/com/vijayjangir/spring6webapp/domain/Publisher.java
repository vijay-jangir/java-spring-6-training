package com.vijayjangir.spring6webapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;

//    @OneToMany(mappedBy = "publishers")
//    private Set<Book> books = new HashSet<>();

    @Override
    public String toString() {
        return "Publisher{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", country='" + country + '\'' +
//            ", books=" + books +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Publisher publisher)) {
            return false;
        }

        return getId() != null ? getId().equals(publisher.getId()) : publisher.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public Set<Book> getBooks() {
//        return books;
//    }
//
//    public void setBooks(Set<Book> books) {
//        this.books = books;
//    }
}
