import java.util.Scanner;

public class basicIfConditional {
    public static void main(String[] args){
        System.out.println("+====== Masukan Nilai Siswa ======+");
        System.out.println("+ 1. Menentukan Grade Nilai       +");
        System.out.println("+ 2. Menentukan Nilai             +");
        System.out.println("+=================================+");

        System.out.println("Masukan Input ");
        Scanner selectAppIn = new Scanner(System.in);
        int selectApp = selectAppIn.nextInt();

        if (selectApp > 0 && selectApp <=2){
            if (selectApp == 1){
                System.out.println("Masukan Nilai Siswa");
                Scanner nilaiSiswaIn = new Scanner(System.in);

                double nilaiSiswa =  nilaiSiswaIn.nextDouble();
                String informationOut = "Grade Siswa Berdasar Nilai Ialah ";

                if (nilaiSiswa >= 0 && nilaiSiswa <= 100){
                    if (nilaiSiswa <= 50){
                        System.out.println(informationOut+ "E");
                    }else if (nilaiSiswa > 50 && nilaiSiswa <= 55){
                        System.out.println(informationOut+ "D");
                    }else if (nilaiSiswa > 55 && nilaiSiswa <= 60){
                        System.out.println(informationOut+ "C-");
                    }else if (nilaiSiswa > 60 && nilaiSiswa <= 65){
                        System.out.println(informationOut+ "C");
                    }else if (nilaiSiswa > 65 && nilaiSiswa <= 70){
                        System.out.println(informationOut+ "C+");
                    }else if (nilaiSiswa > 70 && nilaiSiswa <= 74){
                        System.out.println(informationOut+ "B-");
                    }else if (nilaiSiswa > 74 && nilaiSiswa <= 76){
                        System.out.println(informationOut+ "B");
                    }else if (nilaiSiswa > 76 && nilaiSiswa <= 80){
                        System.out.println(informationOut+ "B+");
                    }else if (nilaiSiswa > 80 && nilaiSiswa <= 85){
                        System.out.println(informationOut+ "A-");
                    }else if (nilaiSiswa > 85 ){
                        System.out.println(informationOut+ "A");
                    }else {
                        System.out.println("Input yang anda masukan salah");
                    }
                }else{
                    System.out.println("Input yang anda masukan salah");
                }
            }else if(selectApp == 2){
                System.out.println("Masukan Grade Siswa (A,A-,B+,B,B-,C+,C,C-,D,E)");
                Scanner gradeSiswaIn = new Scanner(System.in);
                String informationOut = "Rentang Nilai Siswa Berdasar Grade Ialah ";

                String gradeSiswa =  gradeSiswaIn.next();

                if (gradeSiswa != "A" || gradeSiswa != "A-" || gradeSiswa != "B+" || gradeSiswa != "B" || gradeSiswa != "B-" || gradeSiswa != "C+" || gradeSiswa != "C" || gradeSiswa != "C-" || gradeSiswa != "D" || gradeSiswa != "E")

                    switch (gradeSiswa){
                        case "A" :
                            System.out.println(informationOut+ "86 - 100");
                            break;
                        case "A-" :
                            System.out.println(informationOut+ "81 - 85");
                            break;
                        case "B+" :
                            System.out.println(informationOut+ "77 - 80");
                            break;
                        case "B" :
                            System.out.println(informationOut+ "75 - 76");
                            break;
                        case "B-" :
                            System.out.println(informationOut+ "71 - 74");
                            break;
                        case "C+" :
                            System.out.println(informationOut+ "66 - 70");
                            break;
                        case "C" :
                            System.out.println(informationOut+ "61 - 65");
                            break;
                        case "C-" :
                            System.out.println(informationOut+ "56 - 60");
                            break;
                        case "D" :
                            System.out.println(informationOut+ "51 - 55");
                            break;
                        case "E" :
                            System.out.println(informationOut+ "0 - 50");
                            break;

                        default:
                            System.out.println("Input yang anda masukkan salah atau huruf tidak kapital");
                            break;
                    }
            }
        }else{
            System.out.println("Input yang anda masukan salah");
        }
    }
}

