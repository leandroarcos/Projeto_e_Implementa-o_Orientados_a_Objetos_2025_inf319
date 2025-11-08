package inf319.exercise08;

/**
 * Esta classe implementa uma pilha (Stack) reutilizando a classe Fila (Queue).
 *
 * <p><b>Análise de Design de POO: Herança vs. Composição</b></p>
 *
 * <p>Este exercício utiliza <b>Herança</b>, onde {@code Stack extends Queue}. Isso significa
 * que a Pilha "é uma" Fila. Embora permita o reuso direto dos métodos e atributos
 * protegidos da classe {@code Queue}, esta abordagem viola o <b>Princípio da Substituição
 * de Liskov (LSP)</b>. Uma pilha (LIFO - Last-In, First-Out) tem um comportamento
 * fundamentalmente diferente de uma fila (FIFO - First-In, First-Out). Herdar de
 * {@code Queue} expõe métodos como {@code enqueue} e {@code dequeue} na interface pública
 * de {@code Stack}, o que pode levar a um uso incorreto e confuso.</p>
 *
 * <p>Uma abordagem de design alternativa e mais robusta seria usar <b>Composição</b>.
 * Na composição, a classe {@code Stack} conteria uma instância de {@code Queue}
 * (relação "tem um"). A {@code Stack} delegaria o armazenamento para o objeto
 * {@code Queue} interno, mas implementaria sua própria lógica LIFO, sem expor os
 * métodos da fila. Isso resulta em um acoplamento mais fraco e um modelo conceitual
 * mais correto.</p>
 *
 * <p>A implementação atual segue o requisito do exercício de usar herança.</p>
 */
public class Stack extends Queue {

    /**
     * Cria uma nova pilha com a capacidade máxima padrão.
     */
    public Stack() {
        super();
    }

    /**
     * Cria uma nova pilha com a capacidade máxima fornecida.
     * 
     * @param size a capacidade máxima.
     */
    public Stack(int size) {
        super(size);
    }
    
    /**
     * Adiciona um elemento ao topo da pilha, se houver uma posição disponível.
     * Para simular o comportamento LIFO usando uma fila (FIFO), o novo elemento
     * é adicionado ao final e, em seguida, todos os elementos anteriores são
     * movidos para depois dele, colocando o novo elemento na frente.
     * 
     * @param element o elemento a ser empilhado.
     * @return {@code true} se a operação for bem-sucedida, {@code false} caso contrário.
     */
    public boolean push(Object element) {
        if (remaining() == 0) {
            return false;
        }
        int currentSize = size();
        // Adiciona o novo elemento no final da fila.
        super.enqueue(element);
        // Rotaciona a fila para que o novo elemento fique na frente.
        for (int i = 0; i < currentSize; i++) {
            super.enqueue(super.dequeue());
        }
        return true;
    }

    /**
     * Remove o elemento do topo da pilha.
     * Como o método push garante que o último elemento inserido está sempre
     * na frente da fila, o pop simplesmente remove o elemento da frente.
     *  
     * @return o elemento do topo da pilha, ou {@code null} se a pilha estiver vazia.
     */
    public Object pop() {
        // O método dequeue da superclasse já remove da frente e retorna null se vazio.
        return super.dequeue();
    }

}
