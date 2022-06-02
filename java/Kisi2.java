package nesnetaban1;


public	class Kisi2 {
		private String isim;        //degiþken oluþturdum
		private char cinsiyet;
		 
		 
		 public Kisi2(String gelenIsim, char gelenCinsiyet) {
		 this.isimSetEt(gelenIsim);
		 this.cinsiyetSetEt(gelenCinsiyet);
		 }
		 //gelen ismi bu clasta ki degiþkene eþitliyor
		 public void isimSetEt(String yeniIsim) {
			 //karekteri büyük harfe çeviriyor
		 this.isim = yeniIsim.toUpperCase();
		 }
		 //gelen cinsiyet degerini burdakine eþitliyor 
		 public void cinsiyetSetEt(char gCinsiyet) {
		 if(gCinsiyet != 'e' && gCinsiyet != 'k') {   //eger gelen cinsiyet yanlýþsa yanlýþ oldugunu söylüyo
		 System.out.println("Cinsiyet bilgisi \"e\" ya da \"k\" olmali.");
		 System.out.println("Yanlis bir deger girdiniz...");
		 System.out.println("Program sonlaniyor");
		 System.exit(0); //porogramý durduruyor
		 }
		 else  //gelen cinsiyet dogru verilmiþse clastaki degiþkene eþitliyor
		 this.cinsiyet = gCinsiyet;
		 }
		 
		// isim degerini döndürüyor
		 public String ismiGetir() {
		 return this.isim;
		 }
		 //cinsiyet degerini döndürüyor 
		 public char cinsiyetiGetir() {
		 return this.cinsiyet;
		 }
		 
		 //kiþi bilgilerini yazdýrýr ve bu bilgileri döndürüyor
		 public String toString() {
		 String str="";
		 str += "Kisi Bilgileri\n";
		 str += "Isim: "+this.ismiGetir()+"\n";
		 str += "Cinsiyet :"+this.cinsiyetiGetir()+"\n";
		 return str;
		 }
		}
		
		
		
		

