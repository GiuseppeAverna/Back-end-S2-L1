package es_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;



import java.util.Arrays;

import java.util.Scanner;


public class Esercizio1 {
    private static Logger logger = LoggerFactory.getLogger(Esercizio1.class);

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arraycasuale = new int[5];
        fillArrayWithRandomValues(arraycasuale, random);

        System.out.println("Array di numeri casuali: " + Arrays.toString(arraycasuale));

        while (true) {
            System.out.print("Inserisci un numero (0 per terminare): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            System.out.print("Inserisci la posizione in cui inserire il numero (da 1 a 5): ");
            int posizione = scanner.nextInt();

            try {
                inserisciNumeroInPosizione(arraycasuale, numero, posizione);
                System.out.println("Nuovo stato dell'array: " + Arrays.toString(arraycasuale));
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error("Errore: Posizione inserita non valida. La posizione deve essere compresa tra 1 e 5.");
            }
        }
        scanner.close();
    }

    private static void fillArrayWithRandomValues(int[] arraycasuale, Random random) {
        for (int i = 0; i < arraycasuale.length; i++) {
            arraycasuale[i] = random.nextInt(10) + 1;
        }
    }

    private static void inserisciNumeroInPosizione(int[] arraycasuale, int numero, int posizione) {
        if (posizione < 1 || posizione > arraycasuale.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        arraycasuale[posizione - 1] = numero;
    }
}
