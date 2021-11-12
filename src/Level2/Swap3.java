/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level2;

public class Swap3 {
    
public static void main(String[] args)
  {
    Student jen = new Student();
    jen.name = "Jen";
    jen.age = 21;

    Student beth = new Student();
    beth.name = "Beth";
    beth.age = 15;

    System.out.println("Jen is " + jen.age);
    System.out.println("Beth is " + beth.age);

    ageSwap(jen, beth);

    System.out.println("Jen is " + jen.age);
    System.out.println("Beth is " + beth.age);
  }

  private static void ageSwap(Student a,
                                    Student b)
  {
    int c = a.age;
    a.age = b.age;
    b.age = c;
  }

  static class Student
  {
    String name;
    int age;
  }
}
