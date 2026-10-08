package com.obs;

public class BookSearchService {

    public boolean searchBook(String title) {
        return title != null && !title.isBlank();
    }
}