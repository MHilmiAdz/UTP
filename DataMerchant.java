package praktikumpbo;

import java.util.Scanner;

//AUTHOR  : M. HILMI ADZKIA
//NIM     : 215150607111016
//KELAS   : Pendidikan Teknologi Informasi - C

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant[] merc = new Merchant [0];
    //Untuk menambah Merchant
    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant mch[] = new Merchant[DataMerchant.merc.length+1];
        
        for (int i = 0; i < DataMerchant.merc.length; i++)
            mch[i] = DataMerchant.merc[i];
        
        mch[DataMerchant.merc.length] = merchant;
        
        return mch;
    }
    //Menampilkan seluruh data yang ada di dalam DataMerchant.
    public static void tampilData(){
        for (Merchant merc1 : merc) {
            if(merc1 != null){
                System.out.println("====Tampilan Data Merchant UBFood====");
                System.out.println("Nama Merchant   : " + merc1.getNamaMerchant());
                System.out.println("Nama Produk     : " + merc1.getNamaProduk());
                System.out.println("Harga           : " + (int)merc1.getHargaMakanan());
            }
        }
    }
    
    //Untuk mencari Merchant apakah sdh ada didalam data atau belum.
    public static Merchant cariMerchant(String nama){
        
        int letak = 0;
        boolean gkada = true;
        System.out.println("====================================");
        for(int j = 0; j < merc.length; j++)
            if(merc[j].getNamaMerchant().equals(nama)){
                System.out.println("Data Merchant " + nama + " sudah ada");
                letak = j;
                gkada = false;
                break;
            }
        
        if(gkada)
            System.out.println("Data Merchant " + nama + " belum ada");
        System.out.println("====================================");
       
        return merc[letak];
        
    }
    
    //Untuk menampilkan salah satu data yang ada di DataMerchant
    public static void tampilMerchant(Merchant merchant){
        
        System.out.println("====Data Merchant di UBFood====");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
        
    }
    
    //untuk mengupdate data yang sudah ada di dalam DataMerchant.
    public static void updateMerchant(Merchant merchant, int a){
        merc[a] = merchant;
    }
    
}
