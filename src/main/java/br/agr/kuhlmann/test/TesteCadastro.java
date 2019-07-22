package br.agr.kuhlmann.test;
import static br.agr.kuhlmann.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.agr.kuhlmann.core.BaseTest;
import br.agr.kuhlmann.page.ModeloPage;


public class TesteCadastro extends BaseTest {
	
	private ModeloPage page;
	
	@Before
	public void inicializa() {
		getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		page = new ModeloPage();

	}

	@Test
	public void deveCadastrar() {
		page.setNome("Edgar");
		page.setSobrenome("Gueno");
		page.setSexoMasculino();
		page.setComidaPizza();
		page.setEscolariedade("Mestrado");
		page.setEsporte("Natacao");
		page.cadastrar();
		
		Assert.assertTrue(page.obterResultadoCadastro().startsWith("Cadastrado!"));
		Assert.assertTrue(page.obterNomeCadastro().endsWith("Edgar"));
		Assert.assertEquals("Sobrenome: Gueno", page.obterSobrenomeCadastro());
		Assert.assertEquals("Sexo: Masculino", page.obterSexoCadastro());
		Assert.assertEquals("Comida: Pizza", page.obterComidaCadastro());
		Assert.assertEquals("Escolaridade: mestrado", page.obterEscolariedadeCadastro());
		Assert.assertEquals("Esportes: Natacao", page.obterEsporteCadastro());
		
	}
	
}
