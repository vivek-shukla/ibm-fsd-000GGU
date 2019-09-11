package com.example.FSD_11_09_2019.populate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.FSD_11_09_2019.entity.Author;
import com.example.FSD_11_09_2019.entity.Book;
import com.example.FSD_11_09_2019.entity.Publisher;
import com.example.FSD_11_09_2019.repository.AuthorRepository;
import com.example.FSD_11_09_2019.repository.BookRepository;
import com.example.FSD_11_09_2019.repository.PublisherRepository;

@Component
public class PopulateClass implements ApplicationListener<ContextRefreshedEvent> {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;
    
    @Autowired
	public PopulateClass(BookRepository bookRepository, AuthorRepository authorRepository,
			PublisherRepository publisherRepository) {
		super();
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
		
	}
     
	private void init()
	{
		Publisher publisher = new Publisher("TMH","221 bb street");
		publisherRepository.save(publisher);
		
		Author daveBrown = new Author("Dan", "Brown");
		Author paulo = new Author("Paulo", "Coelho");
		Book book = new Book("da vinci code", "123", publisher);
		Book book2 = new Book("tHE alchemist", "1234", publisher);
		daveBrown.getBook().add(book);
		paulo.getBook().add(book);
		book.getAuthors().add(daveBrown);
		book.getAuthors().add(paulo);
		book2.getAuthors().add(paulo);
		authorRepository.save(paulo);
		authorRepository.save(daveBrown);
		bookRepository.save(book);
		bookRepository.save(book2);
		
	}
}
