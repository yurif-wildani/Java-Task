class Pasar{
 public void Jenis(){
  System.out.println("Mangga");
 }
 public static void main(String [] args){
  Buah nama;
  Pasar buah;
  buah = new Pasar();
  nama = new Buah();
  
  buah.Jenis();
  nama.Jenis();
 }
}
class Buah extends Pasar{
 //Method Override
 public void Jenis(){
  System.out.println("Manalagi");
 }
}
