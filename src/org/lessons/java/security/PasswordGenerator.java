package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Inserisci il nome: ");
        String name=scan.nextLine();
        System.out.println("Inserisci il cognome: ");
        String surname=scan.nextLine();
        System.out.println("Inserisci il colore preferito: ");
        String FavouriteColor=scan.nextLine();
        System.out.println("Inserisci il giorno di nascita(numero): ");
        int dayOfBirth=scan.nextInt();
        System.out.println("Inserisci il mese di nascita(numero): ");
        int monthOfBirth=scan.nextInt();
        System.out.println("Inserisci l'anno di nascita(numero): ");
        int yearOfBirth=scan.nextInt();
        int sommaDatiNascita=dayOfBirth+monthOfBirth+yearOfBirth;
        String password=name+"-"+surname+"-"+FavouriteColor+"-"+sommaDatiNascita;
        System.out.println(password);


    }
}
