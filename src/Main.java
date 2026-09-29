import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("================================================");
        System.out.println("  PROGRAM GEOMETRI INHERITANCE & POLYMORPHISM   ");
        System.out.println("================================================");

        while (running) {
            System.out.println("\n--- MENU PILIHAN ---");
            System.out.println("1. Uji Bujur Sangkar");
            System.out.println("2. Uji Lingkaran");
            System.out.println("3. Uji Silinder");
            System.out.println("4. Demonstrasi Polimorfisme (Cetak Semua Bentuk)");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan warna: ");
                    String warnaBS = scanner.nextLine();

                    BujurSangkar bs = new BujurSangkar(sisi, warnaBS);
                    System.out.print("Hasil: ");
                    bs.printInfo();
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari (radius): ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan warna: ");
                    String warnaLK = scanner.nextLine();

                    Lingkaran lk = new Lingkaran(radius, warnaLK);
                    System.out.print("Hasil: ");
                    lk.printInfo();
                    break;

                case 3:
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();
                    System.out.print("Masukkan jari-jari alas: ");
                    double radSilinder = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan warna: ");
                    String warnaSL = scanner.nextLine();

                    Silinder sl = new Silinder(tinggi, radSilinder, warnaSL);
                    System.out.print("Hasil: ");
                    sl.printInfo();
                    break;

                case 4:
                    System.out.println("\n--- Eksekusi Polimorfisme Lewat Array Bentuk[] ---");
                    Bentuk[] daftarBentuk = {
                        new Bentuk("Abu-abu"),
                        new BujurSangkar(10.0, "Merah"),
                        new Lingkaran(7.0, "Biru"),
                        new Silinder(20.0, 7.0, "Kuning")
                    };

                    for (int i = 0; i < daftarBentuk.length; i++) {
                        System.out.print((i + 1) + ". ");
                        daftarBentuk[i].printInfo();
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan ulangi.");
            }
        }

        scanner.close();
    }
}