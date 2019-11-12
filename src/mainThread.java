import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainThread {
	private static Integer quantidade = 50000000;

	public static int[] vetorC = new int[quantidade];
	public static int[] vetorA = new int[quantidade];
	public static int[] vetorB = new int[quantidade];

	public static void main(String[] args) {


		


		// Define um pool de execução de threads (máximo 100 executando simultaneas)
		ExecutorService exec = Executors.newFixedThreadPool(2);

		Random rand = new Random();
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = rand.nextInt(1000);
			vetorA[i] = rand.nextInt(1000);
		}
		//
		
		long tempoInicial = System.currentTimeMillis();

		Thread ts = null;

		for (int i = 0; i < vetorA.length; i+=10000) {
			ts = new ThreadPopular(i,10000);
			exec.submit(ts);
		}

		try {
			ts.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		for (int i = 0; i < vetorA.length; i+=25000000) {
			ts = new ThreadSoma(i,25000000);
			exec.submit(ts);
		}
		
		try {
			ts.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		for (Integer a : vetorC) {
//			System.out.println(a);
//		}


		
//		tempoInicial = System.currentTimeMillis();
	    
	    
		System.out.println("o metodo executou em " + (System.currentTimeMillis() - tempoInicial));


	}
}