package com.beratoztas.practice;

public class TestClass {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Hello from Lambda");
        r.run();
	}
}
