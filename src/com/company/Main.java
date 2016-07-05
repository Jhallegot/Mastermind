package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> colorsChoosen = new ArrayList<>();
        int min = 0;
        int max = 5;
        boolean response = false;

        for (int i=0;i<5;i++){
            int color;
            color = min + (int)(Math.random()*(max-min));
            colorsChoosen.add(color);
            System.out.print(EnumColor.Color.getNameColor(color)+" ");
        }

        while (!response){
            int okPosition = 0;
            int okColor = 0;
            ArrayList<Integer> colorsChoosenCopy = new ArrayList<>(colorsChoosen);
            Scanner sc = new Scanner(System.in);
            System.out.print(" ");
            System.out.println("Veuillez saisir une combinaison de 5 couleurs (première lettre) :");
            String str = sc.nextLine();
            str = str.toUpperCase();
            System.out.println("Vous avez saisi : " + str);

            //search perfect match
            for (int i=0;i<5;i++){
                int color;
                color = EnumColor.Color.getNumberColor((""+str.charAt(i)));
                if (color == colorsChoosen.get(i)){
                    okPosition++;
                    colorsChoosenCopy.set(i, -1);
                }
            }
            //search color match 
            for (int i=0;i<5;i++){
                int color = EnumColor.Color.getNumberColor((""+str.charAt(i)));
                if (colorsChoosenCopy.indexOf(color)!=-1){
                    okColor++;
                }
            }
            if (okPosition==5){
                response = true;
                System.out.println("Bravo !");
                sc.close();
            }else{
                System.out.println("Vous avez "+okPosition+" bonne position et "+okColor+" bonne couleur");
            }
        }


    }
}
