import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static <Mascotas> void main(String[] args) {
		
		ArrayList miListaDeSupuestosEnteros = new ArrayList();
		Set<Integer> setMascotas = new Set<Integer>();
		Map<Integer, Mascotas> mapaDeIdsDeMascotas = new HashMap<Integer, Mascotas>();
		
		miListaDeSupuestosEnteros.add(new Mascota());
		for (int i = 0; i < 10; i++) {
			miListaDeSupuestosEnteros.add(i);
		}
		
		miListaDeSupuestosEnteros.add(true);
		miListaDeSupuestosEnteros.add("Valor String");
		for(Object o : miListaDeSupuestosEnteros) {
			System.out.println(o);
		}
		int acumulador = 0;
		for (Object o : miListaDeSupuestosEnteros) {
			Integer i = (Integer) o;
			acumulador = acumulador + i;
		}
		System.out.println(acumulador);
	} 

}
