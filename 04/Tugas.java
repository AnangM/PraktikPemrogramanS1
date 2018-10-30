import javax.swing.JOptionPane;
class Tugas{
    public static void main(String[] args) {

	//variable init
        String nama,nim,alamat;
        try{

	//input nama
            nama = JOptionPane.showInputDialog(null,"Masukkan Alas ", 
		"Masukkan Data...",
		JOptionPane.QUESTION_MESSAGE
		);
	
	//input NIM
            nim = JOptionPane.showInputDialog(null,"Masukkan Tinggi ", 
		"Masukkan Data...",
		JOptionPane.QUESTION_MESSAGE
		);

	//output
            JOptionPane.showMessageDialog(null, 
                "Luas Segitiga = " + luasSegitiga(nama,nim),
		"Data Anda",
		JOptionPane.INFORMATION_MESSAGE
 		);

        }catch(Exception e){
            System.out.println(e);
        }
    }
	
	static String luasSegitiga(String a, String b){
	Double c,d;
	Double e;

	c = Double.parseDouble(a);
	d = Double.parseDouble(b);
	
	e = c*d/2;

	return e.toString();

}

}