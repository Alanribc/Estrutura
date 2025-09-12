import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    Random r = new Random(); // gerar números aleatórios
	    final int TAMANHO_V1 = 20;
	    final int TAMANHO_V2 = 10;
	    int sorteio;
	    int []v1 = new int[TAMANHO_V1];
	    int []v2 = new int[TAMANHO_V2];
	    int []v = new int[TAMANHO_V1+TAMANHO_V2];
	    
	    // preenche v1 e v2
	     v1[0] = r.nextInt(100);
	    for(int i = 1; i < v1.length; i++)
	        v1[i] = v1[i-1]+r.nextInt(100); // sorteio de valores entre 0 e 99
	    v2[0] = r.nextInt(100);
	    for(int i = 1; i < v2.length; i++)
	        v2[i] = v2[i-1]+r.nextInt(100); // sorteio de valores entre 0 e 99
	   
	   // exibe os valores de v1 e v2 
	    for(int i = 0; i < v1.length; i++)
	        System.out.print(" "+v1[i]);
	    System.out.println();
	    for(int i = 0; i < v2.length; i++)
	        System.out.print(" "+v2[i]);
	        
	    // mesclar v1 e v2 em v
		
	    
	    // exibir v
		for(int i = 0; i<v1.length; i++){
			System.out.println(v1[i] + " ");
		}
	    System.out.println("]");
	}
}