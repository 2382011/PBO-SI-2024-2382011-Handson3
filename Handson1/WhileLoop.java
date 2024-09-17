package Handson1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Pisang", "Mangga", "Jeruk"};
        int i = 0;

        System.out.println("Menampilkan semua elemen buah:");
        while (i < buah.length){
            System.out.println(buah[i]);
            i++;
        }
    }
}
