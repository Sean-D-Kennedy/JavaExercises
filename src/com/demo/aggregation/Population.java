package com.demo.aggregation;

import com.demo.encapsulation.Person;

import java.util.ArrayList;
import java.util.List;

public class Population {
    private List<Person> people; // "has-a"

    public Population(){
        people = new ArrayList<>();
    }
    public void addPerson(Person p){
        people.add(p);
    }
    public void deletePerson(Person p){
        people.remove(p);
    }
    public void display(){
        for(Person p:people){
            System.out.println(p);
        }
    }
    public static void main(String[]args){
        Population population = new Population();
        population.addPerson(new Person("joe bloggs", 21));
        population.display();
    }
}
