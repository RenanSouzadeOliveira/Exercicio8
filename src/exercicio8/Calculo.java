package exercicio8;

public class Calculo {
		public double juros(double valor, double juros, double parcela){
			double total = 0;
			total = (valor * juros /100) * parcela;
			return total;
		}
}
