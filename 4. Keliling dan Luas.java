public class BangunDatar{
    float luas(){
        System.out.println("Menghitung luas bangun datar");
        return 0;
    }
    
    float keliling(){
        System.out.println("Menghitung keliling bangun datar\n");
        return 0;
    }
}

public class Persegi extends BangunDatar{
    float sisi;
    
    @Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("***Luas dan Keliling Persegi***");
        System.out.println("Luas Persegi: " +luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " +keliling);
        return keliling;
    }
}
public class Lingkaran extends BangunDatar{
    float r;
    
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("\n***Luas dan Keliling Lingkaran***");
        System.out.println("Luas Lingkaran: " +luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " +keliling);
        return keliling;
    }
}
public class PersegiPanjang extends BangunDatar{
    float panjang;
    float lebar;
    
    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("\n***Luas dan Keliling Persegi Panjang***");
        System.out.println("Luas Persegi Panjang: " +luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang: " +keliling);
        return keliling;
    }
}
public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;
    
    @Override
    float luas(){
        float luas = (alas * tinggi)/2;
        System.out.println("\n***Luas Segitiga***");
        System.out.println("Luas Segitiga: " +luas);
        return luas;
    }
    
}
public class main{
    public static void main(String[] args){
        
        BangunDatar bangundatar = new BangunDatar();
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 7;
        
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 5;
        persegipanjang.lebar = 3;
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 3;
        segitiga.tinggi = 4;
        
        bangundatar.luas();
        bangundatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
        
        segitiga.luas();
    }
}