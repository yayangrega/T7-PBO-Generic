import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Membuat objek ArrayDeque untuk menyimpan Integer
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Menambahkan elemen ke ujung belakang deque
        deque.addLast(15);
        deque.addLast(30);
        deque.addLast(45);

        // Menambahkan elemen ke ujung depan deque
        deque.addFirst(5);
        
        // Menampilkan isi deque
        System.out.println("Isi ArrayDeque:");
        for (Integer num : deque) {
            System.out.println(num);
        }
    }
}