/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level10;

import java.util.ArrayList;

/**
 *
 * @author Cam
 */
public class Task_10_15 {
public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayList = new ArrayList[2];
        ArrayList<String> list = new ArrayList<>();
        list.add("asdsa");
        list.add("asdasde");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("asdasd");
        list2.add("asdasdas");
        arrayList[0] = list;
        arrayList[1] = list2;

        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }    
    }
}
