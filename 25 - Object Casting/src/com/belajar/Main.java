package com.belajar;

public class Main {
  public static void main(String[] args) {
    // object dengan class HeroIntel
    HeroIntel hero1 = new HeroIntel("Ucup", 100);
    hero1.display();
    hero1.castMagic();

    // up casting
    Hero heroUp = (Hero) hero1;
    heroUp.display();

    // ada field yang hilang
    // System.out.println(heroUp.type);
    // heroUp.castMagic();


    Hero heroReg = new Hero("Otong", 100);
    heroReg.display();

    // down casting dari superclass ke subclass, tidak bisa
    // HeroAgility heroDown = (HeroAgility) heroReg;
    // heroDown.display();


    // coba dari intel ke hero biasa lalu balikan ke intel
    HeroIntel hero2 = (HeroIntel) heroUp;
    // berhasil di down casting, dengan syarat bentuk awalnya adalah sama
    hero2.display();
    System.out.println(hero2.type);
    hero2.castMagic();
  }
}
