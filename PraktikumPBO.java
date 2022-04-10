package praktikumpbo;

import java.util.Scanner;

public class PraktikumPBO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Baju yang tersedia : ");
        
        System.out.println("Baju A dengan harga : 100000");
        System.out.println("Baju B dengan harga : 125000");
        System.out.println("Baju C dengan harga : 175000");
        
        System.out.println("====================================================");
        
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = sc.nextLine();
        
        System.out.print("Jumlah Baju yang akan anda beli adalah  : ");
        int jumlah = sc.nextInt();
        
        Erigo malang = new Erigo(jenis, jumlah);
        
        malang.display();
        
    }
    
}
