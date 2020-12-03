package com.company;

public class Account {
    String id;
    String name;
    int balance = 0;

    public Account(String id,String name){
        setId(id);
        setName(name);
    }
    public Account(String id, String name, int balance){
        setId(id);
        setName(name);
        setBalance(balance);
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public int credit(int amount){
        setBalance(getBalance()+amount);
        return getBalance();
    }

    public int debit(int amount){
        if (getBalance()>=amount){
            setBalance(getBalance()-amount);
        } else {
            System.out.println("Amount exceeded");
        }
        return getBalance();
    }

    public int transferTo(Account another, int amount){
        if (getBalance()>=amount){
            setBalance(getBalance()-amount);
            another.setBalance(another.getBalance()+amount);
        } else {
            System.out.println("Amount exceeded");
        }
        return getBalance();
    }

    public String toString(){
        return "Account[id="+getId()+", name="+getName()+", balance="+getBalance()+"]";
    }
}
