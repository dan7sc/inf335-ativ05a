package br.unicamp.ic.inf335.app.inf335_ativ04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {
	@Test
	void testeProdutoComMesmoValor() {
		ProdutoBean produto1 = new ProdutoBean("codigo1", "nome1", "descricao1", 10.0, "estado1");
		ProdutoBean produto2 = new ProdutoBean("codigo2", "nome2", "descricao2", 10.0, "estado2");
		
		assertEquals(produto1.compareTo(produto2), 0);
	}
	
	@Test
	void testeProdutoMaiorValor() {
		ProdutoBean produto1 = new ProdutoBean("codigo1", "nome1", "descricao1", 10.0, "estado1");
		ProdutoBean produto2 = new ProdutoBean("codigo2", "nome2", "descricao2", 2.0, "estado2");
		
		assertEquals(produto1.compareTo(produto2), 1);
	}
	
	@Test
	void testeProdutoMenorValor() {
		ProdutoBean produto1 = new ProdutoBean("codigo1", "nome1", "descricao1", 1.0, "estado1");
		ProdutoBean produto2 = new ProdutoBean("codigo2", "nome2", "descricao2", 20.0, "estado2");
		
		assertEquals(produto1.compareTo(produto2), -1);
	}
}
