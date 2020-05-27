package examen.ejercicio1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Ejercicio1 {

	static TreeSet<String> listaCompQuim = new TreeSet<String>();
	static TreeSet<String> listaElemQuim = new TreeSet<String>();
	static TreeSet<String> ListElementosQ = new TreeSet<String>();

	public static void main(String[] args) {
		String fichero = "res/ejercicio1.txt";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		leerFichero(fichero);
		System.out.println(listaCompQuim);
		System.out.println(listaElemQuim);
		elementosQuim(listaElemQuim);
		System.out.print(ListElementosQ + " ");
	}

	static void leerFichero(String fichero) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(fichero)));
			String linea;
			while ((linea = in.readLine()) != null) {
				listaCompQuim.add(linea);
			}
			listaElemQuim(listaCompQuim);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	static void listaElemQuim(TreeSet<String> elementosQ) {
		String elemQ;
		for (String elQ : elementosQ) {
			elemQ = elQ.trim().substring(elQ.indexOf(':') + 2);
			listaElemQuim.add(elemQ);
		}
		elementosQuim(listaElemQuim);
	}

	static void elementosQuim(TreeSet<String> elemQuim) {
		for (String eQ : elemQuim) {
			String elQ = "";
			elQ += eQ + " ";
			String elementoQ = "";
			int index = 0;
			// do {
			index = eQ.indexOf(elQ, index);
			for(Character c: elQ.toCharArray()) {
				if(!Character.isSpaceChar(c)){
				elementoQ+=c;
				}else {
					ListElementosQ.add(elementoQ);
					elementoQ="";
				}
			}
		}

	}

}