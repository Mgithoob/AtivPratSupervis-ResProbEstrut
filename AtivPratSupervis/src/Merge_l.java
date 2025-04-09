// Classe para a primeira parte da questão 3.
// Usada para juntar duas filas dinâmicas que funcionam internamente com uma lista encadeada.

public class Merge_l {
    public Merge_l() {
    }

    public Fila_l juntar(Fila_l A, Fila_l B)
    {
        // DEBUG
        System.out.println("DEBUG - Filas recebidas  ------------");
        System.out.println("Fila A:"); A.imprimir(true);
        System.out.println("Fila B:"); B.imprimir(true);

        // Inicialização da fila C
        Fila_l C = new Fila_l();

        // Loop que compara elementos de A e B antes de adicionar.
        while(!(A.vazia() || B.vazia()))
        {
            // DEBUG
            System.out.println("DEBUG - Loop comparador  ------------");
            System.out.println("Fila A:"); A.imprimir(true);
            System.out.println("Fila B:"); B.imprimir(true);
            System.out.println("Fila C:"); C.imprimir(true);

            if (A.olhar() <= B.olhar()) { C.adicionar(A.retirar()); }
            else C.adicionar(B.retirar());
        }

        // Caso todos os valores de uma das filas já foram passados,
        // podemos apenas colocar os valores restantes da outra fila em C.
        if (A.vazia())
        {
            System.out.println("DEBUG - Fila A está vazia! ------------");

            while ( !B.vazia() )
            {
                // DEBUG
                System.out.println("DEBUG - Loop Fila A vazia  ------------");
                B.imprimir(true); C.imprimir(true);

                C.adicionar(B.retirar());
            }
        }
        if (B.vazia())
        {
            System.out.println("DEBUG - Fila B está vazia! ------------");
            B.imprimir(true);

            while ( !A.vazia() )
            {
                // DEBUG
                System.out.println("DEBUG - Loop Fila B vazia  ------------");
                System.out.println("Fila A:"); A.imprimir(true);
                System.out.println("Fila C:"); C.imprimir(true);

                C.adicionar(A.retirar());
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
