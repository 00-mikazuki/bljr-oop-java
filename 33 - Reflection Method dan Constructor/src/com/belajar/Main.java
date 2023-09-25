package com.belajar;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.Hero.HeroAgility;

public class Main {
  public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
    HeroAgility hero1 = new HeroAgility("Ucup", 0);
    hero1.displayAll();
    
    System.out.println("\nKita akan memanggil seluruh method\n");

    Method[] methodHero = hero1.getClass().getDeclaredMethods();
    for(Method method : methodHero) {
      if(method.getName().equals("setHeroType")) {
        System.out.println("\nmenginvoke method setHeroType");
        method.setAccessible(true);
        method.invoke(hero1, "intel");
      } else if(method.getName().equals("setNickname")) {
        System.out.println("\nmenginvoke method setNickname");
        method.setAccessible(true);
        method.invoke(hero1, "Brandon");
      }
    }

    hero1.displayAll();;

    // coba untuk mengakses constructor
    System.out.println("\nmengambil constructor");
    Object newHero = new Object();

    Constructor<?>[] constructorHero = hero1.getClass().getConstructors();
    for(Constructor<?> constructor : constructorHero) {
      if(constructor.getName().equals("com.Hero.HeroAgility")) {
        Object[] obj = {"james", 20};
        newHero = constructor.newInstance(obj);
      }
    }

    HeroAgility hero2 = (HeroAgility) newHero;

    hero2.displayAll();

  }
}


