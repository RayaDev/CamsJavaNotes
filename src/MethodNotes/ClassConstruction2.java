/*
Create the Human class with String name, boolean sex, int age, Human father, and Human mother fields. 
Create and populate objects so that we end up with: 
Two grandfathers, two grandmothers, one father, one mother, and three children. Display the objects on the screen.
 */
package MethodNotes;

public class ClassConstruction2 {
    public static void main(String[] args) {
        
        Human Doug = new Human("Doug",true,60);
        Human Susan = new Human("Susan", false, 57);        
        Human Don = new Human("Don", true, 57);
        Human Pat = new Human("Pat", false, 61);
        Human Cam = new Human("Cam", true, 30, Don, Pat);
        Human Ryan = new Human("Ryan", true, 29, Don, Pat);
        Human Aaron = new Human("Aaron", true, 30, Doug, Susan);
        Human Derek = new Human("Derek", true, 25, Doug, Susan);
        Human Aborto = new Human("Steve?", false, 0, Don, Pat);
        
        System.out.println(Doug.toString());
        System.out.println(Susan.toString());
        System.out.println(Pat.toString());
        System.out.println(Don.toString());
        System.out.println(Cam.toString());
        System.out.println(Ryan.toString());
        System.out.println(Aaron.toString());
        System.out.println(Derek.toString());
        System.out.println(Aborto.toString());
    }

    public static class Human   
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
       
        public Human (String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        
        public Human (String name, boolean sex, int age, Human father, Human mother) 
        
        {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
            {
                text += ", father: " + this.father.name;
            }

            if (this.mother != null) 
            {
                text += ", mother: " + this.mother.name;
            }

            return text;
        }
    }
}
