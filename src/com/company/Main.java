package com.company;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    static String strings="";

    public static void main(String[] args) {

        String[] strings = new String[4];

        strings[0] = "Bolot";
        strings[1] = "Azamat";
        strings[2] = "Sasha";
        System.out.println("_______________________________________________");
        
        strings[3]="Mirbek";
        String[]array=new String[3];
        array[0]="Mirbek";
        System.out.println("strings:"+ Arrays.toString(strings));
        System.out.println("array:"+ Arrays.toString(array));
        System.arraycopy(strings,0,array,1,2);
        System.out.println("эти массивы скопированы :"
        + Arrays.toString (array));


        System.out.println("______++++++++_____________-----------------_____________+++++++_______ ");
        String names="Bolot";
        switch ("Bolot") {
            case "Bolot":
                System.out.println("Доброго утро " + "Bolot,");


            case "Azamat":
                System.out.println("Доброго дня " + "Azamat,");

            case "Sasha":
                System.out.println("Доброго вечера " + "Sasha,");
            case "Mirbek":
                System.out.println("доброго ночи  " + "Mirbek");

        }

        while (names.length() <= 2) {

            names = names + "";
            System.out.println(names);
        }

        System.out.println(strings);
    }



    }


















