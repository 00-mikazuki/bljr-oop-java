package com.belajar;

public class Main {
  public static void main(String[] args) {
    Hero hero1 = new Hero("Esmeralda", 10); // memakai constructor superclass
    hero1.display();

    HeroStrength hero2 = new HeroStrength("ucup", 10);
    hero2.display();

    HeroStrength hero3 = new HeroStrength("otong");
    hero3.display();
  }
}
