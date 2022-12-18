import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
	Scanner scanner  = new Scanner (System.in);
		
		String islemler = "İşlemler...\n"
				                +"1. Kare Alan Hesabı\n"
				                +"2. Üçgen Alan Hesabı\n"
		                        +"3. Daire Alan Hesabı\n"
		                        +"Çıkış : q";
		
		
   while (true) {
	   System.out.println(islemler);
	   System.out.println( "Hangi şeklin alanını hesaplamak istiyorsun?");
	   String sekil_turu = scanner.nextLine();
	   Sekil sekil = null;
	   
	   
	   if(sekil_turu.equals("q")) {
		   System.out.println("Programdan çıkılıyor.");		
		   break;
	   }   
	
   else if (sekil_turu.equals("1")){
	   
	   System.out.println("Karenin Kenarı: ");
	   int kenar = scanner.nextInt();
	   scanner.nextLine();
	   
	   sekil = new Kare("Kare1", kenar);
	   sekil.alan_hesapla();
	   
	}
   else if (sekil_turu.equals("2")) {
	   
	   System.out.println("Kenar 1 : ");
	   int kenar1 = scanner.nextInt();
	   System.out.println("Kenar 2 : ");
	   int kenar2 = scanner.nextInt();
	   System.out.println("Kenar 3 : ");
	   int kenar3 = scanner.nextInt();
	   scanner.nextLine();
	   
	   sekil = new Ucgen("Üçgen 1", kenar1, kenar2, kenar3);
	   sekil.alan_hesapla();
	
   }
   else if(sekil_turu.equals("3")){  
	   
	   System.out.println("Dairenin yarıçapı : ");
	   int yarıçap = scanner.nextInt();
	   scanner.nextLine();
	   sekil = new Daire("Daire 1", yarıçap);
	   
	   sekil.alan_hesapla();
   }
   else {
	   System.out.println("Geçersiz işlem...");
	   
	   
      }
	}
  }
}
