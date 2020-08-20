import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;

public class AppUtilidades
{
    public static void main(String args[]) throws java.io.IOException
    {
		BufferedReader br  = new BufferedReader(new FileReader("./datos/personas.csv"));
		String linea = null;
		List<String> lineas = new ArrayList<>();
		while((linea = br.readLine())!=null)
			lineas.add(br.readLine());
		br.close();

		List<String> lineas2 = Files.readAllLines(Path.of("./datos/personas.csv"));
		for(String s: lineas) {
			String[] campos = s.split(",");
		}

		Collections.sort(lineas2);

		List<Integer> enteros = Arrays.asList(1,2,3,5,6,7,7,8,8,96);

		AppUtilidades.m("Luis", "Ana");
		AppUtilidades.m("Luis", "Ana", "Manu", "Javi");
		AppUtilidades.m("Luis");

		List<Integer> numeros = Arrays.asList(1, 2, 4, 5);
		List<String> saludos = Arrays.asList("HOLA","QUE TAL");
		System.out.println(numeros);

    }

    private static void m(String... nombres)
    {
    	System.out.println(nombres);
    	for(String nombre: nombres)
    	    System.out.println(nombre);
    }

}