public class AplicacaoBL {
    public static void main(String[] args) {
        VetorOrdenado v = new VetorOrdenado();

        boolean achou;

        achou = v.busca(1);
        System.out.println(achou);


    }
}

class VetorOrdenado{
    private int[] v = {1,3,5,7,8,10,12,15,17};

    public VetorOrdenado(){

    }

    public boolean busca(int valor){
        for(int i = 0; i<v.length; i++){
            if(v[i] == valor){
                return true;
            }
        }
        return false;
    }
    

}
