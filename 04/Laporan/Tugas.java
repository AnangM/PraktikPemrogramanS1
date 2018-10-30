import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Tugas{
    //public bufferedReader so the whole class could use it
    public static BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(System.in));

    public static void main(String[] args) {
        String ulang = "Y";
        String operasi;
        try{
                //main loop
        while(ulang.equals("Y") || ulang.equals("y")){
            //showing menu
            System.out.println("////////////////////////////////////////////////");
            System.out.println("================================================");
            System.out.println("Kalkulator Bangun Datar");
            System.out.println("================================================");
            System.out.println("Pilih Operasi");
            System.out.println("1. Hitung Luas Segitiga");
            System.out.println("2. Hitung Luas Persegi Panjang");
            System.out.println("3. Hitung Luas Lingkaran");
            System.out.println("4. Hitung Luas Persegi");
            System.out.println("================================================");
            //get user chosen operation
            System.out.print("Masukkan Pilihan (Angka) : ");
            operasi = bufferedReader.readLine();
            System.out.println("================================================");
            //main decision maker
            if(operasi.equals("1")){
                System.out.println("Luas Segitiga = " + hitungLuasSegitiga());
            }else if(operasi.equals("2")){
                System.out.println("Luas Persegi panjang = " + hitungLuasPersegiPanjang());
            }
            else if(operasi.equals("3")){
                System.out.println("Luas Lingkaran = " + hitungLuasLingkaran());
            }else if(operasi.equals("4")){
                System.out.println("Luas Persegi = " + hitungLuasPersegi());
            }else{
                System.out.println("[Error] Operasi tidak tersedia.");
            }
            //footer
            System.out.println("================================================");
            //input for next loop
            System.out.print("Hitung Lagi? (Y/N)");
            ulang =bufferedReader.readLine();
            System.out.println("================================================");
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        }
    }catch(IOException e){
        System.out.println("[IOException] " + e);
    } }
    //function to calculate triangle
    static Double hitungLuasSegitiga(){
        Double hasil = 0.0;
        try{
        System.out.println("Hitung Luas Segitiga");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Alas : ");
        //user input
        String inputAlas = bufferedReader.readLine();
        //convert user input to Double
        Double alas = Double.parseDouble(inputAlas);
        System.out.print("Masukkan Tinggi : ");
        //user input
        String inputTinggi = bufferedReader.readLine();
        //convert user input to Double
        Double tinggi = Double.parseDouble(inputTinggi);
        //main calculation for triangle
        hasil = alas * tinggi / 2;
    }catch(IOException e){
        System.out.println("[IOException][hitungLuasSegitiga()]" + e);
    }
    //return hasil to main thread
    return hasil;
}

static Double hitungLuasPersegiPanjang(){
    Double hasil = 0.0;
    try{
        System.out.println("Hitung Luas Persegi Panjang");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Panjang : ");
        //get user input
        String inputPanjang = bufferedReader.readLine();
        //convert user input to Double
        Double panjang = Double.parseDouble(inputPanjang);
        System.out.print("Masukkan Lebar : ");
        //get user input
        String inputLebar = bufferedReader.readLine();
        //convert user input to Double
        Double lebar = Double.parseDouble(inputLebar);
        //main calculation for block(?)
        hasil = panjang * lebar;
    }catch(IOException e){
        System.out.println("[IOException][hitungLuasPersegiPanjang()]" + e);
    }
    //return hasil to main
    return hasil;
}

static Double hitungLuasLingkaran(){
    Double hasil = 0.0;
    try{
        System.out.println("Hitung Luas Lingkaran");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Jari-Jari : ");
        //Get user input
        String inputR = bufferedReader.readLine();
        //Conver user input to Double
        Double jariJari = Double.parseDouble(inputR);
        hasil = 3.14 * jariJari * jariJari;
    }catch(IOException e){
        System.out.println("[IOException][hitungLuasLingkaran()]" + e);
    }
    return hasil;
}

static Double hitungLuasPersegi(){
    Double hasil = 0.0;
    try {
        System.out.println("Hitung Luas Lingkaran");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Panjang Sisi : ");
        //Get user input
        String inputS = bufferedReader.readLine();
        //Convert user input to Double
        Double sisi = Double.parseDouble(inputS);
        hasil = sisi * sisi;
    } catch (IOException e) {
        System.out.println("[IOException][hitungPersegi()]" + e);
            //TODO: handle exception
        }
        return hasil;
    }
}