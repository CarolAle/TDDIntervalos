package intervalos;


public class Intervalos {
    int[] numeros;
	private int[][] intervalos;
	
	public Intervalos(int[] numeros){
		this.numeros = numeros;
		Arrays.sort(this.numeros);
		intervalos = new int[numeros.length][];
	}
	public int[] getNumeros() {
		return numeros; 
		}

}
