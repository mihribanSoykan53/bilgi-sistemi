package nesnetaban1;

import java.io.IOException;
import java.util.Scanner;


public	class denem  {
		 public static void main(String arg[]) throws IOException {
			 Scanner scan=new Scanner(System.in);
		
		islem z=new islem();
		z.kullaniciGris();                //nesne oluþturduk
		 Kayitlar x = new Kayitlar();
		 Kayitlar c=new Kayitlar();
				 
		 System.out.println("*******************OGRENCI KAYIT DUZENLEME SISTEMI********************\n\n");
		 
		 x.ekle(new Ogrenci2("mihriban soykan", 'k',"Bilgisayar", 2, 2, 100));
		 x.ekle(new Ogrenci2("emine uslu", 'k',"Bilgisayar", 7, 456,56));
		 x.ekle(new Ogrenci2("evren kuran", 'e',"Bilgisayar", 4, 12, 80));                //listede bulunmasý için ögrenci oluþturduk 
		 x.ekle(new Ogrenci2("kývýlcým yavuz", 'k',"Bilgisayar", 4, 3589, 65));
		 x.ekle(new Ogrenci2("efken karaduman", 'e',"Bilgisayar", 4, 789, 90));
		 x.ekle(new Ogrenci2("mahinev karaduman", 'k',"Bilgisayar", 4, 69, 85));
		 x.ekle(new Ogrenci2("gülçehre karaisaoðlu", 'k',"Bilgisayar", 4, 147, 54));
		 
		 x.listele(); // listeleme yaptýk
		 
		 Ogrenci2 sonuc = x.enBuyukOrtalamaliOgrenci();// ene buyuk ortalamalý ögrenciyi gösteriyor
		 System.out.println("En buyuk ortalamali ogrenci: \n"+sonuc);
		 
		 //islem secenekleri   kullanacý  ögrenci ekleyip çikartýyor
		 for(int t=0;t<t+1;t++) {
			System.out.println("ÝSLEM SECENEKLERÝ\n-------------------------");
			System.out.println("1.Ögrenci cikar\n2.Ögrenci ekle\n3.Programdan çik\nLutfen birini seciniz");
			int v=scan.nextInt();
			switch(v) {
			case 1:
				System.out.println("çikarmak istediðiniz ögrenci numarasý");
				int y=scan.nextInt();
			x.cikart(y);
			x.listele();
			 Ogrenci2 r = x.enBuyukOrtalamaliOgrenci();
			 System.out.println("En buyuk ortalamali ogrenci: \n"+r);
			 
			break;
			case 2:
				//ogrenci eklemek için ogrenci bilgileri alýnýyor
				 String ad;
					String cns;
					String blm;
					int dnm;
					int ogrNo;
					int not1;
					int not2;
					float ort;
					System.out.println("ögrenci adýný giriniz:");
					ad=scan.next();
					System.out.println("ögrenci cisiyetini giriniz:(k veya e olarak)");
					cns=scan.next();
					String s=cns;
					char a;
					 a=s.charAt(0);;  //string girilen cinsiyeti  char tipine çevirdik
					System.out.println("ögrencinin bolumunu giriniz:");
					blm=scan.next();
					System.out.println("ögrencinin donemini giriniz:");
					dnm=scan.nextInt();
					System.out.println("ögrencinin numarasini giriniz:");
					ogrNo=scan.nextInt();
					System.out.println("ögrencinin vize notunu giriniz:");
					not1=scan.nextInt();
					System.out.println("ögrencinin final notunu giriniz:");
					not2=scan.nextInt();
					islem w=new islem();
					ort=w.ortBul(not1, not2);
					Ogrenci2 d=new Ogrenci2(ad,a,blm,dnm,ogrNo,ort);
					x.ekle(d);
					x.listele();
					 Ogrenci2 i = x.enBuyukOrtalamaliOgrenci();
					 System.out.println("En buyuk ortalamali ogrenci: \n"+i);
					 
					break;
			}
			//program çýkýþý
			if(v==3) {
				System.out.println("Programdan çikilýyor...");
				break;
			}
		 }
		 }


	
		
		}

