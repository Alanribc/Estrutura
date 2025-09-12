public class BubbleSort {
    public static void main(String[] args) {
        int []v = {2210, 13, 117, 1, 2, 43, 5, 7, 6, 8, 8, 7, 9, 7, 6, 68, 345};
        int aux = 0;
        int contaComparacao = 0;
        int contaTroca = 0;

        for(int n = v.length; n > 1; n--){
            for(int i = 0; i < (n - 1); i++){
                if(v[i] > v[i + 1]){
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    contaTroca++;
                }
                contaComparacao++;
            }
        }
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i] + " "); 
        }
        System.out.println("Operações de comparação: " + contaComparacao);
        System.out.println("Operações de troca: " + contaTroca);
    }
}
