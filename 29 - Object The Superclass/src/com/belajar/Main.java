package com.belajar;

public class Main {
  public static void main(String[] args) {
    Hero hero1 = new Hero("Ucup");

    hero1.display();

    // class Object sebagai superclass dari semua class yg ada di java
    Object hero2 = hero1;
    String hero2_str = hero2.toString();
    String hero1_str = hero1.toString();
    System.out.println(hero2_str);
    System.out.println(hero1_str);

    // salah satu method dari class method adalah equals
    System.out.println(hero1.equals(hero2));

    // contoh dari equals
    Hero hero3 = new Hero("Otong");
    Hero hero4 = new Hero("Otong");
    Hero hero5 = new Hero("Otong");

    Jagoan hero6 = new Jagoan("Otong");
    hero6.display();

    // override equals di class Hero
    System.out.println(hero3.equals(hero4));
    System.out.println(hero3.equals(hero1));

  }
}
