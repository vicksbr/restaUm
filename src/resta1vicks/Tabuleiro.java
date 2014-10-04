/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resta1vicks;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author puzzi
 */
public class Tabuleiro {
    
    boolean[][] pinos = new boolean[5][5];
    
    public Tabuleiro(int linha, int coluna) { 
        
        for (int i = 0; i < 5; ++i)
            for (int j = 0; j <= i; ++j)
                pinos[i][j] = true;   
        pinos[linha][coluna] = false;
        
    }

    private Tabuleiro(Tabuleiro aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Tabuleiro> geradorPossiveisTabuleiros() {
    
        List<Tabuleiro> tabuleiros = new ArrayList<Tabuleiro>();

        for (int i = 0; i < 5; ++i) 
            for (int j = 0; j <= i; ++j) { 
            
                Posicao inicio = new Posicao(i,j);
                List<Movimento> possiveisMovs = Movimentos.getMovimentos(inicio);
                for (Movimento mov : possiveisMovs) { 

                    if (validaMovimento(mov))
                    tabuleiros.add(pulo(mov));
                }
            }
        
        return tabuleiros;
    }
    

   public boolean validaMovimento(Movimento move) {
		if (!pinos[move.getInicio().getLinha()][move.getInicio().getColuna()])	// empty start
			return false;
		if (!pinos[move.getPulo().getLinha()][move.getPulo().getColuna()])	// empty jump over
			return false;
		if (pinos[move.getFim().getLinha()][move.getFim().getColuna()])		// filled in end
			return false;
		
		return true;
	}
	
	
    public Tabuleiro pulo(Movimento move) {
		
                Tabuleiro gb = new Tabuleiro(this);
		
		gb.pinos[move.getInicio().getLinha()][move.getInicio().getColuna()] = false;
		gb.pinos[move.getPulo().getLinha()][move.getPulo().getColuna()] = false;
		gb.pinos[move.getFim().getLinha()][move.getFim().getColuna()] = true;
		
		return gb;
	} 
    
    
}   
    
    

