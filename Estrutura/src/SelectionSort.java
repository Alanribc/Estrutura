public class SelectionSort {
    public static void main(String[] args) {
        int []v = {2210, 13, 117, 1, 2, 43, 5, 7, 6, 8, 8, 7, 9, 7, 6, 68, 345};
        int x, y, indice_min, aux;
        int contaComparacao = 0;
        int contaTroca = 0;

        for(x = 0; x<v.length - 1; x++){
            indice_min = x;
            for(y = x + 1; y < v.length; y++){
                if(v[y] < v[indice_min]){
                    indice_min = y;
                    contaTroca++;
                }
                contaComparacao++;
            }

            aux = v[x];
            v[x] = v[indice_min];
            v[indice_min] = aux;
        }

        for(int i = 0; i < v.length; i++){
            System.out.println(v[i] + " ");
        }
        
        System.out.println("Quantidade Trocas: " + contaTroca);
        System.out.println("Quantidade Comparações: " + contaComparacao);
    }

}
