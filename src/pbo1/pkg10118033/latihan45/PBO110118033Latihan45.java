
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan hasil cetak
 *                     nama.
 *  
 */

package pbo1.pkg10118033.latihan45;

import java .util.Scanner;

public class PBO110118033Latihan45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer printer1 = new Printer();
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        printer1.setNama(sc.next());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer1.setJmlCetak(sc.nextInt());
        printer1.cetak(printer1.getNama());
        printer1.cetak(printer1.getJmlCetak(), printer1.getNama());
        System.out.println("(Developed By : Ikrar AB)");
    }
}