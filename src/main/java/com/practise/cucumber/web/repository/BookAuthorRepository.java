package com.practise.cucumber.web.repository;

import com.practise.cucumber.support.jpa.CustomJpaRepository;
import com.practise.cucumber.web.entity.Author;
import com.practise.cucumber.web.entity.Book;
import com.practise.cucumber.web.entity.BookAuthor;

/**
 * <b>BookAuthor Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookAuthorRepository extends CustomJpaRepository<BookAuthor, Long> {

	public BookAuthor findByBookAndAuthor(Book book, Author author);

	public void deleteByAuthor(Author author);

	public void deleteByBook(Book book);
}
