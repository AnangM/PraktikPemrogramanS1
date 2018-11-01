//import class needed
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tugas1 {
    public static void main(String[] args) {
        //init buffered reader
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //declare variable
        String ulang = "y", input = "";
        //loop
        while (ulang.equals("y") || ulang.equals("Y")) {
            System.out.println("=========================================");
            System.out.print("Masukkan Grade (Gunakan Huruf Kapital): ");
            try {
                //get user input
                input = bf.readLine();
            } catch (IOException e) {
                System.out.println("[ERROR] " + e);
            }
            System.out.println("=========================================");
            //switch condition
            switch (input) {
                //condition one
            case "A":
                System.out.println("Nilai lebih dari 85");
                break;
                //another condition
                case "A-":
                System.out.println("Nilai antara 81 sampai 85");
                break;
                //another condition
                case "B+":
                System.out.println("Nilai antara 77 sampai 80");
                break;
                //another condition
                case "B":
                System.out.println("Nilai antara 75 sampai 76");
                break;
                //another condition
                case "B-":
                System.out.println("Nilai antara 71 sampai 74");
                break;
                //another condition
                case "C+":
                System.out.println("Nilai antara 66 sampai 70");
                break;
                //another condition
                case "C":
                System.out.println("Nilai antara 61 sampai 65");
                break;
                //another condition
                case "C-":
                System.out.println("Nilai antara 56 sampai 60");
                break;
                //another condition
                case "D":
                System.out.println("Nilai antara 51 sampai 55");
                break;
                //another condition
                case "E":
                System.out.println("Nilai kuarang dari / sama dengan 50");
                break;
                //default if none of above condition met
                default:
                System.out.println("[ERROR] invalid input");
            }
            System.out.println("=========================================");
            try {
                //chang ulang for loop
                System.out.print("Hitung Ulang? (Y/N)");
                ulang = bf.readLine();
            } catch (IOException e) {
                System.out.print("[ERROR] " + e);

            }
            System.out.println("=========================================");
        }

    }
}