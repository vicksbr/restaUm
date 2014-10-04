/*h
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resta1vicks;

/**
 *
 * @author puzzi
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class Movimentos {
	private static Map<Posicao,List<Movimento>> MovimentosValidos = new HashMap<Posicao,List<Movimento>>();
	
	static {
		/* 
		 *          0,0 
		 *       1,0  1,1
		 *     2,0  2,1  2,2
		 *   3,0  3,1  3,2  3,3
		 * 4,0  4,1  4,2  4,3  4,4
		 * 
		 */
		Posicao inicio;
		
		inicio = new Posicao(0,0);	
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(1,0), new Posicao(2,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(1,1), new Posicao(2,2)));
		
		inicio = new Posicao(1,0);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,0), new Posicao(3,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,1), new Posicao(3,2)));
		
		inicio = new Posicao(1,1);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,1), new Posicao(3,1)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,2), new Posicao(3,3)));	
		/* 
		 *          0,0 
		 *       1,0  1,1
		 *     2,0  2,1  2,2
		 *   3,0  3,1  3,2  3,3
		 * 4,0  4,1  4,2  4,3  4,4
		 * 
		 */	
		inicio = new Posicao(2,0);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(1,0), new Posicao(0,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,1), new Posicao(2,2)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,0), new Posicao(4,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,1), new Posicao(4,2)));
	
		inicio = new Posicao(2,1);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,1), new Posicao(4,1)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,2), new Posicao(4,3)));
		
		inicio = new Posicao(2,2);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(1,1), new Posicao(0,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,1), new Posicao(2,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,2), new Posicao(4,2)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,3), new Posicao(4,4)));	
		/* 
		 *          0,0 
		 *       1,0  1,1
		 *     2,0  2,1  2,2
		 *   3,0  3,1  3,2  3,3
		 * 4,0  4,1  4,2  4,3  4,4
		 * 
		 */	
		inicio = new Posicao(3,0);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,0), new Posicao(1,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,1), new Posicao(3,2)));	

		inicio = new Posicao(3,1);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,1), new Posicao(1,1)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,2), new Posicao(3,3)));

		inicio = new Posicao(3,2);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,1), new Posicao(1,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,1), new Posicao(3,0)));	
		
		inicio = new Posicao(3,3);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(2,2), new Posicao(1,1)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,2), new Posicao(3,1)));	
		/* 
		 *          0,0 
		 *       1,0  1,1
		 *     2,0  2,1  2,2
		 *   3,0  3,1  3,2  3,3
		 * 4,0  4,1  4,2  4,3  4,4
		 * 
		 */	
		inicio = new Posicao(4,0);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,0), new Posicao(2,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(4,1), new Posicao(4,2)));	

		inicio = new Posicao(4,1);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,1), new Posicao(2,1)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(4,2), new Posicao(4,3)));	
		
		inicio = new Posicao(4,2);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,1), new Posicao(2,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,2), new Posicao(2,2)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(4,1), new Posicao(4,0)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(4,3), new Posicao(4,4)));
		
		inicio = new Posicao(4,3);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,2), new Posicao(2,1)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(4,2), new Posicao(4,1)));

		inicio = new Posicao(4,4);
		MovimentosValidos.put(inicio, new ArrayList<Movimento>());	
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(3,3), new Posicao(2,2)));
		MovimentosValidos.get(inicio).add(new Movimento(inicio, new Posicao(4,3), new Posicao(4,2)));	
	}

	
	public static List<Movimento> getMovimentos(Posicao pos) {
		if (!MovimentosValidos.containsKey(pos))
			throw new RuntimeException("Posicao invalida: " + pos);
		
		return MovimentosValidos.get(pos);
	}

	
	public String toString() {
		return MovimentosValidos.toString();
	}
}
