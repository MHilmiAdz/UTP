package praktikumpbo;

//AUTHOR  : M. HILMI ADZKIA
//NIM     : 215150607111016
//KELAS   : Pendidikan Teknologi Informasi - C

public class Main {
    public static void main(String[] args) {
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid","Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes","Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros","Ayam Kota Ekstra Nasi", 10000));        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.in.nextLine(), DataMerchant.in.nextLine(), DataMerchant.in.nextDouble()));
        
//        DataMerchant.in.nextLine();
//        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.in.nextLine(), DataMerchant.in.nextLine(), DataMerchant.in.nextDouble()));
        
        DataMerchant.tampilData();

//        DataMerchant.tampilMerchant(DataMerchant.merc[1]);
//        DataMerchant.cariMerchant("Bakso Pak Sahid");
//        DataMerchant.cariMerchant("McDonald");
//        DataMerchant.updateMerchant(new Merchant("Indomaret", "Kusuka", 15000), 1);
//        
//        DataMerchant.tampilData();
        
    }
    
}
