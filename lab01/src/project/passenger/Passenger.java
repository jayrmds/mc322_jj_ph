package project.passenger;

import project.person.Person;

public class Passenger extends Person {
    
    private String destination;
    private String name;

    public Passenger(String a_name){
        this.destination = "";
        this.name = a_name;
    }
    // @Override
    // public void performRole();

    @Override
    public void performRole() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'performRole'");
    }
}