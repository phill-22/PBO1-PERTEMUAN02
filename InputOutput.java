import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String nama;
        int jumlahSks;
        double ipk;

        System.out.print("masukkan nama anda : ");
        nama = Scanner.nextLine();
        System.out.println("hai, " + nama);

        System.out.print("masukkan jumlah sks yang sudah di tempuh : ");
        jumlahSks = Scanner.nextInt();

        System.out.print("masukkan jumlah ipk sementara : ");
        ipk = Scanner.nextDouble();

        double jumlah = ipk * jumlahSks;
        System.out.println("Total Nilai = " + jumlah);

    }
}