import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tugas{
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ulang = "y", input;
        Double nilai = 0.0;
        while(ulang.equals("y") || ulang.equals("Y")){
            System.out.println("=======================================");
            try{
                System.out.print("Masukkan Nilai : ");
                input = bf.readLine();
                nilai = Double.parseDouble(input);
            }catch(IOException e){
                System.out.println("[ERROR] " + e);
            }
            System.out.println("---------------------------------------");
            if(nilai > 100){
                System.out.println("Apakah nilai tersebut benar? Jika YA maka silahkan hubungi Dosen anda, karena nilai anda tidak masuk akal!");
            }else if(nilai > 85.0 && nilai <= 100.0){
                System.out.println("Nilai = A");
            }else if(nilai > 80.0 && nilai <= 85.0){
                System.out.println("Nilai = A-");
            }else if(nilai > 76.0 && nilai <= 80.0){
                System.out.println("Nilai = B+");
            }else if(nilai > 74.0 && nilai <= 76.0){
                System.out.println("Nilai = B");
            }else if(nilai > 70.0 && nilai <= 74.0){
                System.out.println("Nilai = B-");
            }else if(nilai > 65.0 && nilai <= 70.0){
                System.out.println("Nilai = C+");
            }else if(nilai > 60.0 && nilai <= 65.0){
                System.out.println("Nilai = C");
            }else if(nilai > 55.0 && nilai <= 60.0){
                System.out.println("Nilai = C-");
            }else if(nilai > 50.0 && nilai <= 55.0){
                System.out.println("Nilai = D");
            }else if(nilai <= 50.0){
                System.out.println("Nilai = E");
            }else{
                System.out.println("[ERROR]" + nilai);
            }
            System.out.println("=======================================");
            try{
            System.out.print("Hitung Ulang?(Y/N)");
            ulang = bf.readLine();
        }catch (IOException e){
            System.out.println("[Error] + e");

        }
        }
         
    }
}