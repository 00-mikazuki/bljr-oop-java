package com.belajar;

public class HeroIntel extends Hero {
  public String type;

  HeroIntel(String name, double health) {
    super(name, health);
    this.type = "Intel";
  }

  public void display() {
    System.out.println(this.getName() + " is an " + this.type + " Hero");
  }

  public void castMagic() {
    System.out.println("Mengeluarkan Mejik");
  }
}
