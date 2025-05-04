package pscDouglas.calculos;

class Subtracao extends Operacao{
	public Subtracao() {}
	
	@Override
	public double Calcular() {
		return valor1 - valor2;
	}
}
