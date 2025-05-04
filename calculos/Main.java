package pscDouglas.calculos;

public class Main {
	public static void main(String[] args) {
		try {
			Operacao operacao;
			// Escolha da operação: '+' para adição, '/' para divisão, '*' para multiplicação, '-' para subtração, '!' para fatorial, '^' para exponenciação
			char operador = '!';
			// Instancia a operação correta conforme o operador
			switch (operador) {
			case '+':
				operacao = new Adicao();
				break;
			case '/':
				operacao = new Divisao();
				break;
			case '*':
				operacao = new Multiplicacao();
				break;
			case '-':
				operacao = new Subtracao();
				break;
			case '!':
				operacao = new Fatorial();
				break;
			case '^':
				operacao = new Exponenciacao();	
				break;
			default:
				throw new IllegalArgumentException("Erro: operador inválido.");
			}
			// Definição dos valores usando os métodos set
			operacao.setValor1(4);
			operacao.setValor2(0); // Testando divisão por zero
			// Executa o cálculo e exibe o resultado
			double resultado = operacao.Calcular();
			System.out.println("Resultado da operação: " + resultado);
		} catch (IllegalArgumentException | ArithmeticException e) {
			// Captura exceções tanto de operador inválido quanto de divisão por zero
			System.out.println("Erro ao calcular a operação: " + e.getMessage());
		}
	}
}


