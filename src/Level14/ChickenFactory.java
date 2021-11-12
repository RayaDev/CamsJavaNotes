/*
Good example of class inhertance and all the other good stufffff..

 */
package Level14;




public class ChickenFactory {  
    
    public static void main(String[] args) 
    {
        Hen hen = HenFactory.getHen(Continent.NORTHAMERICA);             
        hen.getMonthlyEggCount();
        hen.getDescription();
              
        /*String describe = hen.getDescription();
        System.out.println(describe);*/
    }

    static class HenFactory {

        static Hen getHen(String continent) 
        {
            Hen hen = null;
            
            if (continent.equals(Continent.NORTHAMERICA))
            {
                return new NorthAmericanHen();
                
            }
            
            if (continent.equals(Continent.EUROPE))
            {
                return new EuropeanHen();
            }
            
            if (continent.equals(Continent.AFRICA))
            {    
                return new AfricanHen();
            }
            
            if (continent.equals(Continent.ASIA))
            {  
                
                return new AsianHen();
            
            }
            
            return hen;
        
        }  
    }
    
   /* public interface Continent {
    String EUROPE = "Europe";
    String NORTHAMERICA = "North America";
    String ASIA = "Asia";
    String AFRICA = "Africa";
    } */
    
    abstract class Hen {
        abstract int getMonthlyEggCount();
        
        String getDescription ()
        {
            return "I am a chicken.";
        }
        
    }
    
    static class NorthAmericanHen extends Hen {
       String homeLand = "North America";
        
        @Override
        int getMonthlyEggCount() {
            int eggCount = 100;
            return eggCount;
        }
        
        @Override
        String getDescription ()
        {
            return "I come from " + homeLand + ". I lay " + getMonthlyEggCount() + " eggs a month.";
        } 
        
    }
    
    static class EuropeanHen extends Hen {
        String homeLand = "Europe";
        
        @Override
        int getMonthlyEggCount() 
        {
             int eggCount = 80;
            return eggCount;
        }
        
        @Override
        String getDescription ()
        {
            return "I come from " + homeLand + ". I lay " + getMonthlyEggCount() + " eggs a month.";
        }
        
    }
    
    static class AsianHen extends Hen {
        
        String homeLand = "Asia";
        
        @Override
        int getMonthlyEggCount() 
        {
            int eggCount = 190;
            return eggCount;
        }
        
        @Override
        String getDescription ()
        {
            return "I come from " + homeLand + ". I lay " + getMonthlyEggCount() + " eggs a month.";
        }
        
    }
    
    static class AfricanHen extends Hen {
        
        String homeLand = "Africa";
        
        @Override
        int getMonthlyEggCount() 
        {
            int eggCount = 60;
            return eggCount;
        }
        
        @Override
        String getDescription ()
        {
            return "I come from " + homeLand + ". I lay " + getMonthlyEggCount() + " eggs a month.";
        }
        
        }
    }

