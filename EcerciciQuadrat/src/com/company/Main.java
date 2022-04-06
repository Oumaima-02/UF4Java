package com.company;
import java.util.Scanner;

public class Main {
    public static final String MSG_COSTAT ="Costat (cm):";
    public static final String MSG_AREA ="Area del quadrat --> ";
    public static final String MSG_VOLUM ="Volum del quadrat -->  ";
    public static final String MSG_CM2 =" cm2";
    public static final String MSG_CM3 =" cm3";
    public static final String MSG_NOVALID =" El número no ès vàlid.";

    public static void main(String[] args) {
        int costat, area, volum;
        Scanner sc= new Scanner(System.in);
        System.out.println(MSG_COSTAT);
        costat= sc.nextInt();
        Quadrat square= new Quadrat(costat);

        while (costat<0){
            System.out.println(MSG_NOVALID);
            System.out.println(MSG_COSTAT);
            costat= sc.nextInt();
        }

        area=costat*costat;
        volum= costat*costat*costat;
        System.out.println(MSG_AREA+area+ MSG_CM2);
        System.out.println(MSG_VOLUM+volum+ MSG_CM3);
    }
}

