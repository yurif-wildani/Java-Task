public class Encapsulation {

private String namabuah;
private String jenis;

public String getNama(){
return this.namabuah; 
}

public void ModifNama(String namabuah){
this.namabuah=namabuah;
}
}

public class main {

    public static void main(String[] args) {
        Encapsulation objek = new Encapsulation();
        objek.ModifNama("Mangga");
        System.out.println("Nama Buah: "+objek.getNama());
        
    }
}