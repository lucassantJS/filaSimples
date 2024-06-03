public class Main {
    public static void main(String[] args) {
        fila_simples filaSimples = new fila_simples(7);

        // método adicionar
        filaSimples.adicionar(10);
        filaSimples.adicionar(10);
        filaSimples.adicionar(10);
        filaSimples.adicionar(20);
        filaSimples.adicionar(30);
        filaSimples.adicionar(40);
        filaSimples.adicionar(50);
        filaSimples.exibirElemento(); //

       // método remover
        filaSimples.remover();
      filaSimples.exibirElemento(); //

        // método removerTodasOcorrencias
       filaSimples.removerTodasOcorrencias(10);
      filaSimples.exibirElemento();

      // método buscar
        boolean encontrado = filaSimples.buscar(40);
        System.out.println("\n" + encontrado);

      // métodos maior e menor
        Integer maiorElemento = filaSimples.maior();
      System.out.println("\nMaior elemento na fila: " + maiorElemento);

        Integer menorElemento = filaSimples.menor();
        System.out.println("Menor elemento na fila: " + menorElemento);

        // método media
        Double media = filaSimples.media();
        System.out.println("\n" + media);

        // método quantidade
       int quantidade = filaSimples.quantidade();
        System.out.println("\n" + quantidade);

       // método aumento de capacidade
        System.out.println();
       filaSimples.aumentarCapacidade();
       filaSimples.adicionar(120);
       filaSimples.exibirElemento();
    }
}
