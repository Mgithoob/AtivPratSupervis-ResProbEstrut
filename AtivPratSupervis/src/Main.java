public class Main {

    public static void main(String[] args) {
        // Teste para a questão 1

        /*
        Pilha_l p = new Pilha_l();

        System.out.println("Inserindo primeiro item da pilha...");
        p.imprimir(true);
        p.adicionar(1);
        p.imprimir(true);
        System.out.println("Verificando topo da pilha...");
        System.out.printf("Topo: %d", p.olharTopo());

        System.out.println("Removendo primeiro item da pilha...");
        p.retirar();
        p.imprimir(true);

        p.retirar();

        System.out.println("Inserindo itens.");
        for (int i = 3; i <= 20; i++){
            p.adicionar(i + 1); p.imprimir(true);
        }

         */

        //Teste para a questão 2

        // Testes Fila
        /*
        Fila_l f = new Fila_l();
        f.imprimir(true);

        System.out.println("Inserindo primeiro item da fila...");
        f.adicionar(1);
        f.imprimir(true);

        System.out.println("Removendo primeiro item da fila...");
        f.retirar();
        f.imprimir(true);

        System.out.println("Removendo da fila vazia...");
        f.retirar();

        System.out.println("Inserindo itens...");
        for (int i = 0; i <= 10; i++){
            f.adicionar(i + 1); f.imprimir(true);
        }

        System.out.printf("Item obtido: %d\n", f.retirar());
        f.imprimir(true);

        System.out.println("Inserindo itens...");
        for (int i = 0; i <= 7; i++){
            f.adicionar(i + 1); f.imprimir(true);
        }

         */


        // Teste para a questão 3.1
        /*
        int[] dadosA = {3, 8, 9, 11, 21, 22};
        int[] dadosB = {1, 4, 5, 16, 19, 21, 23, 27};

        // Criando filas.
        Fila_l A = new Fila_l();
        for (int i = 0; i < 6; i++){
            A.adicionar(dadosA[i]);
        }
        Fila_l B = new Fila_l();
        for (int i = 0; i < 8; i++){
            B.adicionar(dadosB[i]);
        }

        Merge_l m = new Merge_l();
        m.juntar(A, B);
         */


        // Teste para a questão 3.2
        /*
        int[] dadosA = {1, 5, 9, 10, 17, 19};
        int[] dadosB = {2, 4, 4, 10, 16};

        // Fila esperada: {1, 2, 4, 4, 5, 9, 10, 10, 16, 17, 19}

        // Criando filas.
        Fila A = new Fila(7);
        for (int i = 0; i < 6; i++){
            A.inserir(dadosA[i]);
        }
        Fila B = new Fila(6);
        for (int i = 0; i < 5; i++){
            B.inserir(dadosB[i]);
        }

        Merge_v m = new Merge_v();
        m.juntar(A, B);
        */
    }
}
