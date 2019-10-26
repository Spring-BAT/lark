package com.google.book;

public class Dictionary extends Book {
    private int pingyinPages;

    public Dictionary(String bookid, String bookname, int pages,int pingyinPages) {
        /*super()必须写在构造方法的第一行，而且每个构造方法只能有一个super(),把（）作为参数传递给父类的构造方法*/
        super(bookid, bookname, pages);
        this.pingyinPages = pingyinPages;
    }

    public int getPingyinPages() {
        return pingyinPages;
    }

    public void setPingyinPages(int pingyinPages) {
        this.pingyinPages = pingyinPages;
    }
}
