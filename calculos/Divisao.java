package pscDouglas.calculos;

class Divisao extends Operacao{
	public Divisao() {}
	
	@Override
	public double Calcular() {
		if (valor2 == 0) {
			throw new ArithmeticException("Erro: divisão por zero não é permitida.");
		}
		return valor1 / valor2;
	}
}
