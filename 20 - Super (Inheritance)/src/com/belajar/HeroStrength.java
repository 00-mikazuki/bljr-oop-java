package com.belajar;

// this.name akan mengakses atribut / method name jika ada di class ini. 
// jika tidak ada maka akan mengakses atribut name dari superclass.

// super.name akan selalu mengakses atribut / method di superclass.
public class HeroStrength extends Hero {
  String name = "Class Strength";

  void display() {
    System.out.println("Ini adalah " + this.name);
    this.dummyMethod();
  }

  void displaySuper() {
    System.out.println("Ini adalah " + super.name);
    super.dummyMethod();
  }

  void dummyMethod() {
    System.out.println("Method ini ada di subclass");
  }
}
