import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class tugas{
    public static void main(String[] args) {
        BufferedReader userInput = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String nama,nim,alamat;
        try{
            System.out.print("Masukkan Nama : ");
            nama = userInput.readLine();

            System.out.print("Masukkan NIM : ");
            nim = userInput.readLine();

            System.out.print("Masukkan Alamat : ");
            alamat = userInput.readLine();

            System.out.println("==================DATA====================");
            System.out.println("Nama : " + nama);
            System.out.println("NIM : " + nim);
            System.out.println("Alamat : " + alamat);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}