//import class needed
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tugas{
    public static void main(String[] args) {
        //deklarasi buffered reader
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //deklarasi variable untuk perulangan dan inpyt
        String ulang = "y", input;
        //deklarasi variabel nilai
        Double nilai = 0.0;
        //perulangan untuk hitung ulang
        while(ulang.equals("y") || ulang.equals("Y")){
            System.out.println("=======================================");
            try{
                System.out.print("Masukkan Nilai : ");
                //get user input
                input = bf.readLine();
                //convert String to Double
                try{
                nilai = Double.parseDouble(input);
                }catch (Exception e){
                    System.out.println("[ERROR]" + e);
                }
            }catch(IOException e){
                //output error
                System.out.println("[ERROR] " + e);
            }
            System.out.println("---------------------------------------");
            //if pertama
            if(nilai > 100){
                System.out.println("Apakah nilai tersebut benar? Jika YA maka silahkan hubungi Dosen anda, karena nilai anda tidak masuk akal!");
            //if kedua dengan logika and (&&)
            }else if(nilai > 85.0 && nilai <= 100.0){
                System.out.println("Nilai = A");
            //lanjut if
            }else if(nilai > 80.0 && nilai <= 85.0){
                System.out.println("Nilai = A-");
            //lanjut if
            }else if(nilai > 76.0 && nilai <= 80.0){
                System.out.println("Nilai = B+");
            //lanjut if
            }else if(nilai > 74.0 && nilai <= 76.0){
                System.out.println("Nilai = B");
            //lanjut if
        }else if(nilai > 70.0 && nilai <= 74.0){
            System.out.println("Nilai = B-");
            //lanjut if
        }else if(nilai > 65.0 && nilai <= 70.0){
            System.out.println("Nilai = C+");
            //lanjut if
        }else if(nilai > 60.0 && nilai <= 65.0){
            System.out.println("Nilai = C");
            //lanjut if
        }else if(nilai > 55.0 && nilai <= 60.0){
            System.out.println("Nilai = C-");
            //lanjut if
        }else if(nilai > 50.0 && nilai <= 55.0){
            System.out.println("Nilai = D");
            //lanjut if
        }else if(nilai<= 50.0){
            System.out.println("Nilai = E");
            //terakhir apabila semua nilai diatas false
            }else{
                System.out.println("[ERROR]" + nilai);
            }
            System.out.println("=======================================");
            try{
            System.out.print("Hitung Ulang?(Y/N)");
            //input untuk perulangan
            ulang = bf.readLine();
        }catch (IOException e){
            System.out.println("[Error] + e");

        }
        }
         
    }
}