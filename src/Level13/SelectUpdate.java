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
public class SelectUpdate {    
    public static void main(String[] args) throws Exception 
    {
    }

    interface Selectable 
    {
        void onSelect();
    }

    interface Updatable 
    {
        void refresh();
    }
    
    public class Screen implements Selectable, Updatable 
    {

        @Override
        public void onSelect() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void refresh() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
