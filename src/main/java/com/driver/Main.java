package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly r=new RWOnly();
       // r.name="abhi";//java: name has private access in com.driver.RWOnly
        r.setName("Abhishek");
        System.out.println(r.getName());
    }
  
}