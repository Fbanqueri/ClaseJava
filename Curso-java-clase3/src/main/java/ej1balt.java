import java.util.Arrays;

public class ej1balt {

	public static void main(String[] args) {
		int numeros[] = new int [3];
		int num = 0;
		
		
		numeros[0]=3;
		numeros[1]=1;
		numeros[2]=8;
			
			for(int i= 0;i < numeros.length ;i++ ) {
				for(int j= i + 1; j < numeros.length; j++) {
					if(numeros[i]<numeros[j]) {
						num=numeros[i];
						numeros[i]=numeros[j];
						numeros[j]=num;
								
					}
						
				
				}
		

			}
			System.out.println("ordenado de mayor a menor: " + Arrays.toString(numeros));
	}
}