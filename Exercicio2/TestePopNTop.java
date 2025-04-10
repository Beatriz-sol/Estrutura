import java.util.Scanner;

public class TestePopNTop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== TESTE DO MÉTODO popNTop =====");
        
        // Criar uma Pilha2 com tamanho 10
        Pilha2 Pilha2 = new Pilha2(10);
        
        // Preencher a Pilha2 com alguns valores
        System.out.println("\nPreenchendo a Pilha2 com valores...");
        for (int i = 1; i <= 5; i++) {
            Pilha2.push(i * 10);
            System.out.println("EmPilha2do: " + (i * 10));
        }
        
        // Mostrar a Pilha2 atual
        System.out.println("\nEstado atual da Pilha2:");
        Pilha2.exibir();
        
        try {
            // Solicitar ao usuário quantos elementos remover
            System.out.print("\nQuantos elementos deseja remover do topo? ");
            int n = scanner.nextInt();
            
            // Chamar o método popNTop
            Pilha2.popNTop(n);
            
            // Mostrar a Pilha2 após a remoção
            System.out.println("\nEstado da Pilha2 após remover " + n + " elementos:");
            Pilha2.exibir();
            
        } catch (Exception e) {
            System.out.println("\nOcorreu um erro: " + e.getMessage());
        }
        
        // Teste adicional - tentar remover mais elementos do que existem
        System.out.println("\n===== TESTE DE EXCEÇÃO =====");
        try {
            System.out.println("Tentando remover 10 elementos da Pilha2...");
            Pilha2.popNTop(10);
        } catch (Exception e) {
            System.out.println("Exceção capturada com sucesso: " + e.getMessage());
        }
        
        scanner.close();
        System.out.println("\nPrograma finalizado!");
    }
}