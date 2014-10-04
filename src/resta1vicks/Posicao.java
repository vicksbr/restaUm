/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resta1vicks;

/**
 *
 * @author puzzi
 */
public class Posicao {
    
    int linha;
    int coluna;
    
    public  Posicao(int linha, int coluna) { 
       
        this.linha = linha;
        this.coluna = coluna;
        
    }

    public int getColuna() { return this.coluna; }
    public int getLinha() { return this.linha; } 

    public String toString() {
        return "[" + linha + "," + coluna + "]";
    }

    public boolean equals(Object obj) {
            if (!(obj instanceof Posicao))
                    return false;
            Posicao atual = (Posicao) obj;

            if (this.linha != atual.linha)
                    return false;

            return this.coluna == atual.coluna;
    }



}
