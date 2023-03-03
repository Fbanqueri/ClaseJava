
public class ej1c {

	public static void main(String[] args) {
		int numeros[] = {3,8,7,6,2} ;	
		int num = 5;
		int suma=0;
		
			for(int i= 0;i < numeros.length ;i++ ) {
				if(numeros[i] > num) {
					suma= suma + numeros[i];
				}
				
			}
			
		System.out.println(suma);

	

	}
}