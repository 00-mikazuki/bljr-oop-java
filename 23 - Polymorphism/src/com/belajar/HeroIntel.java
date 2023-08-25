package com.belajar;

public class HeroIntel extends Hero {
  String type = "Intel";
  
  HeroIntel(String nama) {
    super(nama);
  }

  @Override
  void display() {
    System.out.println("\nName \t: " + this.nama);
    System.out.println("Type \t: " + this.type);
  }
}
