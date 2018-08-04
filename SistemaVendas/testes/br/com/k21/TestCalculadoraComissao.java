package br.com.k21;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void test_venda_5000()
	{
		int  venda = 5000;
		int comissao = 250;
		
		int retorno = (int) CalculadoraComissao.calcular(venda);
		
		assertEquals(retorno, comissao);
	}
	

	@Test
	public void test_venda_20000()
	{
		int  venda = 20000;
		int comissao = 1200;
		
		int retorno = (int) CalculadoraComissao.calcular(venda);
		
		assertEquals(retorno, comissao);
	}
	
	@Test
	public void test_venda_igual_10000()
	{
		int  venda = 10000;
		int comissao = 500;
		
		double retorno = CalculadoraComissao.calcular(venda);
		
		assertEquals(retorno, comissao, 0);
	}
	
	@Test
	public void test_venda_igual_30000()
	{
		int  venda = 30000;
		int comissao = 1800;
		
		int retorno = (int) CalculadoraComissao.calcular(venda);
		
		assertEquals(retorno, comissao);
	}
	
	@Test
	public void teste_calculo_comissao_venda_30000_ponto_50_retorna_1800_ponto_03()
	{
		double venda = 30000.50;
		double comissao = 1800.03;
		
		double retorno = CalculadoraComissao.calcular(venda);
		
		assertEquals(comissao, retorno, 0);
	}
	
	@Test
	public void teste_venda_55_ponto_59_sem_prejuizo()
	{
		double venda = 55.59;
		double comissaoEsperada = 2.77;
		
		double comissaoCalculada = CalculadoraComissao.calcular(venda);
		
		assertEquals(comissaoEsperada, comissaoCalculada, 0);
	}
	
	@Test
	public void teste_venda_55555_ponto_59_sem_prejuizo()
	{
		double venda = 55555.59;
		double comissaoEsperada = 3333.33;
		
		double comissaoCalculada = CalculadoraComissao.calcular(venda);
		
		assertEquals(comissaoEsperada, comissaoCalculada, 0);
	}
	
}