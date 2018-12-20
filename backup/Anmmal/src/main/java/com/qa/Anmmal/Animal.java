package com.qa.Anmmal;

/**
 * Hello world!
 *
 */
public abstract class Animal 
{
   private double bones;
   private double age;
   private String colour;
   private double size;
   private double weight;
   private boolean hasLegs;
   private long cellCount;
   
   public abstract void eat();
   public abstract void shit();
   public abstract void move();
   public abstract void reproduce();
   
}
