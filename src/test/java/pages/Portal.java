package pages;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import support.CoreQA;

public class Portal {
	private CoreQA driver;

	public Portal(CoreQA stepDriver){
		driver = stepDriver;
	}
	public void abrirPortal(String link) {
		driver.openURL(link);
	}
	public void pesquisarUF (String idCampo, String conteudo) {
		driver.click(idCampo, "name");
		driver.selectByText(conteudo, idCampo, "name");
		
	}
	public void pesquisarCidade (String idCampo, String conteudo) {
		driver.click(idCampo, "name");
		driver.selectByText(conteudo, idCampo, "name");
		
	}
	public void pesquisarBairro (String idCampo, String conteudo) {
		driver.click(idCampo, "name");
		driver.selectByText(conteudo, idCampo, "name");
	}
	public void validaPesquisa(String itemAlvo) {
		driver.click("Button", "name");
		List<WebElement> list = driver.findElemsAll("//*[contains(text(), '" + itemAlvo + "')]", "xpath");
		
		for (int i=0;i<list.size();i++ ) {
			Assert.assertEquals(itemAlvo,list.get(i));
		}
	}
	public void canaisAtendimento() {
		driver.click("/html/body/header/div[1]/nav/ul[1]/li[3]/a", "xpath");
	}
	public void encontraCorretor() {
		driver.click("//*[@id=\"block-system-main\"]/div[3]/ul/li[3]/div[2]/a", "xpath");
	}
}



