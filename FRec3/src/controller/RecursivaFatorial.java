package controller;

import javax.swing.JOptionPane;

public class RecursivaFatorial {

	public int Fatorial(int num) {

		// Aqui a condição de parada foi definida para quando o "Num" atingir 1, pois
		// fatoriais só lidam com números naturais até 1.

		if (num == 1) {

			return num;

			// Uma segunda condição de parada, pois caso o valor inserido para a
			// recursividade ultrapasse de 12, irá estourar o limite
			// da variável

		} else if (num > 12) {

			JOptionPane.showMessageDialog(null, "O valor máximo permitido é 12", null, num);

		}

		// O fatorial é basicamente a multiplicação de um número por todos os seus
		// antecessores, logo, toda a vez que a função recursiva
		// for chamada, ela irá multiplicar o número "num" pelo seu antecessor,
		// empilhando os resultados e os retornando no resultado final.

		return num * Fatorial(num - 1);

	}

}
