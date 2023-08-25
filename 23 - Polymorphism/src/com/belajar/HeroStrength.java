package com.belajar;

public class HeroStrength extends Hero {
  String type = "Strength";

  HeroStrength(String nama) {
    super(nama);
  }

  @Override
  void display() {
    System.out.println("\nName \t: " + this.nama);
    System.out.println("Type \t: " + this.type);
  }
}
