import java.util.Scanner;

public class KasirTokoBuku {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // definisi variabel
        String nama_barang;
        double harga_barang, diskon, total_harga;
        int jumlah_barang;

        System.out.println("Nama Barang: ");
        nama_barang = scan.nextLine();

        System.out.println("Harga Barang: ");
        harga_barang = scan.nextDouble();

        System.out.println("Jumlah Barang: ");
        jumlah_barang = scan.nextInt();

        // menghitung total harga
        total_harga = harga_barang * jumlah_barang;
        System.out.println("HARGA: Rp" + total_harga);

        // Menggunakan ternary operator untuk menentukan diskon
        diskon = (total_harga >= 500000) ? total_harga * 50 / 100 : // diskon 50%
                 (total_harga > 200000)  ? total_harga * 20 / 100 : // diskon 20%
                 (total_harga >= 100000) ? total_harga * 10 / 100 : // diskon 10%
                  0; // tidak mendapat diskon

        // Menghitung total harga setelah diskon
        total_harga -= diskon;

        // print total harga setelah diskon
        System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);

        // Menutup scanner
        scan.close();
    }
}
