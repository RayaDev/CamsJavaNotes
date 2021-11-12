/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level13;

import java.util.Random;

/**
 *
 * @author Cam
 */
public class BoxingMatch {
    public static void main(String[] args) 
    {   
        Contestant boxer1 = new Contestant("Rocky",100,80,50,65);
        Contestant boxer2 = new Contestant("Apollo Creed", 100,70,70,60);
        
        boxer1.Stats();
        System.out.println("");
        boxer2.Stats();
        
        
        boxer2.recieveDMG(boxer2.dodge(boxer1.jab()));        
        boxer2.printHP();
        System.out.println("");
        
        boxer1.recieveDMG(boxer1.dodge(boxer2.jab()));        
        boxer2.printHP();
        System.out.println("");
        
        boxer2.recieveDMG(boxer2.dodge(boxer1.hook()));        
        boxer2.printHP();
        System.out.println("");
    }
    
    interface Boxing
    {
        double jab();
        double hook();
        double cross();
        double dodge(double dmg); 
        
        void recieveDMG(double dmg);
    }
    
    private abstract class Boxer implements Boxing
    {
        Random r = new Random();
        
        String NAME;
        double HP;
        double STR;
        double AGI;
        double WGT;
        
        double DMG = STR * WGT;
        double HIT;

        @Override
        public double jab() 
        {
            System.out.println(NAME + " threw a jab!");
            HIT = AGI/WGT;
            DMG = HIT * AGI;
            return DMG;
        }

        @Override
        public double hook() {
            
            System.out.println(NAME + " threw a hook!");
            HIT = 1;
            DMG = STR * AGI * HIT;
            return DMG;
        }

        @Override
        public double cross() {
            HIT = 1;
            DMG = STR * WGT * HIT;
            return DMG;
        }

        @Override
        public double dodge(double dmg) {
            
            int dodge = r.nextInt(100);
            if (dodge < AGI)
            {
                DMG = 0;
                System.out.println(NAME + " dodged the attack!");
            }
            else
            {
                System.out.println(NAME + " took damage!");
                DMG = dmg;
            }
            
            return DMG;
        }
        
        @Override
        public void recieveDMG(double dmg)
        {
            HP = HP - dmg;
        }
    }
    
    public static class Contestant extends Boxer
    {
        
        public Contestant(String name, double hp, double str, double agi, double wtg)
        {
            this.NAME = name;
            this.HP = hp;
            this.STR = str;
            this.AGI = agi;
            this.WGT = wtg;
        }
        
        public void Stats() 
        {
            System.out.println("Name: " + NAME);
            System.out.println("Health: " + HP);
            System.out.println("Strength: " + STR);
            System.out.println("Agility: " + AGI);
            System.out.println("Weight: " + WGT);
            
        }
        
        public void printHP()
        {
            System.out.println(NAME+"'s Health: " + HP);
        }
        
    }
}
