package es.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainManejoConelecciones {

	public static void main(String[] args) {
		
		ArrayList<Integer> entero = new ArrayList<>();
		entero.add(1);
		entero.add(2);
		imprimir(entero);
		
		HashSet<Integer> hset = new HashSet<>();
		hset.add(1);
		hset.add(2);
		hset.add(4);
		hset.add(4);
		imprimir(hset);
		
		Map <Integer, String> hMap = new HashMap<>();
		hMap.put(1, "Hola");
		hMap.put(2, "Leo");
		hMap.put(3, "Leo");
		imprimir(hMap.keySet(),hMap.values());
	}

	private static void imprimir(HashSet<Integer> hset) {
		for (Integer integer : hset) {
			System.out.println(integer);
		}
		System.out.println("");
		
	}

	private static void imprimir(ArrayList<Integer> entero) {
		for (Object object : entero) {
			System.out.println(object);
		}
		System.out.println("");
		
	}

	private static void imprimir(Collection<Integer> collect, Collection <String> collection) {
		for (Object object : collection) {
			System.out.println(object);
		}
		System.out.println("");
		
	}
	

}
