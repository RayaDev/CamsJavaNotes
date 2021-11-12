/*
Write a method which returns the minimum and maximum numbers of an array.

Makes use of classes and setting varaiables. 
 */
package Level11;


public class MinMax2 {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, 2, 8, 3, 77, 5, 5};

        Pair <Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        
        int min = array[0];
        int max = array[0];
       
            
        for(int i = 0; i < array.length; i++)
        {
            if (array[i]<min)
            {
                min = array[i];
            }
                
            if (array[i]> max)
            {
                max = array[i];
            }
        }
           
        return new Pair<Integer, Integer>(min, max);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }  
}
