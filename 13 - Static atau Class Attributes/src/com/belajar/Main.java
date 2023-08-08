package com.belajar;

class Display {
  static String type = "Display";
  // variable milik class / class attribute, bukan milik object. jika diubah di salah satu objectnya maka di semua object akan berubah
  private String name;

  Display(String name) {
    this.name = name;
  }

  void setType(String typeInput) {
    // type = typeInput; // alternatif 1
    // this.type = typeInput; // alternatif 2
    Display.type = typeInput; // alternatif 3 (rekomendasi)
  }

  void show() {
    System.out.println("Display name = " + this.name);
  }
}

public class Main {
  public static void main(String[] args) {
    Display display1 = new Display("monitor");
    display1.show();

    Display display2 = new Display("smartphone");
    display2.show();

    // tampilkan static variable atau class variable

    // coba mengganti variable staticnya
    display1.setType("Monitor");

    System.out.println("\nMenampilkan static variable");
    System.out.println(display1.type);
    System.out.println(display2.type);
    System.out.println(Display.type);

  }
}
