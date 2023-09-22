package com.belajar;

import com.hero.HeroAgility;
import java.lang.reflect.Field;

public class Main {
  public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
    HeroAgility hero1 = new HeroAgility("Otong", 100);
    hero1.displayAll();

    // access modifier
    hero1.nickname = "tongtong";
    hero1.displayAll(); // bisa dilakukan
    // hero1.heroType = "intel"; // tidak bisa dilakukan
    // hero1.name = "ucup"; // tidak bisa dilakukan

    // Reflection
    Class<?> classHero1 = hero1.getClass();
    Class<?> parentClassHero1 = hero1.getClass().getSuperclass();
    System.out.println("\nclass: " + classHero1.getName());
    System.out.println("parent: " + parentClassHero1.getName());

    // cek attribute dari object hero1
    System.out.println("\nVisible attribute dari object hero1");
    Field[] hero1Fields = classHero1.getFields(); // hanya mengambil attribute yg visible
    System.out.println("jumlah attribute adalah: " + hero1Fields.length);
    System.out.println("attribute: " + hero1Fields[0].getName());

    // cek semua attribute object hero1
    System.out.println("\nSemua attribute dari object hero1");
    Field[] hero1AllFields = classHero1.getDeclaredFields(); // mengambil semua attribute
    System.out.println("jumlah attribute adalah: " + hero1AllFields.length);
    System.out.println("attribute: ");
    for (Field field : hero1AllFields) {
      System.out.println(field.getName());
    }

    System.out.println("\nSemua attribute dari superclass Hero");
    Field[] heroAllFields = parentClassHero1.getDeclaredFields();
    System.out.println("jumlah attribute adalah: " + heroAllFields.length);
    System.out.println("attribute: ");
    for (Field field : heroAllFields) {
      System.out.println(field.getName());
    }

    // mengubah nilainya dengan reflection
    System.out.println("\nUbah");
    hero1.displayAll();
    System.out.println("\nMenjadi");
    // merubah public
    hero1AllFields[0].set(hero1, "cupcup");
    // merubah private
    hero1AllFields[1].setAccessible(true); // ubah menjadi visible agar dapat diubah
    hero1AllFields[1].set(hero1, "intel");
    // hero1.heroType = "strength"; // tidak bisa, hanya bisa mengubah menggunakan reflection

    // ubah attribute superclass
    heroAllFields[0].setAccessible(true);
    heroAllFields[0].set(hero1, "Ucup");
    heroAllFields[1].setAccessible(true);
    heroAllFields[1].set(hero1, 0);
    hero1.displayAll();


  }
}
