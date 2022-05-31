package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Апта кундорун жазыныз!");

        Scanner sc=new Scanner(System.in);

        int a=1;



        while (a==1){
        switch (sc.nextLine().toUpperCase()) {
            case "DUISHOMBU":
                System.out.println(JumaKundoru.DUISHOMBU.raspisanieZanatiy());
                break;
            case "SHEISHEMBI":
                System.out.println(JumaKundoru.SHEISHEMBI.raspisanieZanatiy());
                break;
            case "SHARSHEMBI":
                System.out.println(JumaKundoru.SHEISHEMBI.raspisanieZanatiy());
                break;
            case "BEISHEMBI":
                System.out.println(JumaKundoru.BEISHEMBI.raspisanieZanatiy());
                break;
            case "JUMA":
                System.out.println(JumaKundoru.JUMA.raspisanieZanatiy());
                break;
            case "ISHEMBI":
                System.out.println(JumaKundoru.ISHEMBI.raspisanieZanatiy());
                break;
            case "JEKSHEMBI":
                System.out.println(JumaKundoru.JEKSHEMBI.raspisanieZanatiy());
                break;
            case "OCHUR":
                a=0;
                break;
            default:
                System.out.println("Кундорду ката жаздыныз! Дагы текшерип жазыныз!");
        }
        }


    }
}
