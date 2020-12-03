package com.company;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return getFirstName()+" "+getLastName();
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return getSalary()*12;
    }
    public int raiseSalary(int precent){
        return getSalary() + (precent * getSalary() / 100);
    }

    public String toString(){
        return "Employee[id="+getId()+", name="+getFirstName()+" "+getLastName()+", salary="+getSalary()+"]";
    }


}
