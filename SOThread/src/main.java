import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long tempoInicial = System.currentTimeMillis();


		int[] vetor1 = new int[50000000],vetor2 = new int[50000000];
		Random rand = new Random();
		
		for (int i = 0; i < vetor2.length; i++) {
			vetor1[i] = rand.nextInt(1000);
			vetor2[i] = rand.nextInt(1000);
		}
		int[] vetorResultado = new int[50000000];
		
		for (int i = 0; i < vetorResultado.length; i++) {
			vetorResultado[i] = vetor1[i] + vetor2[i];
		}
		
//		for (int i = 0; i < vetorResultado.length; i++) {
//			System.out.println(vetorResultado[i]);
//		}
		System.out.println("o metodo executou em " + (System.currentTimeMillis() - tempoInicial));

	}

}
