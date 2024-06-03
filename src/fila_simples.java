public class fila_simples {
    private Integer fila[];
    private int tamanho;
    private int capacidade;

    public fila_simples(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new Integer[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(Integer elemento) {
        if (tamanho < capacidade) {
            fila[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("A fila está cheia, não é possível adicionar mais elementos.");
        }
    }
    public void remover() {
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) {
                fila[i] = fila[i + 1];
            }
            fila[tamanho - 1] = null;
            tamanho--;
        } else {
            System.out.println("A fila está vazia, não é possível remover elementos.");
        }
    }
    public void removerTodasOcorrencias(Integer elemento) {
        int novoTamanho = 0;

        for (int i = 0; i < tamanho; i++) {
            if (!fila[i].equals(elemento)) {
                fila[novoTamanho] = fila[i];
                novoTamanho++;
            }
        }

        for (int i = novoTamanho; i < tamanho; i++) {
            fila[i] = null;
        }

        tamanho = novoTamanho;
    }
    public boolean buscar(Integer elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (fila[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
    public Integer maior() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia, não é possível encontrar o maior elemento.");
            return null;
        }

        Integer maiorElemento = fila[0];
        for (int i = 1; i < tamanho; i++) {
            if (fila[i] > maiorElemento) {
                maiorElemento = fila[i];
            }
        }
        return maiorElemento;
    }
    public Integer menor() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia, não é possível encontrar o menor elemento.");
            return null;
        }

        Integer menorElemento = fila[0];
        for (int i = 1; i < tamanho; i++) {
            if (fila[i] < menorElemento) {
                menorElemento = fila[i];
            }
        }
        return menorElemento;
    }
    public Double media() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia, não é possível calcular a média.");
            return null;
        }

        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += fila[i];
        }
        return soma / tamanho;
    }
    public int quantidade() {
        return tamanho;
    }
    public void aumentarCapacidade() {
        capacidade = capacidade * 2;
        Integer[] novaFila = new Integer[capacidade];
        for (int i = 0; i < tamanho; i++) {
            novaFila[i] = fila[i];
        }
        fila = novaFila;
    }
    public void exibirElemento() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(fila[i]);
        }
    }
}
