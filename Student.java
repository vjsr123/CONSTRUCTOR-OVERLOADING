package com.learn.ConstructorOverloading;

public class Student {
	public Student()
	{
		System.out.println("Zero parameterized Constructor");
	}
	public Student(int x)
	{
		System.out.println("One parameterized Constructor");
	}
	public Student(int x,float y)
	{
		System.out.println("Two parameterized Constructor");
	}
	public Student(int x,String y,float z)
	{
		System.out.println("Three parameterized Constructor");
	}

}
