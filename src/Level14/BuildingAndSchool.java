/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level14;

/**
 *
 * @author Cam
 */
public class BuildingAndSchool {
    public static void main(String[] args) 
    {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() 
    {
        Building school = new School();
        return school;
    }

    public static Building getBuilding() 
    {
        Building building = new Building();
        return building;
    }

    static class School extends Building
    {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*write your code here*/ 
    {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
