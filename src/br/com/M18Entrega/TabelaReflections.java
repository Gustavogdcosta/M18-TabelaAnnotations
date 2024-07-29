package br.com.M18Entrega;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TabelaReflections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tabela tab = new Tabela();
		Class Clazz = tab.getClass();
		System.out.println(Clazz);
		
		try {
			Constructor cons = Clazz.getConstructor();
			Tabela tab1 = (Tabela) cons.newInstance();
			
			Field[] fields = tab1.getClass().getDeclaredFields();
			for (Field field: fields) {
				Class<?> type = field.getType();
				String nome = field.getName();
				System.out.println(type);
				System.out.println(nome);
			}
			
			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
