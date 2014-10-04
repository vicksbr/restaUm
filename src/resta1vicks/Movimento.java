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
public class Movimento {
    
    private Posicao inicio;
    private Posicao pulo;
    private Posicao fim;
    
    public Movimento(Posicao inicio, Posicao pulo, Posicao fim) {
        
        this.inicio = inicio;
        this.pulo = pulo;
        this.fim = fim;
        
    }
        
public Posicao getInicio() { return this.inicio; } 
public Posicao getPulo() { return this.pulo; } 
public Posicao getFim() { return this.fim; } 


public String toString() {
    StringBuffer sb = new StringBuffer();

    sb.append("{"+inicio);
    sb.append(","+pulo);
    sb.append(","+fim+ "}");

    return sb.toString();
}








}
