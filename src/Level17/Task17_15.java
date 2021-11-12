/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level17;


import java.util.*;

public class Task17_15 {
    public static DrugController drugController = new DrugController();
    public static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread pharmacy = new Thread(new Pharmacy(), "Pharmacy");
        Thread man = new Thread(new Person(), "Man");
        Thread woman = new Thread(new Person(), "Woman");

        pharmacy.start();
        man.start();
        woman.start();

        Thread.sleep(1000);
        isStopped = true;
    }

    public static class Pharmacy implements Runnable {

        @Override
        
        public void run() { 
            while(!isStopped)
            {
            drugController.buy(getRandomDrug(), getRandomCount());
            waitAMoment();
            waitAMoment();
            waitAMoment();
            }
        }
        
       
    }
        
        
    

    public static class Person implements Runnable{

        @Override
        public void run() {
            while(!isStopped)
            {
            drugController.sell(getRandomDrug(), getRandomCount());
            waitAMoment();
            }
        }
    }

    public static int getRandomCount() {
        return (int) (Math.random() * 3) + 1;
    }

    public static Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (DrugController.allDrugs.size()));
        List<Drug> drugs = new ArrayList<>(DrugController.allDrugs.keySet());
        return drugs.get(index);
    }

    private static void waitAMoment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    } 
    
public static class DrugController {
    public static Map<Drug, Integer> allDrugs = new HashMap<>();   // <Drug, Amount>

    static {
        Drug acetaminophen = new Drug();
        acetaminophen.setName("Acetaminophen");
        allDrugs.put(acetaminophen, 5);

        Drug metamizole = new Drug();
        metamizole.setName("Metamizole");
        allDrugs.put(metamizole, 18);

        Drug placebo = new Drug();
        placebo.setName("Placebo");
        allDrugs.put(placebo, 1);
    }

    public synchronized void buy(Drug drug, int count) {
        String name = Thread.currentThread().getName();
        if (!allDrugs.containsKey(drug)) {
            System.out.println("Out of stock");
        }
        Integer currentCount = allDrugs.get(drug);
        if (currentCount < count) {
            System.out.println(String.format("%s wants %d tablets of %s. In stock: %d", name, count, drug.getName(), currentCount));
        } else {
            allDrugs.put(drug, (currentCount - count));
            System.out.println(String.format("%s bought %d tablets of %s. Remaining: %d", name, count, drug.getName(), (currentCount - count)));
        }
    }

    public synchronized void sell(Drug drug, int count) {
        System.out.println(Thread.currentThread().getName() + " purchased: " + count + " " + drug.getName());
        if (!allDrugs.containsKey(drug)) {
            allDrugs.put(drug, 0);
        }
        Integer currentCount = allDrugs.get(drug);
        allDrugs.put(drug, (currentCount + count));
    }
}

public static class Drug {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

}
