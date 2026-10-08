import java.util.Scanner;
public class StudiKasus215 {
    
    public static void main(String[] args) {
        Sacnner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPendanaan;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan: ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen: ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")||
            jenisKegiatan.equalsIgnoreCase("BAKROMA")||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

                System.out.println("Peringkat juara: ");
                peringkatJuara = sc.nextInt();

                if (jumlahDokumen < 4) {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Jumlah dokumen kurang" + kurang + "dokumen, Dana penghargaan tidak diberikan.");
                } else if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status: Berhak mendapatkan dan penghargaan");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3.");
                }
            }


    }
}
