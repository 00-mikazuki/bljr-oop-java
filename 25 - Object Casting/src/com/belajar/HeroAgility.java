package com.belajar;

public class HeroAgility extends Hero {
  private String type;

  HeroAgility(String name, double health) {
    super(name, health);
    this.type = "Agility";
  }

  public void display() {
    System.out.println(this.getName() + " is a " + this.type + " Hero");
  }
}
