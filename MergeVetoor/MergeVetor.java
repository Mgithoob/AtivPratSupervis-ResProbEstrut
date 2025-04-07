package MergeVetoor;

public class MergeVetor {


    public MergeVetor() {
    }

    // Juntar dois arrays. A e B devem estar ordernados em ordem crescente.
    public int[] juntar(int[] A, int tamanhoA, int[] B, int tamanhoB){
        // Inicialização do vetor C
        int tamanhoC = tamanhoA + tamanhoB;
        int [] C = new int[tamanhoC];

        // Últimas posições dos vetores.
        int posA = 0;
        int posB = 0;
        int posC = 0;

        boolean vazioA = false;
        boolean vazioB = false;

        // TODO: Conferir que funciona para ints vazios (0)
        while(!(vazioA || vazioB)){


            // Caso todos os valores de um vetor já foram passados,
            // podemos apenas colocar os valores restantes do outro vetor em C.

            if (A[posA] <= B[posB]) {
                C[posC] = A[posA];
                posC++; posA++;
            } else {
                C[posC] = B[posB];
                posC++; posB++;
            }


            // ------------------------
            System.out.printf("A: %d, B: %d, C: %d\n", posA, posB, posC);

            if (posA == tamanhoA) vazioA = true;
            if (posB == tamanhoB) vazioB = true;
        }

        // Escrever loop para popular C
        if (vazioA){
            C[posC] = B[posB];
            posC++; posB++;
        }
        if (vazioB){
            C[posC] = A[posA];
            posC++; posA++;
        }


        return C;
    }
}
