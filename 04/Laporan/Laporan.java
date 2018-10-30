import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Laporan{
    public static void main(String[] args){
		//Inisialisasi Variabel
        Double r = 0.0,luas,keliling;
		//Inisialisasi Buffered Reader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//Output awal
        System.out.println("===================================================");
        System.out.println("Aplikasi Menghitung Luas dan Keliling Lingkaran");
        System.out.println("===================================================");
        System.out.print("Masukkan Panjang Jari-jari (dalam meter) : ");
		//Mengambil Input
        try{
        String input = bufferedReader.readLine();
		//Mengubah tipe data dari String menjadi Double
        r = Double.parseDouble(input);
        }catch(IOException e){
			//Output apabila terjadi error
            System.out.println("[ERROR] " + e);
        }
		//perhitungan luas lingkaran
        luas = 3.14 * r * r;
		//perhitungan keliling lingkaran
        keliling = 3.14 * (2 * r);
        System.out.println("---------------------------------------------------");
		//output perhitungan luas lingkaran
        System.out.println("Luas Lingkaran = " + luas.toString() + "m");
		//output perhitungan keliling
        System.out.println("Keliling Lingkaran = " + keliling.toString() + "m");
        System.out.println("===================================================");
    }
}