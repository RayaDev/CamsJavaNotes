/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class Catss {
    public static void main(String[] args) throws Exception 
    {
        ArrayList<String> catNames = new ArrayList();
        
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String catName = reader.readLine(); */
        Scanner sc = new Scanner(System.in);
        String catName = sc.nextLine();
        
        while (!"".equals(catName))
        {
            catNames.add(catName);
            catName = sc.nextLine();
        }
        
        for (String catname : catNames)
        {
            Cat cat = CatFactory.getCatByKey(catname);           
            System.out.println(cat.toString());
        }
    }

    static class CatFactory {
        
        static Cat getCatByKey(String key) 
        {
            Cat cat = null;
            if ("boss".equals(key)) {
                cat = new MaleCat("Big Boy");
            } else if ("miss".equals(key)) {
                cat = new FemaleCat("Missy");
            } else if ("smudge".equals(key)) {
                cat = new FemaleCat("Smudgey");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "I'm " + getName() + ", an alley cat";
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "I'm a cat powerhouse named " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "I'm a cute kitty named " + getName();
        }
    } 
}
