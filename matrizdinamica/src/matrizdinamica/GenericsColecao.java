package matrizdinamica;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericsColecao<T> {

	private T[] vetorDinamico;
	
	int posicao;
	
	@SuppressWarnings("unchecked")
	public GenericsColecao(Class<T> type, int tam){
		
		posicao = 0;
		this.vetorDinamico = (T[])Array.newInstance(type, tam);
	}
	
	public void add(T elemento){
		this.vetorDinamico[posicao] = elemento;
	}
	
	public T get(int index ){
		return this.vetorDinamico[index];
	}
}

