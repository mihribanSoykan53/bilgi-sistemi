package nesnetaban1;

import java.util.Scanner;

public abstract class kul_giris implements arayuz{
	public kul_giris() {
		
	}
	
	
	public void kullaniciGris() {
		Scanner scan=new Scanner(System.in);
	
	   String kullanici;
		String kullanici_sifre;
		System.out.println("lutfen kullanici adinizi giriniz: ");
		kullanici=scan.next();
		
		System.out.println("lutfen kullanici sifrenizi giriniz: ");
		kullanici_sifre=scan.next();
		
		
	   if ((kullanici.equals(isim))|| ( kullanici_sifre.equals(sifre)))   {
			
		System.out.println("Giri� yap�lm��t�r.");
		}
	  else {
		
			System.out.println("Kullan�c� bilgileriniz hatal�!!!");
			 System.exit(0);
		}
		
	}

}
