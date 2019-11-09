import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainThread {
	private static Integer quantidade = 50000000;

	public static Integer[] vetorC = new Integer[quantidade];
	public static Integer[] vetorA = new Integer[quantidade];
	public static  Integer[] vetorB = new Integer[quantidade];

	public static void main(String[] args) {

		long tempoInicial = System.currentTimeMillis();


		// Define um pool de execução de threads (máximo 100 executando simultaneas)
		ExecutorService exec = Executors.newFixedThreadPool(5);

//		ThreadPopular ts1 = new ThreadPopular(25000000,25000000);
//		exec.submit(ts1);
//
//		ThreadPopular ts2 = new ThreadPopular(0,25000000);
//		exec.submit(ts2);
		


		for (int i = 0; i < vetorA.length; i+=10000) {
			ThreadPopular ts = new ThreadPopular(i,10000);
			exec.submit(ts);
		}
		
		for (int i = 0; i < vetorA.length; i+=10000) {
			ThreadSoma ts = new ThreadSoma(i,10000);
			exec.submit(ts);
		}
		exec.shutdown();

//		for (Integer a : vetorC) {
//			System.out.println(a);
//		}
		
		System.out.println("o metodo executou em " + (System.currentTimeMillis() - tempoInicial));



	}
}