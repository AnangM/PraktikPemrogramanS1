import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tugas1 {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ulang = "y", input = "";

        while (ulang.equals("y") || ulang.equals("Y")) {
            System.out.println("=========================================");
            System.out.print("Masukkan Grade (Gunakan Huruf Kapital): ");
            try {
                input = bf.readLine();
            } catch (IOException e) {
                System.out.println("[ERROR] " + e);
            }
            System.out.println("=========================================");
            switch (input) {
            case "A":
                System.out.println("Nilai lebih dari 85");
                break;
            case "A-":
                System.out.println("Nilai antara 81 sampai 85");
                break;
            case "B+":
                System.out.println("Nilai antara 77 sampai 80");
                break;
            case "B":
                System.out.println("Nilai antara 75 sampai 76");
                break;
            case "B-":
                System.out.println("Nilai antara 71 sampai 74");
                break;
            case "C+":
                System.out.println("Nilai antara 66 sampai 70");
                break;
            case "C":
                System.out.println("Nilai antara 61 sampai 65");
                break;
            case "C-":
                System.out.println("Nilai antara 56 sampai 60");
                break;
            case "D":
                System.out.println("Nilai antara 51 sampai 55");
                break;
            case "E":
                System.out.println("Nilai kuarang dari / sama dengan 50");
                break;
            default:
                System.out.println("[ERROR] invalid input");
            }
            System.out.println("=========================================");
            try {
                System.out.print("Hiutng Ulang? (Y/N)");
                ulang = bf.readLine();
            } catch (IOException e) {
                System.out.print("[ERROR] " + e);

            }
            System.out.println("=========================================");
        }

    }
}