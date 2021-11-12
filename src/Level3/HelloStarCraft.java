/*
 Create 5 Zerg units, 3 Protoss units and 4 Terran units.
Give them all unique names.

Requirements:
Don't change the Zerg, Protoss, and Terran classes.
Create 5 Zerg objects and name each of them.
Create 3 Protoss objects and name each of them.
Create 4 Terran objects and name each of them.
 */
package Level3;

/**
 *
 * @author Cam
 */
public class HelloStarCraft {
       public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Drone";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Hydra";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Overlord";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Ultralysk";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Mutalsk";
        //System.out.println(zerg1.name);
        //System.out.println(zerg2.name);
        //System.out.println(zerg3.name);
        //System.out.println(zerg4.name);
        
        Protoss pro1 = new Protoss();
        Protoss pro2 = new Protoss();
        Protoss pro3 = new Protoss();
        pro1.name = "Zed";
        pro2.name = "Ned";
        pro3.name = "Fred";
        
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        
          terran1.name = "A";   
          terran2.name = "A"; 
          terran3.name = "A"; 
          terran4.name = "A"; 
          
    }

    public static class Zerg {
        public String name;
        
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}

