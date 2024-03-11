import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Mahasiswa data = new Mahasiswa();
        Scanner input = new Scanner(System.in);
        System.out.println(Mahasiswa.tampilUniversitas());
        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Tambahkah Data Mahasiswa ");
            System.out.println("2. Tampilkan Data Mahasiswa ");
            System.out.println("3. Exit ");
            System.out.println("Pilih menu (1-3): ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    data.tampilDataMahasiswa();
                    break;
                case 2:
                    data.displayDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Terimakasih!");
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid.");
            }

        } while (choice != 3);
    }

}