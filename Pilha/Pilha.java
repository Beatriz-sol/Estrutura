// Implementação da classe Pilha conforme ensinado nas aulas
class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;
    
    // Construtor
    public Pilha(int tamanho) {
        this.elementos = new int[tamanho];
        this.topo = -1;
        this.capacidade = tamanho;
    }
    
    // Métodos básicos da pilha
    public boolean isEmpty() {
        return (topo == -1);
    }
    
    public boolean isFull() {
        return (topo == capacidade - 1);
    }
    
    public void push(int valor) {
        if (!isFull()) {
            elementos[++topo] = valor;
        } else {
            System.out.println("Erro: Pilha cheia!");
        }
    }
    
    public int pop() {
        if (!isEmpty()) {
            return elementos[topo--];
        } else {
            System.out.println("Erro: Pilha vazia!");
            return -1; // valor de erro
        }
    }
    
    public int peek() {
        if (!isEmpty()) {
            return elementos[topo];
        } else {
            System.out.println("Erro: Pilha vazia!");
            return -1; // valor de erro
        }
    }
    
    // Método para exibir a pilha (útil para debug)
    public void exibir() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return;
        }
        
        System.out.print("Pilha: ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}