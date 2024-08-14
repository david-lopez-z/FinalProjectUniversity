package org.university;

abstract public class Person {
    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    protected String getName(){
        return this.name;
    }

    protected int getId(){return this.id;}
}
