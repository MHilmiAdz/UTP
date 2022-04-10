package praktikumpbo;
public class Erigo {
    //Atribute
    String jenis;
    int harga;
    int jumlah;
    
    //Constructor dengan parameter String a dan Integer b 
    //untuk input jenis dan jumlah
    public Erigo(String a, int b){
        this.jenis = a;
        this.jumlah = b;
    }
    
    //Final Integer harga harga baju agar tidak bisa dirubah
    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;
    
    void hargaA(){
        //Jika beli lebih dari 100 dapat pengurangan harga sebasar :
        //5000 per baju jenis A
        if(jumlah > 100)
            this.harga = (bajuA - 5000);
        else
            this.harga = bajuA;
        
    }
    
    void hargaB(){
        //Jika beli lebih dari 100 dapat pengurangan harga sebesar :
        //5000 per baju jenis B
        if(jumlah > 100)
            this.harga = (bajuB - 5000);
        else
            this.harga = bajuB;
    }
    
    void hargaC(){
        //Jika beli lebih dari 100 dapat pengurangan harga sebasar :
        //15000 per baju jenis C
        if(jumlah > 100)
            this.harga = (bajuC - 15000);
        else
            this.harga = bajuC;
        
    }
    
    void display(){
        //Untuk mengecek jenis baju apa yang dibeli
        if(this.jenis.equalsIgnoreCase("a"))
            hargaA();
        
        else if(this.jenis.equalsIgnoreCase("b"))
            hargaB();
        
        else if(this.jenis.equalsIgnoreCase("c"))
            hargaC();
        
        
        //Menampilkan harga, jenis, dan total harga.
        System.out.println("====================================================");
        
        System.out.println("Jenis yang anda beli : " + this.jenis);
        System.out.println("Harga per buah       : " + this.harga);
        System.out.println("Total harga          : " + this.harga * this.jumlah);
        
    }
}
