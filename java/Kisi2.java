package nesnetaban1;


public	class Kisi2 {
		private String isim;        //degi�ken olu�turdum
		private char cinsiyet;
		 
		 
		 public Kisi2(String gelenIsim, char gelenCinsiyet) {
		 this.isimSetEt(gelenIsim);
		 this.cinsiyetSetEt(gelenCinsiyet);
		 }
		 //gelen ismi bu clasta ki degi�kene e�itliyor
		 public void isimSetEt(String yeniIsim) {
			 //karekteri b�y�k harfe �eviriyor
		 this.isim = yeniIsim.toUpperCase();
		 }
		 //gelen cinsiyet degerini burdakine e�itliyor 
		 public void cinsiyetSetEt(char gCinsiyet) {
		 if(gCinsiyet != 'e' && gCinsiyet != 'k') {   //eger gelen cinsiyet yanl��sa yanl�� oldugunu s�yl�yo
		 System.out.println("Cinsiyet bilgisi \"e\" ya da \"k\" olmali.");
		 System.out.println("Yanlis bir deger girdiniz...");
		 System.out.println("Program sonlaniyor");
		 System.exit(0); //porogram� durduruyor
		 }
		 else  //gelen cinsiyet dogru verilmi�se clastaki degi�kene e�itliyor
		 this.cinsiyet = gCinsiyet;
		 }
		 
		// isim degerini d�nd�r�yor
		 public String ismiGetir() {
		 return this.isim;
		 }
		 //cinsiyet degerini d�nd�r�yor 
		 public char cinsiyetiGetir() {
		 return this.cinsiyet;
		 }
		 
		 //ki�i bilgilerini yazd�r�r ve bu bilgileri d�nd�r�yor
		 public String toString() {
		 String str="";
		 str += "Kisi Bilgileri\n";
		 str += "Isim: "+this.ismiGetir()+"\n";
		 str += "Cinsiyet :"+this.cinsiyetiGetir()+"\n";
		 return str;
		 }
		}
		
		
		
		

