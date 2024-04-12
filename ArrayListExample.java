import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Membuat objek ArrayList untuk menyimpan String
        ArrayList<String> list = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        list.add("Bus");
        list.add("Mobil");
        list.add("Pesawat");

        // Menampilkan isi ArrayList
        System.out.println("Isi ArrayList:");
        for (String transportation : list) {
            System.out.println(transportation);
        }
    }
}