import java.util.Scanner;

public class studiKasus208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan, status, alasan;
        int jumlahDokumen, peringkatJuara, kurang, pkm;

        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat Juara (0 jika bukan juara): ");
            peringkatJuara = input.nextInt();
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                System.out.print("Jumlah Dokumen (0-4): ");
                jumlahDokumen = input.nextInt();
                if (jumlahDokumen == 4) {
                    status = "Dana diberikan";
                    alasan = "Juara " + peringkatJuara + " dan 4 dokumen lengkap";
                } else {
                    kurang = 4 - jumlahDokumen;
                    status = "Dana tidak diberikan";
                    alasan = "Dokumen tidak lengkap, kurang " + kurang + " dokumen";
                }
            } else {
                status = "Dana tidak diberikan";
                alasan = "Bukan juara 1, 2, atau 3";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            pkm = input.nextInt();
            if (pkm == 1) {
                System.out.print("Jumlah Dokumen (0-4): ");
                jumlahDokumen = input.nextInt();
                if (jumlahDokumen == 4) {
                    status = "Dana diberikan";
                    alasan = "PKM lolos pendanaan dan 4 dokumen lengkap";
                } else {
                    kurang = 4 - jumlahDokumen;
                    status = "Dana tidak diberikan";
                    alasan = "Dokumen tidak lengkap, kurang " + kurang + " dokumen";
                }
            } else {
                status = "Dana tidak diberikan";
                alasan = "PKM tidak lolos pendanaan";
            }
        } else {
            status = "Dana tidak diberikan";
            alasan = "Kegiatan Lainnya tidak memperoleh dana penghargaan";
        }

        System.out.println("\n\nNama: " + namaMahasiswa);
        System.out.println("Jenis Kegiatan: " + jenisKegiatan);
        System.out.println("Status: " + status + ", " + alasan);

        input.close();
    }

}