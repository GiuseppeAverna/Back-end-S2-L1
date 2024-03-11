package es_0;

public class EsercizioDebugger {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Stampiamo l'array prima della modifica
        System.out.println("Array prima della modifica:");
        stampaArray(array);

        // Modifichiamo l'array
        modificaArray(array);

        // Stampiamo l'array dopo la modifica
        System.out.println("Array dopo la modifica:");
        stampaArray(array);
    }

    public static void modificaArray(int[] arr) {
        // Iteriamo sull'array e raddoppiamo ogni elemento
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    public static void stampaArray(int[] arr) {
        // Stampiamo gli elementi dell'array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
