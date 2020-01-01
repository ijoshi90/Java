/*
Author : Akshay Joshi
GitHub : https://github.com/ijoshi90
Created on 01-01-2020 at 17:13
*/


public class InsufficientAgruments extends Exception {

    private static final long serialVersionUID = 1L;

    InsufficientAgruments() {
    }

    InsufficientAgruments(String str) {
        super(str);
    }
}
