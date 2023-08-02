import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ErrorHandling errorHandling = new ErrorHandling();

        // Meminta input dari pengguna untuk panjang array
        int lengthArray = errorHandling.inputInt("Masukkan panjang array: ");
        errorHandling.clearScanner();

        // Meminta input dari pengguna untuk elemen-elemen array
        int[] arrayAngka = errorHandling.inputArrayNumber(
                "Masukkan elemen array (" + lengthArray +" angka dipisah spasi): ", lengthArray);

        // Mengurutkan array secara ascending
        Arrays.sort(arrayAngka);

        // Menghitung jumlah angka unik dalam array
        int uniqueNumber = 0;
        for (int indexCompare = 0; indexCompare < lengthArray-1; indexCompare++) {
            if (arrayAngka[indexCompare] != arrayAngka[indexCompare+1]) {
                uniqueNumber++;
            }
        }

        // Menampilkan array yang sudah diurutkan
        System.out.println("Kumpulan array: " + Arrays.toString(arrayAngka));

        // Menampilkan jumlah pasangan angka unik yang ditemukan
        System.out.println("Jumlah pasangan angka unik yang ditemukan: " + uniqueNumber);

        // Menutup scanner yang digunakan untuk input
        errorHandling.closeScanner();
    }
}
