import java.util.Scanner;
public class StudiKasus215 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPendanaan;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan: ");
        jenisKegiatan = sc.nextLine();
       
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")||
            jenisKegiatan.equalsIgnoreCase("BAKROMA")||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
                 System.out.print("Jumlah dokumen: ");
                 jumlahDokumen = sc.nextInt();

                System.out.print("Peringkat juara: ");
                peringkatJuara = sc.nextInt();

                if (jumlahDokumen < 4) {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Jumlah dokumen kurang" + kurang + "dokumen, Dana penghargaan tidak diberikan.");
                } else if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status: Berhak mendapatkan dana penghargaan");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3.");
                }
            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                System.out.print("Jumlah dokumen: ");
                jumlahDokumen = sc.nextInt();
               
                System.out.print("Status pendanaan PKM (1 = lolo, 0 = tidak lolos: ");
                statusPendanaan = sc.nextInt();
                
                if (jumlahDokumen < 4) {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Jumlah dokumen kurang" + kurang + "dokumen, Dana penghargaan tidak diberikan");
                } else if (statusPendanaan == 1) {
                    System.out.println("Status: Berhak mendapatkan dana penghargaan");
                } else {
                    System.out.println("status: PKM tidak lolos pendanaan, Dana penghargaan tidak diberikan.");
                }
                        
                } else {
                    System.out.println("Kegiatan tidak termasuk kwtwntuan, Dana penghargaan tidak diberikan.");
                }
            }
    }
