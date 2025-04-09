// Classe para a segunda parte do exercício 3.
// Usada para juntar duas filas estáticas que funcionam internamente com um vetor.

public class Merge_v {
    public Merge_v() {
    }

    public Fila juntar(Fila A, Fila B)
    {
        // DEBUG
        System.out.println("DEBUG - Filas recebidas  ------------");
        System.out.println("Fila A:"); A.imprimir(true);
        System.out.println("Fila B:"); B.imprimir(true);

        // Inicialização da fila C
        int tamanhoC = (A.getMAX() + B.getMAX()) - 1;
        Fila C = new Fila(tamanhoC);

        // Loop que compara elementos de A e B antes de adicionar.
        while(!(A.vazia() || B.vazia()))
        {
            // DEBUG
            System.out.println("DEBUG - Loop comparador  ------------");
            System.out.println("Fila A:"); A.imprimir(true);
            System.out.println("Fila B:"); B.imprimir(true);
            System.out.println("Fila C:"); C.imprimir(true);

            if (A.olhar() <= B.olhar()) { C.inserir(A.retirar()); }
            else C.inserir(B.retirar());
        }

        // Caso todos os valores de uma das filas já foram passados,
        // podemos apenas colocar os valores restantes da outra fila em C.
        if (A.vazia())
        {
            System.out.println("DEBUG - Fila A está vazia! ------------");

            for (int i = B.getInicio(); i < B.getFim(); i++)
            {
                // DEBUG
                System.out.println("DEBUG - Loop Fila A vazia  ------------");
                B.imprimir(true); C.imprimir(true);

                C.inserir(B.retirar());
            }
        }
        if (B.vazia())
        {
            System.out.println("DEBUG - Fila B está vazia! ------------");
            B.imprimir(true);

            for (int i = A.getInicio(); i < A.getFim(); i++)
            {
                // DEBUG
                System.out.println("DEBUG - Loop Fila B vazia  ------------");
                System.out.println("Fila A:"); A.imprimir(true);
                System.out.println("Fila C:"); C.imprimir(true);

                C.inserir(A.retirar());
            }
        }

        // DEBUG
        System.out.println("DEBUG - Status final ------------");
        System.out.println("Fila A:"); A.imprimir(true);
        System.out.println("Fila B:"); B.imprimir(true);
        System.out.println("Fila C:"); C.imprimir(true);

        return C;
    }

}