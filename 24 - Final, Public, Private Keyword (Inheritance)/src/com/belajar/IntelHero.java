package com.belajar;

// public akan terbuka untuk semuanya
public class IntelHero extends Hero {
  
  IntelHero(String name, double health) {
    super(name, health);
  }

  // override getHealth()
  // karena di superclass method public, maka di subclass harus public
  // public double getHealth() {
  //   return this.health; // tidak bisa diakses karena health pada superclass bervisibility private
  // }

  // visibility harus sama dengan superclass
  public void display() {
    System.out.println(this.name + " mempunyai banyak " + this.getHealth());
  }

  // coba override final setter, tidak bisa dilakukan
  // void setHealth(double newHealth) {
  //   System.out.println("mencoba memasukkan health = " + newHealth);
  // }

  // bisa dilakukan karena melakukan override pada overload method tanpa final keyword
  void setHealth(String newHealth) {
    System.out.println("mencoba memasukkan health = " + newHealth);
  }

}
