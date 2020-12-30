package me.kyunghwan.di;

import junit.framework.TestCase;
import org.junit.Test;

public class ContainerServiceTest extends TestCase {

    @Test
    public void testGetObject_BookRepository(){

        BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
        assertNotNull(bookRepository);
    }

    @Test
    public void testGetObject_BookService(){

        BookService bookService = ContainerService.getObject(BookService.class);
        assertNotNull(bookService);
        assertNotNull(bookService.bookRepository);
    }

}