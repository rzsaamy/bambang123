import java.util.Scanner;

public class Rizq_dzaki_samudera{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();

        System.out.println("Pilih operasi yang ingin dilakukan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = angkaPertama + angkaKedua;
                break;
            case 2:
                hasil = angkaPertama - angkaKedua;
                break;
            case 3:
                hasil = angkaPertama * angkaKedua;
                break;
            case 4:
                if (angkaKedua != 0) {
                    hasil = angkaPertama / angkaKedua;
                } else {
                    System.out.println("Tidak dapat melakukan pembagian dengan angka nol.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}