public class Polimorfisme {
 
   public static void main(String[ ] args) {
 
      cetakObyek(new buah());
      cetakObyek(new jenis());
      cetakObyek(new harga());
   }
    
   public static void cetakObyek(Object objek) {
      System.out.println(objek);
   }
 
}
 
class buah extends jenis {
   public String toString() {
      return "Buah mangga jenis manalagi";
   }
}
 
class jenis extends harga {
   public String toString() {
      return "Jenis buah tersebut dibandrol dengan harga sekitar 8.000 /Kg ";
   }
}
 
class harga extends Object {
   public String toString() {
      return "Dalam mendapatkannya pun mudah, tersedia di pasar tradisional maupun supermarket";
   }
}