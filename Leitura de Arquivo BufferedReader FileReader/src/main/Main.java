package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		/* Código em Java para leitura de arquivos com BufferedReader, FileReader usando Try-with-resources */
		
		String path = "D:\\TEMP\\leitura.txt";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			String linha = bf.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = bf.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
