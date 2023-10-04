package com.learn.ConstructorOverloading;

public class StudentApp {

	public static void main(String[] args) {
		//called for zero parameter constructor
		Student s1 = new Student();
		//called for one parameter constructor
		Student s2 = new Student(10);
		//called for two parameter constructor
		Student s3 = new Student(20,20);
		//called for three parameter constructor
		Student s4 = new Student(25,"jaga",30);

		// TODO Auto-generated method stub

	}

}
