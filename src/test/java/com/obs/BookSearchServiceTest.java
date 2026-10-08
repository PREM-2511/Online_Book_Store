package com.obs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchServiceTest {

    @Test
    void validBookTitleShouldReturnTrue() {
        BookSearchService service = new BookSearchService();

        assertTrue(service.searchBook("Java Programming"));
    }

    @Test
    void emptyBookTitleShouldReturnFalse() {
        BookSearchService service = new BookSearchService();

        assertFalse(service.searchBook(""));
    }
}