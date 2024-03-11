package es_2;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di km percorsi: ");
        double kmPercorsi = scanner.nextDouble();

        System.out.print("Inserisci i litri di carburante consumati: ");
        double litriConsumati = scanner.nextDouble();

        try {
            double kmPerLitro = calcolaKmPerLitro(kmPercorsi, litriConsumati);
            System.out.println("Il numero di km/litro percorsi è: " + kmPerLitro);
        } catch (ArithmeticException e) {

            System.out.println("Errore: Impossibile dividere per zero. Assicurati di inserire un numero diverso da zero per i litri consumati.");
        }

        scanner.close();
    }


    public static double calcolaKmPerLitro(double kmPercorsi, double litriConsumati) {
        if (litriConsumati == 0) {
            throw new ArithmeticException("Divisione per zero!");
        }
        return kmPercorsi / litriConsumati;
    }
}
