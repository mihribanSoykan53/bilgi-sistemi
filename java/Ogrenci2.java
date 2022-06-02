package nesnetaban1;


	public class Ogrenci2 extends Kisi2 {
	private	 String bolum;
	private	 int donem;                //degiþkenleri tanýmladýk 
	private	 int ogrenci_no;
	private	 String ortalama; 
		
		 //gelen verileri bu clas'ta ki  degiþkenlere eþitledik 
		 public Ogrenci2(String ad, char cns, String blm, int dnm, int ogrNo, float ort)
		 {
		 super(ad, cns);
		 this.bolumSetEt(blm);
		 this.donemiSetEt(dnm);
		 this.numaraSetEt(ogrNo);
		 this.ortalamaSetEt(ort);
		 }
		 
		 //bölümü dondürüyoruz
		 public String bolumuGetir() {
		 return this.bolum;
		 }
		 
		 public void bolumSetEt(String yBolum) {
		 this.bolum = yBolum.toUpperCase(); // büyük harfe donuþtuyor
		 }
		 public int donemiGetir() {
		 return this.donem;                  //donemi dondürüyor
		 }
		 public void donemiSetEt(int yDonem) {
		 this.donem = yDonem;                //gelen veriyi donem degiþkenine eþitliyor
		 }
		 public int numarayiGetir() {
		 return this.ogrenci_no;               //numarayý döndürüyor
		 }
		 public void numaraSetEt(int ogrNo) {
		 this.ogrenci_no = ogrNo;               //gelen veriyi deðiþkene eþitliyor
		 }
		 public String ortalamayiGetir() {
		 return this.ortalama;                  //ortalamayý döndürüyor
		 }
		 public void ortalamaSetEt(float yeniOrt) {
		 if(yeniOrt < 45)
		 this.ortalama = "F";
		 else if(yeniOrt >= 45 && yeniOrt < 60)
		 this.ortalama = "D";
		 else if(yeniOrt >= 60 && yeniOrt<65)          //not aralýgýna göre harf notunu döndürür
		 this.ortalama = "C";
		 else if(yeniOrt >= 65 && yeniOrt<80)
		 this.ortalama = "B";
		 else if(yeniOrt >= 80 && yeniOrt <= 100)
		 this.ortalama = "A";
		 }
		 public String toString() {
		 String str = super.toString();
		 str += "Bolum: "+this.bolumuGetir()+"\n";      // yazdýrma iþlemi yapar ve döndürür
		 str += "Donem: "+this.donemiGetir()+"\n";
		 str += "Ogrenci No: "+this.numarayiGetir()+"\n";
		 str += "Ortalamasi: "+this.ortalamayiGetir()+"\n";
		 return str;
		 }
		} 
		

