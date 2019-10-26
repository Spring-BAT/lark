package com.google.book;
/*
* description:书本类
* Date:10-26
* author:Super-Wu
* */
public class Book {
    private String bookid;
    private String bookname;
    protected int pages;

    public Book(String bookid, String bookname, int pages) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.pages = pages;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
