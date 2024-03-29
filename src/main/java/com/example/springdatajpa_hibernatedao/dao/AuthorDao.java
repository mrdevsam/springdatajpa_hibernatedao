package com.example.springdatajpa_hibernatedao.dao;

import com.example.springdatajpa_hibernatedao.model.Author;

public interface AuthorDao {
	Author getById(Long id);
	Author findAuthorByName(String name);
	Author saveNewAuthor(Author author);
	Author updateAuthor(Author author);
	void deleteAuthorById(Long id);
}
