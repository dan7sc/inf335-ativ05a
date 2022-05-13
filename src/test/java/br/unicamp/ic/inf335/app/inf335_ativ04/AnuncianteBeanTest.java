package br.unicamp.ic.inf335.app.inf335_ativ04;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnuncianteBeanTest {

	@Test
	void testeAdicionaAnuncio() {
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		ProdutoBean produto1 = new ProdutoBean("codigo1", "nome1", "descricao1", 29.90, "estado1");
		AnuncioBean anuncio1 = new AnuncioBean(produto1, fotosUrl, 10.0);
		ArrayList<AnuncioBean> listaDeAnuncios = new ArrayList<AnuncioBean>();
		
		AnuncianteBean anunciante = new AnuncianteBean("nome", "cpf", listaDeAnuncios);
		anunciante.addAnuncio(anuncio1);
		
		assertEquals(anunciante.getAnuncios().size(), 1);
	}
	
	@Test
	void testeRemoveAnuncio() {
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		ProdutoBean produto1 = new ProdutoBean("codigo1", "nome1", "descricao1", 29.90, "estado1");
		AnuncioBean anuncio1 = new AnuncioBean(produto1, fotosUrl, 10.0);
		ArrayList<AnuncioBean> listaDeAnuncios = new ArrayList<AnuncioBean>();
		
		AnuncianteBean anunciante = new AnuncianteBean("nome", "cpf", listaDeAnuncios);
		anunciante.addAnuncio(anuncio1);
		anunciante.removeAnuncio(0);
		
		assertEquals(anunciante.getAnuncios().size(), 0);
	}
	
	@Test
	void testeValorMedioAnuncios() {
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		ProdutoBean produto1 = new ProdutoBean("codigo1", "nome1", "descricao1", 29.90, "estado1");
		ProdutoBean produto2 = new ProdutoBean("codigo2", "nome2", "descricao2", 14.80, "estado2");
		AnuncioBean anuncio1 = new AnuncioBean(produto1, fotosUrl, 10.0);
		AnuncioBean anuncio2 = new AnuncioBean(produto2, fotosUrl, 5.0);
		ArrayList<AnuncioBean> listaDeAnuncios = new ArrayList<AnuncioBean>();
		double valorMedioEsperado = ((29.90 - (29.90/10.0)) + (14.80 - (14.80/5.0))) / 2;
		
		AnuncianteBean anunciante = new AnuncianteBean("nome", "cpf", listaDeAnuncios);
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
				
		assertEquals(anunciante.valorMedioAnuncios(), valorMedioEsperado);
	}
}
