public class pasar //superclass pasar
{
    public pasar(){ //
    }
 
    void buah(){
      }
    
}

public class beli extends pasar //turunan dari class pasar
{
    public beli(){
    }
 
    void buah(){
        System.out.println("Nama buah : Mangga");
    }
    
    void jenisbuah(){
        System.out.println("Jenis buah : Manalagi");
    }
 
    void hargabeli(){
        System.out.println("Harga : RP. 6000");
    }
}

public class jual extends pasar //tururnan dari class pasar
{
   void buah(){
       System.out.println("Nama buah : Mangga");
    }
    
    void jenisbuah(){
        System.out.println("Jenis buah : Manalagi");
    }
 
    void hargajual(){
        System.out.println("Harga jual : Rp. 8.000");
    }
}

public class laporan //class utama
{
    public static void main(String [] args){
    beli beli = new beli();
    jual jual = new jual();
 
    System.out.println("harga beli buah : "); 
    beli.buah();
    beli.jenisbuah();
    beli.hargabeli();
        
    System.out.println("\n");
        
    System.out.println("harga jual buah : ");
    jual.buah();
    jual.jenisbuah();
    jual.hargajual();
}
    
}