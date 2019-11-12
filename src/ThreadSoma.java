public class ThreadSoma extends Thread{  
      
    Integer posicao;
    Integer quantidade; 
    
      
    public ThreadSoma(Integer posicao, int quantidade) {  
        this.posicao = posicao;  
        this.quantidade = quantidade;
    }  
  
    public void run() {  
    	
    	for (int i = 0; i < quantidade; i++) {
    		mainThread.vetorC[posicao+i] = mainThread.vetorA[i+posicao] + mainThread.vetorB[i+posicao];
    	}

    }  
}  