import java.util.Arrays;

public class ej1b {

	public static void main(String[] args) {
		int numeros[] = new int [3];
		
			numeros[0]=3;
			numeros[1]=1;
			numeros[2]=8;
			System.out.println("Antes de ordenar: " + Arrays.toString(numeros));
			Arrays.sort(numeros);
			System.out.println("ordenado de menor a mayor: " + Arrays.toString(numeros));
			

	}

}
