
public class ej1a {

	public static void main(String[] args) {
		String txt1 = "aabbccaaabb";
		char letra = 'a';
		int cont = 0;
		
		for (int i = 0 ; i < txt1.length(); i++  ) {
				
				if(txt1.charAt(i) == letra) {
					cont++;
					
			}
					
		}
						System.out.println(cont);
					
	}

}
