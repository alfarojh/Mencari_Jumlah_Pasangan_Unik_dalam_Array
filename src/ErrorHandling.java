import java.util.Scanner;

public class ErrorHandling {
    private final Scanner scanner = new Scanner(System.in);

    // Menampilkan pesan error dengan teks berwarna merah
    public void errorMessage(String message) {
        System.out.println("\u001B[31m" + message + "\u001B[0m");
    }

    // Meminta input dari pengguna berupa bilangan bulat
    public int inputInt(String message) {
        System.out.print(message);

        // Melakukan validasi apakah input pengguna adalah bilangan bulat
        while (!scanner.hasNextInt()) {
            errorMessage("Maaf, input harus berupa bilangan bulat");
            System.out.print(message);
            scanner.next();
        }

        // Mengembalikan nilai bilangan bulat yang diinputkan oleh pengguna
        return scanner.nextInt();
    }

    // Meminta input dari pengguna untuk elemen-elemen array dengan panjang tertentu
    public int[] inputArrayNumber(String message, int lengthArray) {
        int[] arrayNumber = new int[lengthArray];
        System.out.print(message);
        boolean error = true;

        // Mengisi array dengan bilangan bulat yang dimasukkan oleh pengguna
        for (int i = 0; i < lengthArray; i++) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                if (error) {
                    errorMessage("Maaf, input harus berupa bilangan bulat");
                    error = false;
                }
            }
            arrayNumber[i] = scanner.nextInt();
            error = true;
        }

        // Mengembalikan array yang sudah terisi
        return arrayNumber;
    }

    // Menutup scanner setelah selesai digunakan
    public void closeScanner() {
        scanner.close();
    }
}