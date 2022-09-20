package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		
		String metin ="İlginizi Çekebilir";
		String altMetin ="Vade Suresi";
		
		System.out.println(metin);
		System.out.println(altMetin);
		
		/* değişken isimlendirmeleri camelCase yazılır
		Yani kelimenin ilk harfi küçük sonraki harfi büyük.*/
		
		int vade = 12;
		double dolarDun = 18.10;
		double dolarBugun = 18.10;
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { 
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} else if (dolarBugun>dolarDun) {
			
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
			
		}
	}

}
