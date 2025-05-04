package pscDouglas.calculos;

class Fatorial extends Operacao{
	public Fatorial() {}
	 
	@Override
	public double Calcular() {
		int resultado = 1;
		
		for (int i = 1; i <= valor1; i++) {
			resultado *= i;
		}
		
		return resultado;
	}
}


