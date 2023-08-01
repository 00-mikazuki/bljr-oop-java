package com.belajar;

class Buku {
  String judul;
  String penulis;

  Buku(String judul, String penulis) {
    this.judul = judul;
    this.penulis = penulis;
  }

  void display() {
    System.out.println("\nJudul\t: " + this.judul);
    System.out.println("Penulis\t: " + this.penulis);
  }
}

public class Main {
  public static void main(String[] args) {
    Buku buku1 = new Buku("Killing Commandantore", "Haruki Murakami");
    buku1.display();

    // Menampilkan address
    String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
    System.out.println(addressBuku1);
    
    // assignment object
    Buku buku2 = buku1;
    // reference akan berbeda jika
    // Buku buku2 = new Buku("Killing Commandantore", "Haruki Murakami");;
    buku2.display();
    String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
    System.out.println(addressBuku2);

    // karena buku1 dan buku2 berada pada address atau reference yang sama
    buku1.judul = "Membunuh Komandantur";
    buku1.display();
    buku2.display();
    
    // kita akan memasukkan object ke dalam method
    fungsi(buku2);
    buku1.display();
    buku2.display();
  }

  // passing by reference
  public static void fungsi(Buku dataBuku) {
    String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
    System.out.println("address dalam fungsi " + addressDataBuku);
    dataBuku.penulis = "Haruki Mahalkami";
  }
}
