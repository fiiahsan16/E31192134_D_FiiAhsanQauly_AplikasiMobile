import java.util.Scanner;

public class AlternatifIf {
    public static void main(String[] args) {
  	    System.out.print("Masukkan sebuah bilangan bulat: ");
  	    Scanner scan = new Scanner(System.in);
  	    
  	    int bilangan = scan.nextInt();

        String keterangan;
        boolean genap = (bilangan % 2 == 0);
        if (genap)
            keterangan = "bilangan genap.";
        else
        	keterangan = "bilangan ganjil.";
        
        System.out.println(bilangan + " adalah "  + keterangan);
  	    
  	scan.close(); // Tutup objek Scanner
    }

}
