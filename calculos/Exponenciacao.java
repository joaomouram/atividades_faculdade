package pscDouglas.calculos;

class Exponenciacao extends Operacao{
	public Exponenciacao() {}
	
	@Override
	public double Calcular() {
		double resultado = Math.pow(valor1, valor2);
		return resultado;
	}
}
