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

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j <= i; ++j) {
                pinos[i][j] = true;
            }
        }
        pinos[linha][coluna] = false;

    }

    public Tabuleiro(int tabuleiro) {
        for (int i = 4; i >= 0; --i) {
            for (int j = i; j >= 0; --j) {
                if ((tabuleiro & 1) == 1) {
                    pinos[i][j] = true;
                } else {
                    pinos[i][j] = false;
                }
                tabuleiro /= 2;
            }
        }

    }

    // copy constructor
    public Tabuleiro(Tabuleiro tab) {
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j <= i; ++j) {
                pinos[i][j] = tab.pinos[i][j];
            }
        }
    }

    public List<Tabuleiro> geradorPossiveisTabuleiros() {

        List<Tabuleiro> tabuleiros = new ArrayList<Tabuleiro>();

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j <= i; ++j) {

                Posicao inicio = new Posicao(i, j);
                List<Movimento> possiveisMovs = Movimentos.getMovimentos(inicio);
                for (Movimento mov : possiveisMovs) {

                    if (validaMovimento(mov)) {
                        tabuleiros.add(pulo(mov));
                    }
                }
            }
        }

        return tabuleiros;
    }

    public boolean validaMovimento(Movimento move) {
        if (!pinos[move.getInicio().getLinha()][move.getInicio().getColuna()]) // empty start
        {
            return false;
        }
        if (!pinos[move.getPulo().getLinha()][move.getPulo().getColuna()]) // empty jump over
        {
            return false;
        }
        if (pinos[move.getFim().getLinha()][move.getFim().getColuna()]) // filled in end
        {
            return false;
        }

        return true;
    }

    public Tabuleiro pulo(Movimento move) {

        Tabuleiro tab = new Tabuleiro(this);

        tab.pinos[move.getInicio().getLinha()][move.getInicio().getColuna()] = false;
        tab.pinos[move.getPulo().getLinha()][move.getPulo().getColuna()] = false;
        tab.pinos[move.getFim().getLinha()][move.getFim().getColuna()] = true;

        return tab;
    }

    public boolean verificaFim() {
        int contadorPinos = 0;

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (pinos[i][j]) {
                    contadorPinos++;
                    if (contadorPinos > 1) // optimize, early out, more than 1 pin is not final board
                    {
                        return false;
                    }
                }
            }
        }

        return contadorPinos == 1;
    }

}
