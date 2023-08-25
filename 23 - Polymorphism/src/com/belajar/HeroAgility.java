package com.belajar;

public class HeroAgility extends Hero {
  String type = "Agility";
  
  HeroAgility(String nama) {
    super(nama);
  }

  @Override
  void display() {
    System.out.println("\nName \t: " + this.nama);
    System.out.println("Type \t: " + this.type);
  }

  void showoff() {
    System.out.println("Saya hero Agility!!!");
  }
}
