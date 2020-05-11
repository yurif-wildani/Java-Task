public class Diskon{
    public static void main(String[] args){
        int pembelian = 2000000;
        int diskon = (int)(pembelian*(13.0f/100.0f)); //konvert tipe data float ke integer
        int hargabayar = pembelian - diskon;

        System.out.println("Pembelian = Rp "+pembelian);
        System.out.println("Diskon 13% = "+diskon);
        System.out.print("\n");
        System.out.println("Harga Bayar = Rp "+hargabayar);
    }
}