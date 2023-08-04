package com.belajar;

class Player {
  String name; // default, bisa dibaca dan ditulis dari luar class
  public int exp; // public, bisa dibaca dan ditulis dari luar class
  private int health; // private, hanya bisa dibaca dan ditulis di dalam class saja

  Player(String name, int exp, int health) {
    this.name = name;
    this.exp = exp;
    this.health = health;
  }

  // default modifier access
  void display() {
    tambahExp(); // contoh mengakses private method
    System.out.println("\nName\t: " + this.name);
    System.out.println("exp\t: " + this.exp);
    System.out.println("Health\t: " + this.health); // membaca, dari dalam class
  }

  // public
  public void ubahName(String nameBaru) {
    this.name = nameBaru;
  }

  // private
  private void tambahExp() {
    this.exp += 100;
  }
}

public class Main {
  public static void main(String[] args) {
    
    // data members
    Player player1 = new Player("Marni", 0, 100);

    // default
    System.out.println(player1.name); // membaca data
    player1.name = "Surti"; // menulis data
    System.out.println(player1.name); // membaca data
    
    // public
    System.out.println(player1.exp); // membaca data
    player1.exp = 100; // menulis data
    System.out.println(player1.exp); // membaca data
    
    // private (tidak bisa diakses)
    // System.out.println(player1.health); // membaca data
    // player1.health = 200; // menulis data
    // System.out.println(player1.health); // membaca data


    // methods

    // default
    player1.display();

    // public
    player1.ubahName("Tejo");
    player1.display();

    // private (tidak bisa diakses)
    // player1.tambahExp();
  }
}
