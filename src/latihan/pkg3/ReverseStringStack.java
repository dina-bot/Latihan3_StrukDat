package latihan.pkg3;

import java.util.Scanner;

public class ReverseStringStack {
    private int maxSize; //menyimpan maksimum kapasitas dari stack.
    private char[] stackArray; //menyimpan karakter-karakter pada stack.
    private int top; //menyimpan indeks dari elemen teratas pada stack.

    //constructor
    public ReverseStringStack(int size) {
        maxSize = size; //menginisialisasi variabel maxSize dengan nilai dari parameter size.
        stackArray = new char[maxSize]; //membuat array stackArray dengan ukuran sebesar maxSize.
        top = -1; //menginisialisasi variabel top dengan nilai -1. Nilai -1 menunjukkan bahwa stack saat ini kosong, karena tidak ada elemen yang ditambahkan ke dalamnya.
    }

    //Method untuk menambahkan sebuah karakter ke dalam stack
    public void push(char c) {
        if (isFull()) { //memeriksa apakah stack penuh
            System.out.println("Stack penuh, tidak dapat menambahkan data.");
            return;
        }
        //nilai dari top akan ditingkatkan menggunakan operator ++. 
        //Kemudian, karakter c akan dimasukkan ke dalam stack pada indeks top yang baru.
        //intinya ini tuh untuk menambahkan elemen baru ke dalam stack dengan nilai c.
        stackArray[++top] = c; 
    }

    // Method untuk menghapus elemen teratas dari stack dan mengembalikan nilai karakter yang dihapus
    public char pop() {
        if (isEmpty()) { //jika stack kosong
            System.out.println("Stack kosong, tidak dapat mengeluarkan data.");
            return '\0';
        }
        return stackArray[top--];
    }

    //melihat nilai atau elemen teratas pada stack tanpa mengeluarkannya dari stack
    public char peek() {
        if (isEmpty()) { //jika stack ksng
            System.out.println("Stack kosong, tidak ada data yang dapat dilihat.");
            return '\0';
        }
        return stackArray[top]; //mengembalikan nilai elemen teratas dari stack dan mengurangi nilai dari top
    }

    public boolean isEmpty() { //memeriksa apakah stack saat ini kosong
        // Method ini mengembalikan nilai true jika stack kosong (yaitu top bernilai -1) dan false jika stack tidak kosong.
        return (top == -1);
    }

    public boolean isFull() { ////memeriksa apakah stack saat ini kpenuh
        //Method ini mengembalikan nilai true jika stack sudah penuh (yaitu top sudah sama dengan maxSize-1, dimana maxSize adalah ukuran maksimal stack) dan false jika stack masih belum penuh.
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        // Membuat objek scanner untuk membaca masukan dari pengguna
        Scanner scanner = new Scanner(System.in);
        // Meminta pengguna memasukkan sebuah string
        System.out.print("Masukkan input : ");
        String input = scanner.nextLine();
        // Membuat sebuah stack untuk menyimpan karakter-karakter dari string
        ReverseStringStack stack = new ReverseStringStack(input.length());
        // Menambahkan setiap karakter dari string ke dalam stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        // Membuat string baru untuk menyimpan karakter-karakter dari stack
        
        String reversedString = "";
        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }
        // Menampilkan string yang telah dibalik
        System.out.println("Reversed : " +reversedString);
        
    }
}