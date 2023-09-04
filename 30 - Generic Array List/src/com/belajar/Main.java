package com.belajar;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Hero hero1 = new Hero("Ucup", 100);
    Hero hero2 = new Hero("Otong", 20);
    AgilityHero agilityHero = new AgilityHero("Johny", 500);
    IntelHero intelHero = new IntelHero("Smith", 5);

    // Array sederhana
    Hero[] kumpulanHero = new Hero[3];

    // masukkan anggota 
    kumpulanHero[0] = hero1;
    kumpulanHero[1] = hero2;
    kumpulanHero[2] = agilityHero;
    // kumpulanHero[3] = intelHero; // tidak bisa dilakukan karena array fix


    for(Hero hero : kumpulanHero) {
      hero.display();
    }
    
    // Array List
    ArrayList<Hero> listHero = new ArrayList<Hero>();
    
    listHero.add(hero1);
    listHero.add(hero2);
    listHero.add(agilityHero);
    listHero.add(intelHero);

    System.out.println("\nArrayList");
    for(Hero hero : listHero) {
      hero.display();
    }

    // reference
    agilityHero.setName("Dudung");

    System.out.println("\nArrayList");
    for(Hero hero : listHero) {
      hero.display();
    }

    System.out.println("\nArray");
    for(Hero hero : kumpulanHero) {
      hero.display();
    }
  }
}
