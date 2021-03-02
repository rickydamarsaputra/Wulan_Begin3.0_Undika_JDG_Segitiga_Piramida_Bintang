import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Kreasi Segitiga Dan Piramida Dari Bintang =======");
        System.out.println("1. Segitiga");
        System.out.println("2. Piramida");
        System.out.println("3. Exit Program");

        System.out.print("Masukan Pilihan Anda: ");
        Integer pilihan = scanner.nextInt();
        Integer counterA, counterB, counterC;

        switch (pilihan) {
            case 1:
                System.out.print("Masukan Jumlah Baris: ");
                Integer jumlahBarisSegitiga = scanner.nextInt();
                System.out.print("======= Hasil Segitiga Bintang =======");
                for (counterA = 0; counterA <= jumlahBarisSegitiga; counterA++) {
                    for (counterB = 0; counterB < counterA; counterB++) {
                        System.out.print(" *");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.print("Masukan Jumlah Baris: ");
                Integer jumlahBarisPiramida = scanner.nextInt();
                System.out.println("======= Hasil Piramida Bintang =======");
                for (counterA = 1; counterA <= jumlahBarisPiramida; counterA++) {
                    for (counterB = 1; counterB <= jumlahBarisPiramida - counterA; counterB++)
                        System.out.print(" ");
                    for (counterC = 1; counterC < (counterA * 2); counterC++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
        }

        scanner.close();
    }
}
