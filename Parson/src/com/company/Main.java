package com.company;

public class Main {

    public static void main(String[] args)
    {
	    Person person = new Person();
	    person.setFirstName("");
	    person.setLastName("");
	    person.setAge(10);
        System.out.println("first name: " + person.getFirstName());
        System.out.println("last name: " + person.getLastName());
        System.out.println("age: " + person.getAge());
        System.out.println("full name: " + person.getFullName());
        System.out.println("teen: " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("first name: " + person.getFirstName());
        System.out.println("last name: " + person.getLastName());
        System.out.println("age: " + person.getAge());
        System.out.println("full name: " + person.getFullName());
        System.out.println("teen: " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("first name: " + person.getFirstName());
        System.out.println("last name: " + person.getLastName());
        System.out.println("age: " + person.getAge());
        System.out.println("full name: " + person.getFullName());
    }
}
