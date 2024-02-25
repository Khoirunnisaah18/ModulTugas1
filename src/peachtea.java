import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class peachtea {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = data.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelaminInput = data.nextLine();
        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("L") ? "Laki-Laki" : "Perempuan";

        System.out.print("Tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = data.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDate tanggalSekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir,tanggalSekarang);
        //int tahun = selisih.getYears();
        int bulan = selisih.getMonths();
        int hari = selisih.getDays();
        int umur = Period.between(tanggalLahir, tanggalSekarang).getYears();

        System.out.println("\nData Diri");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur : " + umur + " tahun " + bulan + " bulan " + hari + " hari ");

        data.close();
    }
}