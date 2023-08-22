package com.belajar;

public class HeroIntelligent extends Hero {
  String type = "Intelligent";
  // subclass constructor
  HeroIntelligent(String nameInput, double attackInput, double healthInput) {
    super(nameInput, attackInput, healthInput);
  }

  @Override
  void display() {
    super.display();
    System.out.println("Type: " + this.type);
  }

  @Override
  void attack(Hero enemy) {
    System.out.println("\n" + this.name + " attack " + enemy.name);
    enemy.takeDamage(this.attackPower * 1.5);
  }
}
