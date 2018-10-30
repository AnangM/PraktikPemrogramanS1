import javax.swing.JOptionPane;
class tugas2{
    public static void main(String[] args) {

	//variable init
        String nama,nim,alamat;
        try{

	//input nama
            nama = JOptionPane.showInputDialog(null,"Masukkan Nama ", 
		"Masukkan Data...",
		JOptionPane.QUESTION_MESSAGE
		);
	
	//input NIM
            nim = JOptionPane.showInputDialog(null,"Masukkan NIM ", 
		"Masukkan Data...",
		JOptionPane.QUESTION_MESSAGE
		);

	//input Alamat	
            alamat = JOptionPane.showInputDialog(null,"Masukkan Alamat ", 
		"Masukkan Data...",
		JOptionPane.QUESTION_MESSAGE
		);

	//output
            JOptionPane.showMessageDialog(null, 
                "Nama : " + nama + 
                "\nNIM :" + nim +
                 "\nALamat : " + alamat,
		"Data Anda",
		JOptionPane.INFORMATION_MESSAGE
 		);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}