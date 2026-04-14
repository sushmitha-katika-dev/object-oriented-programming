package com.java.oop.arrays;

public class Main {
    public static void main(String[] args) {
        int[] ids;  //array of declaration
        ids = new int[5]; //array instantiation
        System.out.println(ids[0]);

        //array initilization
        ids[0] = 101;
        ids[1] = 102;
        ids[2] = 103;
        ids[3] = 104;
        ids[4] = 105;
        System.out.println(ids.length);
        for(int index = 0 ; index < ids.length ; index++) {
            System.out.println(ids[index]);
        }

        //enhanced for loop (for-each)
        for(int id : ids) { //for each id in ids
            System.out.println(id);
        }
        /*int id = ids[0];
        id += 10000;
        System.out.println(id);
        System.out.println(ids[0]);*/

        //add 10000 to all the ids in ids array
        for(int id: ids){
            id += 10000;
        }

        for(int id : ids) {
            System.out.println(id);
        }

        for(int i = 0 ; i < ids.length ; i++) {
            ids[i] += 10000;
        }

        for(int id : ids) {
            System.out.println(id);
        }

        /*float[] prices = new float[5];
        prices[0] = 100.5F;
        prices[1] = 200.5F;
        prices[2] = 300.5F;
        prices[3] = 400.5F;
        prices[4] = 500.5F;*/
        float[] prices = {100.5F,200.5F,300.5F,400.5F,500.5F};
        for(float price : prices) {
            System.out.println(price);
        }
        char[] genders = {'M','F','M','F','M'};
        for(char gender : genders) {
            System.out.println(gender);
        }
    }
}