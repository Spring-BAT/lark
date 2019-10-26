package com.google.book;

import com.google.book.Dictionary;

public class Bookmanager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","XinHua",90,3);
        System.out.println(dictionary.getBookid());
        System.out.println(dictionary.getBookname());
        System.out.println(dictionary.getPingyinPages());
    }
}
