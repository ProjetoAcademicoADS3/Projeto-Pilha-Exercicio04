/*
 * T4. Seja S uma pilha inicialmente vazia. Primeiramente, o elemento A é inserido
 * em S. Em seguida, o elemento B, e assim por diante, até a inclusão final do
 * elemento E. Ao término dessas operações, qual elemento estará no topo
 * de S?
 * a) A. b) B. c) C. d) D. e) E.
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class Pilha04 {

    private int tamanho;
    private String[] elemento;
    private int topo;

    public Pilha04(int tamanho) {
        this.tamanho = tamanho;
        elemento = new String[tamanho];
        topo = -1;
    }

    public void push(String elemento) throws Exception {
        if (isFull()) {
            throw new Exception("A pilha está cheia!\n");
        }
        topo ++;
        this.elemento[topo] = elemento;
    }

    public String pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia!\n");
        }
        String elemento;
        elemento = this.elemento[topo];
        topo--;
        return elemento;
    }

    public boolean isEmpty() throws Exception {
        return topo == -1;
    }

    public boolean isFull() throws Exception {
        return topo == elemento.length - 1;
    }
    
     public String top() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia!");
        }
        return elemento[topo];
    }

}
