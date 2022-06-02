package nesnetaban1;


	public class Ogrenci2 extends Kisi2 {
	private	 String bolum;
	private	 int donem;                //degi�kenleri tan�mlad�k 
	private	 int ogrenci_no;
	private	 String ortalama; 
		
		 //gelen verileri bu clas'ta ki  degi�kenlere e�itledik 
		 public Ogrenci2(String ad, char cns, String blm, int dnm, int ogrNo, float ort)
		 {
		 super(ad, cns);
		 this.bolumSetEt(blm);
		 this.donemiSetEt(dnm);
		 this.numaraSetEt(ogrNo);
		 this.ortalamaSetEt(ort);
		 }
		 
		 //b�l�m� dond�r�yoruz
		 public String bolumuGetir() {
		 return this.bolum;
		 }
		 
		 public void bolumSetEt(String yBolum) {
		 this.bolum = yBolum.toUpperCase(); // b�y�k harfe donu�tuyor
		 }
		 public int donemiGetir() {
		 return this.donem;                  //donemi dond�r�yor
		 }
		 public void donemiSetEt(int yDonem) {
		 this.donem = yDonem;                //gelen veriyi donem degi�kenine e�itliyor
		 }
		 public int numarayiGetir() {
		 return this.ogrenci_no;               //numaray� d�nd�r�yor
		 }
		 public void numaraSetEt(int ogrNo) {
		 this.ogrenci_no = ogrNo;               //gelen veriyi de�i�kene e�itliyor
		 }
		 public String ortalamayiGetir() {
		 return this.ortalama;                  //ortalamay� d�nd�r�yor
		 }
		 public void ortalamaSetEt(float yeniOrt) {
		 if(yeniOrt < 45)
		 this.ortalama = "F";
		 else if(yeniOrt >= 45 && yeniOrt < 60)
		 this.ortalama = "D";
		 else if(yeniOrt >= 60 && yeniOrt<65)          //not aral�g�na g�re harf notunu d�nd�r�r
		 this.ortalama = "C";
		 else if(yeniOrt >= 65 && yeniOrt<80)
		 this.ortalama = "B";
		 else if(yeniOrt >= 80 && yeniOrt <= 100)
		 this.ortalama = "A";
		 }
		 public String toString() {
		 String str = super.toString();
		 str += "Bolum: "+this.bolumuGetir()+"\n";      // yazd�rma i�lemi yapar ve d�nd�r�r
		 str += "Donem: "+this.donemiGetir()+"\n";
		 str += "Ogrenci No: "+this.numarayiGetir()+"\n";
		 str += "Ortalamasi: "+this.ortalamayiGetir()+"\n";
		 return str;
		 }
		} 
		

