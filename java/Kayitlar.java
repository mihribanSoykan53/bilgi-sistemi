package nesnetaban1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Kayitlar {
		//dizi tan�mlad�k
		 Ogrenci2 dizi[];
		 public Kayitlar() {
		 }
		 //ogrenci kay�t eden metot
		 public void Kayitlar(Ogrenci2 yeniEleman) {
			 // 1 eleman tutabilen bir  yap� tan�mlad�k 
		 this.dizi = new Ogrenci2[1];
		 this.dizi[0] = yeniEleman;    //ilk eleman� atad�k
		 }
		 
		 //ogrenci ekliyor
		 public void ekle(Ogrenci2 eklenecekOgr) {
		 if(this.dizi == null) {   //dizi bo� ise 1elemanl� dizi olu�turup ilk eleman�n� at�yor
		 dizi = new Ogrenci2[1];
		 this.dizi[0] = eklenecekOgr;
		
		 }
		 else {  //eger dizi bo� degilse  ogrenci2 tipinde bir temp dizisi ol�turup uzunlugunu da dizinin uzunlugunun 1 fazlas� yap�yor
		 Ogrenci2 tmp[] = new Ogrenci2[dizi.length+1];
		 for(int i=0; i < dizi.length; i++)
		 tmp[i] = dizi[i];                      //dong� sayesinde tmp diziyi dizi degi�kenine e�itliyor
		 tmp[tmp.length-1] = eklenecekOgr;      //diziye verileyi yaz�yor 
		 this.dizi = tmp;          //clastaki diziyi tmp array'ine e�itliyor
		
		 }
		 }
		 
		 // �grenci cikaran fonksiyon
		 public void cikart(int id) {
		 Ogrenci2 tmp[] = new Ogrenci2[dizi.length-1];   //tmp dizisini olu�turduk
		 int indeks=0;                                   //index degeri tan�mlad�k 
		 for(int i=0; i < dizi.length; i++)
		 if(dizi[i].numarayiGetir() == id)               //dizinin i. eleman�ndak� ogrenci numaras�n�n gelen no ya e�it olup olmad�g�na bakt�k
		 indeks = i;                                     //index degerini  i degerine e�itledik
		 for(int i=0; i < indeks; i++)                    //index degerine kadar dond�rd�k 
		 tmp[i] = dizi[i];                                 // tmp dizidini dizi ye e�itledik 
		 for(int i = indeks; i < dizi.length-1; i++)       //index degerinden  dizinin uzunluguna kadar artt�rd�k
		 tmp[i] = dizi[i+1];                               //tmp dizisinde ki degeri  dizinin bir sonraki degerine e�itledi 
		 dizi = tmp;                                       //diziyi tmp e�itledi
		System.out.println("�grencinin kayd� silinmi�tir.");
		 }
		 
		 
		 // bilgileri listeleme i�i yap�yor
		 public void listele() throws IOException {
		 System.out.println("Kayitlar listeleniyor:");
		 System.out.println("--------------------");
		 for(int i=0; i < dizi.length; i++) {    //diziyi donduruyor
		
		 System.out.println(""+dizi[i]);         //diziyi ekrana yazd�r�yor
		 BufferedWriter  bwriter=new BufferedWriter(new FileWriter("ogrenci.txt",true));
		 bwriter.write(""+dizi[i]);
		 bwriter.flush();
			bwriter.newLine();       //kay�tlar� dosyaya yazar
			bwriter.close();
		 }
		 }
		 
		 //b�y� ortalamal� �grenciyi g�steriyor
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
