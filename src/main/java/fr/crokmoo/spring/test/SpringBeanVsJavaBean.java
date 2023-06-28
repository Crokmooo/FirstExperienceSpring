package fr.crokmoo.spring.test;

import java.io.Serializable;

class Pojo { //Plain Old Java Object
    // No constraints
    // Any Java Object is a POJO

    private String text;
    private int number;

    public String toString() {
        return text + ":" + number;
    }
}

class JavaBean implements Serializable { //EJB (Entreprise Java Bean)
    // Have public default (no argument) constructors
    // Allow access to their properties using getter et setter methods
    // Implement java.io.Serializable

    //1: public no-arg constructor
    public JavaBean() {
    }
    private String text;
    private int number;

    //2: getters and setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class SpringBeanVsJavaBean {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        System.out.println(pojo);
    }
}