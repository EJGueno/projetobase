package br.agr.kuhlmann.page;


import br.agr.kuhlmann.core.BasePage;

public class ModeloPage  extends BasePage{
	
	
	public void setNome(String nome) {
		dsl.escrever("elementosForm:nome", nome);
		
	}
	
	public void setSobrenome(String sobrenome) {
		dsl.escrever("elementosForm:sobrenome", sobrenome);
		
	}
	
	public void setSexoMasculino() {
		dsl.clicarRadio("elementosForm:sexo:0");
		
	}
	
	public void setSexoFeminino() {
		dsl.clicarRadio("elementosForm:sexo:1");
		
	}
	
	public void setComidaCarne() {
		dsl.clicarRadio("elementosForm:comidaFavorita:0");
		
	}
	
	public void setComidaFrango() {
		dsl.clicarRadio("elementosForm:comidaFavorita:1");
		
	}

	public void setComidaPizza() {
		dsl.clicarRadio("elementosForm:comidaFavorita:2");
		
	}
	
	public void setComidaVegetariano() {
		dsl.clicarRadio("elementosForm:comidaFavorita:3");
		
	}
	
	public void setEscolariedade(String valor) {
		dsl.selecionarCombo("elementosForm:escolaridade", valor);
	}

	public void setEsporte(String... valores) {
		for(String valor: valores)
			dsl.selecionarCombo("elementosForm:esportes", valor);
		
	}

	public void cadastrar() {
		dsl.clicarBotao("elementosForm:cadastrar");
		
	}
	
	public String obterResultadoCadastro() {
		return dsl.obterTexto("resultado");
		
	}
	
	public String obterNomeCadastro() {
		return dsl.obterTexto("descNome");
		
	}
	public String obterSobrenomeCadastro() {
		return dsl.obterTexto("descsobrenome");
		
	}
	public String obterSexoCadastro() {
		return dsl.obterTexto("descSexo");
		
	}

	public String obterComidaCadastro() {
		return dsl.obterTexto("descComida");
		
	}
	
	public String obterEscolariedadeCadastro() {
		 return  dsl.obterTexto("descEscolaridade");
	}
	
	public String obterEsporteCadastro() {
		 return dsl.obterTexto("descEsportes");
		 
	}
	
}
 	