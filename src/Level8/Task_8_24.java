/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level8;

//import java.util.ArrayList;
import java.util.*;

/**
 *

 */


public class Task_8_24 {
    public static void main(String[] args) 
    {
       Human Child1 = new Human("Child1", true, 31, new ArrayList<>());
       Human Child2 = new Human("Child2", false, 30, new ArrayList<>());
       Human Child3 = new Human("Child3", true, 29, new ArrayList<>());
       // System.out.println(Child1.toString());
       
       ArrayList<Human> kids = new ArrayList<>();
       kids.add(Child3);
       kids.add(Child2);
       kids.add(Child1);
       
       Human Mom = new Human("Mom", false, 62, kids);
       //System.out.println(Mom.toString());
       Human Dad = new Human("Dad", true, 58, kids);
       
       ArrayList<Human> mom = new ArrayList<>();
       mom.add(Mom);
       ArrayList<Human> dad = new ArrayList<>();
       dad.add(Dad);
       
       Human MgrandMother = new Human ("MGrandma", false, 87, mom);
       Human MgrandFather = new Human("MGrandpa", true, 85, mom);
       Human DgrandMother = new Human("PGrandma", false, 83, dad);
       Human DgrandFather = new Human("PGrandpa", true, 80, dad);
       
       ArrayList<Human> allHumans = new ArrayList<>();
       allHumans.add(Child1);
       allHumans.add(Child2);
       allHumans.add(Child3);
       allHumans.add(Mom);
       allHumans.add(Dad);
       allHumans.add(MgrandMother);
       allHumans.add(MgrandFather);
       allHumans.add(DgrandFather);
       allHumans.add(DgrandMother);
       
       for (Human h : allHumans)
       {
           System.out.println(h.toString());
       }
        
    }

    public static class Human {
        String name;
        boolean sex;
        int age;        
        ArrayList<Human> children;

        Human (String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        
        @Override
        public String toString() {
            String text = "";
            text += "Name: " + this.name; //x+= 3 means x = x + 3;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }    
    }
}
