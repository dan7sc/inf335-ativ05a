package br.unicamp.ic.inf335.app.inf335_ativ04;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnuncioBeanTest {

	@Test
	void testeDescontoPositivoEMenorQue100() {
		ProdutoBean produto = new ProdutoBean("codigo1", "nome1", "descricao1", 29.90, "estado1");
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		double desconto = 10.0;
		double valorEsperado = 29.90 -(29.90 / 10.0);
		
		AnuncioBean anuncio = new AnuncioBean(produto, fotosUrl, desconto);
		
		assertEquals(anuncio.getValor(), valorEsperado);
	}
	
	@Test
	void testeDescontoIgualAZero() {
		ProdutoBean produto = new ProdutoBean("codigo1", "nome1", "descricao1", 29.90, "estado1");
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		double desconto = 0.0;
		double valorEsperado = 29.90;
		
		AnuncioBean anuncio = new AnuncioBean(produto, fotosUrl, desconto);
		
		assertEquals(anuncio.getValor(), valorEsperado);
	}
}
