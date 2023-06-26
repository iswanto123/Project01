import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataManager {
    private final List<Data> dataArr = new ArrayList<>();

    public void readData() {
        if (dataArr.isEmpty()) {
            System.out.println("Data kosong");
        } else {
            System.out.println("Data:");
            for (Data data : dataArr) {
                data.displayData();
                System.out.println();
            }
        }
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan usia: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline character

        Data newData = new Data(name, age);
        dataArr.add(newData);

        System.out.println("Data berhasil dimasukkan");
    }

    public void editData() {
        Scanner scanner = new Scanner(System.in);
        if (dataArr.isEmpty()) {
            System.out.println("Data kosong");
            return;
        }

        System.out.print("Masukkan indeks data yang akan diubah: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline character

        if (index >= 0 && index < dataArr.size()) {
            Data selectedData = dataArr.get(index);

            System.out.println("Data sebelumnya:");
            selectedData.displayData();
            System.out.println();

            System.out.print("Masukkan nama baru: ");
            String newName = scanner.nextLine();
            System.out.print("Masukkan usia baru: ");
            int newAge = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character

            selectedData.setName(newName);
            selectedData.setAge(newAge);

            System.out.println("Data berhasil diubah");
        } else {
            System.out.println("Indeks tidak valid");
        }
    }

    public void deleteData() {
        Scanner scanner = new Scanner(System.in);
        if (dataArr.isEmpty()) {
            System.out.println("Data kosong");
            return;
        }

        System.out.print("Masukkan indeks data yang akan dihapus: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < dataArr.size()) {
            dataArr.remove(index);
            System.out.println("Data berhasil dihapus");
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
}