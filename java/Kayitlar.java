package nesnetaban1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Kayitlar {
		//dizi tanýmladýk
		 Ogrenci2 dizi[];
		 public Kayitlar() {
		 }
		 //ogrenci kayýt eden metot
		 public void Kayitlar(Ogrenci2 yeniEleman) {
			 // 1 eleman tutabilen bir  yapý tanýmladýk 
		 this.dizi = new Ogrenci2[1];
		 this.dizi[0] = yeniEleman;    //ilk elemaný atadýk
		 }
		 
		 //ogrenci ekliyor
		 public void ekle(Ogrenci2 eklenecekOgr) {
		 if(this.dizi == null) {   //dizi boþ ise 1elemanlý dizi oluþturup ilk elemanýný atýyor
		 dizi = new Ogrenci2[1];
		 this.dizi[0] = eklenecekOgr;
		
		 }
		 else {  //eger dizi boþ degilse  ogrenci2 tipinde bir temp dizisi olþturup uzunlugunu da dizinin uzunlugunun 1 fazlasý yapýyor
		 Ogrenci2 tmp[] = new Ogrenci2[dizi.length+1];
		 for(int i=0; i < dizi.length; i++)
		 tmp[i] = dizi[i];                      //dongü sayesinde tmp diziyi dizi degiþkenine eþitliyor
		 tmp[tmp.length-1] = eklenecekOgr;      //diziye verileyi yazýyor 
		 this.dizi = tmp;          //clastaki diziyi tmp array'ine eþitliyor
		
		 }
		 }
		 
		 // ögrenci cikaran fonksiyon
		 public void cikart(int id) {
		 Ogrenci2 tmp[] = new Ogrenci2[dizi.length-1];   //tmp dizisini oluþturduk
		 int indeks=0;                                   //index degeri tanýmladýk 
		 for(int i=0; i < dizi.length; i++)
		 if(dizi[i].numarayiGetir() == id)               //dizinin i. elemanýndaký ogrenci numarasýnýn gelen no ya eþit olup olmadýgýna baktýk
		 indeks = i;                                     //index degerini  i degerine eþitledik
		 for(int i=0; i < indeks; i++)                    //index degerine kadar dondürdük 
		 tmp[i] = dizi[i];                                 // tmp dizidini dizi ye eþitledik 
		 for(int i = indeks; i < dizi.length-1; i++)       //index degerinden  dizinin uzunluguna kadar arttýrdýk
		 tmp[i] = dizi[i+1];                               //tmp dizisinde ki degeri  dizinin bir sonraki degerine eþitledi 
		 dizi = tmp;                                       //diziyi tmp eþitledi
		System.out.println("Ögrencinin kaydý silinmiþtir.");
		 }
		 
		 
		 // bilgileri listeleme iþi yapýyor
		 public void listele() throws IOException {
		 System.out.println("Kayitlar listeleniyor:");
		 System.out.println("--------------------");
		 for(int i=0; i < dizi.length; i++) {    //diziyi donduruyor
		
		 System.out.println(""+dizi[i]);         //diziyi ekrana yazdýrýyor
		 BufferedWriter  bwriter=new BufferedWriter(new FileWriter("ogrenci.txt",true));
		 bwriter.write(""+dizi[i]);
		 bwriter.flush();
			bwriter.newLine();       //kayýtlarý dosyaya yazar
			bwriter.close();
		 }
		 }
		 
		 //büyü ortalamalý ögrenciyi gösteriyor
		 public Ogrenci2 enBuyukOrtalamaliOgrenci() {
		 Ogrenci2 max=dizi[0];
		 for(int i=0; i < dizi.length; i++) {
		 if(dizi[i].ortalamayiGetir().compareTo(max.ortalamayiGetir()) ==-1) {
			 dizi[i] = max;
		 }
		 }
		 return max;
		 }
}
