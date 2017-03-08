package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randy = new Random();

        /*
        a = team1
        b = team 2
        WL1 = team 1 win loss
        WL2 = team 2 win loss
         */
        double WL1 = 65;
        double Wl2 = 63;
        String Winner [] = new String[2];

        double diff = Math.abs(WL1-Wl2);
        System.out.println(diff);

        if (diff <= 5){
            int chance = randy.nextInt(2);
            System.out.println(chance);
            if (chance == 0){
                Winner[0] = a;
                Winner[1] = String.valueOf(WL1);
                return Winner;
            }
            else{
                Winner[0] = b;
                Winner[1] = String.valueOf(WL2);
                return Winner;
            }
        }
        else if (diff <= 10){
            int chance = randy.nextInt(10);
            System.out.println(chance);
            if (chance <= 5){
                Winner [0] = a;
                Winner[1] = String.valueOf(WL1);
                return Winner;
            }
            else{
                Winner[0] = b;
                Winner[1] = String.valueOf(WL2);
                return Winner;
            }
        }
        else if (diff <= 15){
            int chance = randy.nextInt(100);
            System.out.println(chance);
            if (chance <= 64){
                Winner [0] = a;
                Winner[1] = String.valueOf(WL1);
                return Winner;
            }
            else{
                Winner[0] = b;
                Winner[1] = String.valueOf(WL2);
                return Winner;
            }
        }
        else if (diff <= 20){
            int chance = randy.nextInt(100);
            System.out.println(chance);
            if (chance <= 69){
                Winner [0] = a;
                Winner[1] = String.valueOf(WL1);
                return Winner;
            }
            else{
                Winner[0] = b;
                Winner[1] = String.valueOf(WL2);
                return Winner;
            }
        }
        else if (diff <= 25){
            int chance = randy.nextInt(100);
            System.out.println(chance);
            if (chance <= 74){
                Winner [0] = a;
                Winner[1] = String.valueOf(WL1);
                return Winner;
            }
            else{
                Winner[0] = b;
                Winner[1] = String.valueOf(WL2);
                return Winner;
            }
        }
        else if (diff <= 30){
            int chance = randy.nextInt(100);
            System.out.println(chance);
            if (chance <= 79){
                Winner [0] = a;
                Winner[1] = String.valueOf(WL1);
                return Winner;
            }
            else{
                Winner[0] = b;
                Winner[1] = String.valueOf(WL2);
                return Winner;
            }
        }
        else if (diff <= 35){
            int chance = randy.nextInt(100);
            System.out.println(chance);
            if (chance <= 84){
                Winner [0] = a;
                Winner[1] = String.valueOf(WL1);
                return Winner;
            }
            else{
                Winner[0] = b;
                Winner[1] = String.valueOf(WL2);
                return Winner;
            }
        }
        else if (diff <= 40){
            int chance = randy.nextInt(100);
            System.out.println(chance);
            if (chance <= 89){
                Winner [0] = a;
                Winner[1] = String.valueOf(WL1);
                return Winner;
            }
            else{
                Winner[0] = b;
                Winner[1] = String.valueOf(WL2);
                return Winner;
            }
        }
        else{
            int chance = randy.nextInt(100);
            System.out.println(chance);
            if (chance <= 94){
                Winner [0] = a;
                Winner[1] = String.valueOf(WL1);
                return Winner;
            }
            else{
                Winner[0] = b;
                Winner[1] = String.valueOf(WL2);
                return Winner;
            }
        }
    }
}
