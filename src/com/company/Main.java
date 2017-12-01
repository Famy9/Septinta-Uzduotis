package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite kiek skaiciu norite ivesti: ");
        Scanner skaneris = new Scanner(System.in);
        int a = skaneris.nextInt();
        int[] Skaiciai = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Iveskite Skaiciu:"+ (i + 1));
            int skaicius = skaneris.nextInt();
            Skaiciai[i] = skaicius;

        }
        System.out.println("Skaiciai virs simto:");
        for (int sk = 0; sk < a; sk++) {
            if (Skaiciai[sk] > 100) {
                System.out.println("Skaiciai virs 100: " + Skaiciai[sk]);
            }

        }
    }
}

