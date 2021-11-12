/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level12;

/**
 *
 * @author Cam
 */
public class TheIsoMorphs {
    
    public static void main(String[] args) throws Exception 
    {
        int[] data = new int[]{89, 2, 3, 5, -2, -8, 0, -77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) 
    {
        if (array == null || array.length == 0) 
        {
            return new Pair<Integer, Integer>(null, null);
        }
        
        
        int min = array[0];
        int i = 0;
        int index= 0;
        
        for (int num : array)
        {
            if (num < min)
            {
                min = num;
                index = i;
                
            }
            i++;
        }
        
        

        return new Pair<>(min, index);
    }


    public static class Pair<X, Y> 
    {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }

        private Pair() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    } 
}
