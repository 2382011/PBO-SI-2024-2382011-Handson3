package Handson1;

public class DoWhileLoop {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Pisang", "Mangga", "Jeruk"};
        int i = 0;

        System.out.println("Menampilkan semua elemen buah:");
        do {
            System.out.println(buah[i]);
            i++;
        }while (i < buah.length);
    }
}
