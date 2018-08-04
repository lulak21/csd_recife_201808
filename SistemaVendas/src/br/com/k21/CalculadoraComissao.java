package br.com.k21;

public class CalculadoraComissao {

	private static final int VALOR_LIMITE_SUPERIOR_FAIXA_1 = 10000;

	public static double calcular(double venda) {

		if (venda <= VALOR_LIMITE_SUPERIOR_FAIXA_1)
			return truncar(venda * 0.05);
		else
			return truncar(0.06 * venda);
	}

	private static double truncar(double valor) {
		return Math.floor((valor) * 100) / 100;
	}

}
