package nesnetaban1;

import java.util.Scanner;

public class islem extends kul_giris{

	
	//ortalamayı hesaplıyor
	@Override
	public float ortBul(int ilkSinav, int sonSinav) {
		
		
		float ort=0;
		ort=(float) ((ilkSinav*0.4)+(sonSinav*0.6));
		
				
		
		//ortalamayı döndürür
		return ort;
	}

	
	}


