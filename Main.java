import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryToko toko = new InventoryToko();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nToko Minuman :");
            System.out.println("1. Input Item");
            System.out.println("2. Delete Item");
            System.out.println("3. View Stok");
            System.out.println("4. Quit");
            System.out.print("Option : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan nama barang : ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Masukkan jumlah barang : ");
                    int jumlahBarang = scanner.nextInt();
                    toko.tambahItem(namaBarang, jumlahBarang);
                    break;
                case 2:
                    System.out.print("\nMasukkan nama barang yang akan dihapus : ");
                    String barangHapus = scanner.nextLine();
                    toko.hapusItem(barangHapus);
                    break;
                case 3:
                    toko.tampilkanItem();
                    break;
                case 4:
                    System.out.println("\nEnding program, Bye...");
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
