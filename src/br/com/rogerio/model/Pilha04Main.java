package br.com.rogerio.model;

import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class Pilha04Main {

    public static void main(String[] args) {
        int tamanho = 5;
        Pilha04 S = new Pilha04(tamanho);
        try {
            S.push("A");
            S.push("B");
            S.push("C");
            S.push("D");
            S.push("E");

            System.out.println("Elemento do topo: " + S.top());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!! " + erro.getMessage());
        }
    }
}
