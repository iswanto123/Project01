import java.util.Scanner;

public class Main {
    private static final DataManager dataManager = new DataManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------------------------");
            System.out.println("WELCOME TO ...");
            System.out.println("------------------------");
            System.out.println("1. Read Data");
            System.out.println("2. Insert Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Delete Data");
            System.out.println("------------------------");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> dataManager.readData();
                case 2 -> dataManager.insertData();
                case 3 -> dataManager.editData();
                case 4 -> dataManager.deleteData();
                default -> System.out.println("Pilihan tidak tersedia");
            }
        } while (choice != 5);
    }
}