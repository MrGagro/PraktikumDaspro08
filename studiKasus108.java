import java.util.Scanner;

public class studiKasus108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.println("====== Kedai Kopi Senja ======");
        System.out.print("Masukkan jumlah cup yang akan dipesan: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar anda: ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            totalBayar = totalHarga - diskon;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga kopi anda: "+totalHarga);
        System.out.println("Diskon yang didapat: "+diskon);
        System.out.println("Total yang harus dibayar: "+totalBayar);
        
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: "+kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda Kurang Rp"+kurang);
        }

        input.close();
    }
}
