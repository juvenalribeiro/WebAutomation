package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.Portal;
import support.BaseSteps;

public class portalSteps extends BaseSteps {
		
    private static Portal portal = new Portal(driver);
	
    @Dado("^acessar a pagina \"([^\"]*)\"$")
    public void acessar_a_pagina(String arg1) throws Throwable {
    	portal.abrirPortal(arg1);
    }
    @Quando("^clicar em canais de atendimento$")
    public void clicar_em_canais_de_atendimento() throws Throwable {
        portal.canaisAtendimento();
    }

    @Quando("^clicar em encontre um corretor$")
    public void clicar_em_encontre_um_corretor() throws Throwable {
    	portal.encontraCorretor();
    }
    
    @Quando("^pesquisar por estado \"([^\"]*)\" \"([^\"]*)\"$")
    public void pesquisar_por_estado(String arg1, String arg2) throws Throwable {
        portal.pesquisarUF(arg1, arg2);
    }

    @Quando("^pesquisar por cidade \"([^\"]*)\" \"([^\"]*)\"$")
    public void pesquisar_por_cidade(String arg1, String arg2) throws Throwable {
    	portal.pesquisarCidade(arg1, arg2);
    }

    @Quando("^pesquisar por bairro \"([^\"]*)\" \"([^\"]*)\"$")
    public void pesquisar_por_bairro(String arg1, String arg2) throws Throwable {
    	portal.pesquisarBairro(arg1, arg2);
    }
 
    @Entao("^validar que o corretor \"([^\"]*)\" é retornado na pesquisa$")
    public void validar_que_o_corretor_é_retornado_na_pesquisa(String arg1) throws Throwable {
    	portal.validaPesquisa(arg1);
    }

}
