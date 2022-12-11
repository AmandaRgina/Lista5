package valorPagamento;

public class ValorPagamento {

	public static void main(String[] args) {
		
		
		
		
		
	}
	
	
	public static void valorPagamento (double valorPrestacao, int diasAtraso) {
		
		double valorTotal = 0;
		double j = 0;
		int numeroPrestacoes = 0;
		
		
		
		for (int i=0; valorPrestacao > 0; i++) {
		
			
			
		if (diasAtraso > 0) {
			
			double multa = diasAtraso * valorPrestacao*0.3;
			
			double juros = diasAtraso * valorPrestacao * 0.1;
			
			valorTotal = valorPrestacao + multa + juros;
			
			System.out.println("Valor total a ser pago: " + valorTotal);
		}
		
		else if (diasAtraso == 0) {
			
			valorTotal = valorPrestacao;
			
			System.out.println("Valor total a ser pago: " + valorTotal);
		}
		
			j = valorTotal + j;
		
			numeroPrestacoes = i;
		}
		
	
		System.out.println("Quantidade de prestações pagas hoje: " + numeroPrestacoes);
		System.out.println("Valor total das prestações pagas hoje: " + j);
		
		
		
	}

}
