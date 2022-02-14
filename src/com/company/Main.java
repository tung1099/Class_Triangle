package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle("Blue", false, 7,8,9);
        System.out.println(triangle);
    }
}
