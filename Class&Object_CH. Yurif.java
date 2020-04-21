public class Buah {
	//inisialisasi variabel
    String namaBuah = "";
	int hargaBuah = 0;
	String jenisBuah = "";
	
	//constructor
	public Buah(String nama, int harga, String jb){
        this.namaBuah = nama;
		this.hargaBuah = harga;
		this.jenisBuah = jb;
	}
	
	//method untuk mengambil info
	public void info(){
		System.out.println("Nama Buah : "+this.namaBuah + ", Harga : "+this.hargaBuah + ", Jenis Buah : "+this.jenisBuah);
	}
}
public class Main {
	public Main(){
		//membuat object "mangga" dari class Buah
		//membuat object menggunakan keyword new
		Buah mangga = new Buah("Mangga", 8000, "Manalagi");
		
		//menjalankan method info
		mangga.info();
	}
	public static void main(String[] args) {
		new Main();
	}
}