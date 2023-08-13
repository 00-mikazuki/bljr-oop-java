package com.belajar;

import com.terminal.Console;

// visibility default (hanya dapat diakses pada class dgn package yg sama)
class Player {
  private String name;

  Player(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }

  void show() {
    // System.out.println("Player name : " + this.name);
    Console.log("Menggunakan console");
    Console.log("Player name : " + this.name);
  }
}
