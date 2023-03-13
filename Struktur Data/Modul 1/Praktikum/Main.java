import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        boolean ulang = true;

        while (ulang) {
            System.out.println("============= Menghitung Luas Segitiga =============\n");
            System.out.println("Pilih menu berikut ini untuk hasil yang diinginkan : ");
            System.out.println("> 1. Hasil to Integer");
            System.out.println("> 2. Hasil to Double\n");

            System.out.print("Masukkan pilihan 1 atau 2 : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1 -> {
                    System.out.println("Inputkan alas dan tinggi secara berurutan : ");
                    int alas = input.nextInt();
                    int tinggi = input.nextInt();
                    ToInteger<Integer> segitigaIntegerLuas = new ToInteger<>(alas, tinggi);
                    System.out.println("Luas Segitiga Dalam Integer : " + segitigaIntegerLuas.hitungLuasInteger());
                }
                case 2 -> {
                    System.out.println("Inputkan alas dan tinggi secara berurutan : ");
                    double alas = input.nextDouble();
                    double tinggi = input.nextDouble();
                    ToDouble<Double> segitigaDoubleLuas = new ToDouble<>(alas, tinggi);
                    System.out.println("Luas Segitiga Dalam Double : " + segitigaDoubleLuas.hitungLuasDouble());
                }
                default -> System.out.println("Pilihan tidak tersedia");
            }
            System.out.print("\nApakah ingin mengulang? (y/n) : ");
            String ulangInput = input.next();
            ulang = ulangInput.equalsIgnoreCase("y");
        }
        System.out.println("Terima kasih telah menggunakan program ini!");
        input.close();
    }
}
