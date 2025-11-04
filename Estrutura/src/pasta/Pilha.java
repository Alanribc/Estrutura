public class Pilha{
    private int[] p;
    private int topo = -1;

    public Pilha(int tamanho){
        p = new int[tamanho];
    }

    public int pop(){
        if(pilhaVazia()){
            System.out.println("pilha vazia");
            return -1;
        }else{
            return p[topo--];
        }
    }

    public boolean push(int valor){
        if(pilhaCheia()){
            System.out.println("pilha cheia");
            return false;
        }else{
            topo++;
            p[topo] = valor;
            return true;
        }
    }

    public boolean pilhaCheia(){
        if(topo == p.length - 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean pilhaVazia(){
        if(topo == -1){
            return true;
        }else{
            return false;
        }
    }

    public int mostrarTopo(){
        return p[topo];
    }
}