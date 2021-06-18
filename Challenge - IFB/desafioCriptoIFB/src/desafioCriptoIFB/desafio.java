package desafioCriptoIFB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		String[] alfabeto = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
							"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
			
		List<String> alfabetoLista = new ArrayList<>(Arrays.asList(alfabeto));
		
		System.out.println("Digite alguma frase: ");
		String texto = input.nextLine();
		
		for (int i=0; i<texto.length(); i++) {
			String letra = Character.toString(texto.charAt(i));
			Integer novoNum = alfabetoLista.indexOf(letra)+2;
			System.out.print(alfabetoLista.get(novoNum));

		} 		
}}