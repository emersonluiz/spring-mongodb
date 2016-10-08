package br.com.emersonluiz.model;

public class Person {

    public String id;

    public String firstName;

    public String middleName;

    public String lastName;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("{id=%s, firstName='%s', middleName='%s', lastName='%s'}", id, firstName, middleName, lastName);
    }
}
