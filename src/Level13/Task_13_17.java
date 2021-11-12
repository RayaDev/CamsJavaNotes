/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level13;

/**
 *
 * @author Cam
 */
public class Task_13_17 {
public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
}
    
    static class Today implements Weather{
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }
        
         public String getWeatherType(){
            return this.type;
        }
    }  
    
public interface WeatherType {
    String CLOUDY = "Cloudy";
    String FOGGY = "Foggy";
    String FREEZING = "Freezing";
}

public interface Weather {
    String getWeatherType();
}
}
