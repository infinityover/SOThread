import java.util.Random;

public class ThreadPopular extends Thread{  
      
    Integer posicao;
    Integer quantidade; 
    Random rand = new Random();
    
      
    public ThreadPopular(Integer posicao, int quantidade) {  
        this.posicao = posicao;  
        this.quantidade = quantidade;
    }  
  
    public void run() {  
    	
    	for (int i = 0; i < quantidade; i++) {
    		mainThread.vetorA[posicao+i] = rand.nextInt(5000);
    		mainThread.vetorB[posicao+i] = rand.nextInt(5000);
    	}

    }  
}  