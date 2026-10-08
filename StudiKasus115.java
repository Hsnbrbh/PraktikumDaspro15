import java.util.Scanner;
public class StudiKasus115 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup*hargaPerCup;
        diskon = 0;

        if (totalHarga >= 10000) {
            diskon = totalHarga*10/100;
        }

        totalBayar = totalHarga - diskon;
        System.out.print("Total harga: Rp" + totalHarga);
        System.out.print("Diskon: Rp" + diskon);
        System.out.print("Total bayar: Rp" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.print("Kembalian: Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.print("Uang tidak cukup, kurang Rp " + kurang);
        }

        input.close();

    }
}