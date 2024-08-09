package fatorial;

public class FatorialJava {

	public int fatorial(int valor) {
		if (valor == 0 || valor == 1) {
			return 1;
		}
		return valor * fatorial(valor - 1);
	}

	public static void main(String[] args) {
		FatorialJava fatorialJava = new FatorialJava();
		System.out.println(fatorialJava.fatorial(5));
	}
}
