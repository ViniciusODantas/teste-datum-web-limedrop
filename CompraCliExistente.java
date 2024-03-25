package automvdantas.datumrenner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompraCliExistente {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Executar a automação "LimparCarrinho.java" antes de executar

		// Start driver

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\55119\\Desktop\\chromedriver.exe");

		// Definindo driver

		WebDriver driver = new ChromeDriver();

		// Definindo timeout

		long time = 3500;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

		// Acessar URL sistema

		driver.get("https://www.limedrop.com.br/");
		Thread.sleep(6000); // Timeout necessário para iniciar o sistema

		// Aguardar pesquisa

		driver.findElement(By.xpath("//*[@id=\"google-fashion\"]/body/div[14]/div/div/a")).click();

		// Acessar tela de login

		driver.findElement(By.id("Caminho_98")).click();

		// Inserir campo E-mail

		driver.findElement(By.id("id_email")).sendKeys("automacaovdantas@gmail.com");

		// Inserir campo Senha

		driver.findElement(By.id("id_senha")).sendKeys("Teste123", Keys.ENTER);

		// Acessar tela Sneakers

		driver.findElement(
				By.xpath("//*[@id=\"google-fashion\"]/body/div[2]/header/div/div/div[2]/div/ul/li[1]/a/strong"))
				.click();

		// Selecionar tenis Air Jordan 4 Retro Bred Reimagined

		driver.findElement(By.xpath("//*[@id=\"listagemProdutos\"]/ul/li/ul/li[5]/div/a")).click();

		// Selecionar tamanho

		driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[2]/div/div[1]/div[2]/div/div[2]/div/ul/li[1]/a/span"))
				.click();

		// Clicar em comprar

		driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[2]/div/div[1]/div[2]/div/div[4]/div[3]/a")).click();

		// Clicar em continuar comprando
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"comprar-ajax-status\"]/div[1]/div[3]/a[1]")).click();

		// Acessar tela de roupas

		driver.findElement(
				By.xpath("//*[@id=\"google-fashion\"]/body/div[2]/header/div/div/div[2]/div/ul/li[2]/a/strong"))
				.click();

		// Selecionar Blusa de Moletom Fechada HUGO Bordada Cinza

		driver.findElement(By.xpath("//*[@id=\"listagemProdutos\"]/ul/li/ul/li[2]/div/a")).click();

		// Selecionar tamanho

		driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[2]/div/div[1]/div[2]/div/div[2]/div/ul/li/a")).click();

		// Clicar em comprar

		driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[2]/div/div[1]/div[2]/div/div[3]/div[3]/a")).click();

		// Clicar em continuar comprando
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"comprar-ajax-status\"]/div[1]/div[3]/a[1]")).click();

		// Acessar tela de acessórios

		driver.findElement(By.xpath("//*[@id=\"google-fashion\"]/body/div[2]/header/div/div/div[2]/div/ul/li[3]/a"))
				.click();

		// Selecionar Nike x NOCTA Cap - White

		driver.findElement(By.xpath("//*[@id=\"listagemProdutos\"]/ul/li/ul/li[2]/div/a")).click();

		// Selecionar tamanho

		driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[2]/div/div[1]/div[2]/div/div[2]/div/ul/li/a")).click();

		// Clicar em comprar

		driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[2]/div/div[1]/div[2]/div/div[3]/div[3]/a")).click();

		// Clicar em Finalizar compra

		driver.findElement(By.xpath("//*[@id=\"comprar-ajax-status\"]/div[1]/div[3]/a[2]")).click();

		// Preencher dados do cartão

		driver.findElement(By.id("cartao_cartao_numero")).sendKeys("5522480278325198");
		Thread.sleep(500);
		driver.findElement(By.id("cartao_cartao_data_expiracao")).sendKeys("1125");
		Thread.sleep(500);
		driver.findElement(By.id("cartao_cartao_nome")).sendKeys("Auto Vdan");
		Thread.sleep(500);
		driver.findElement(By.id("cartao_cartao_cvv")).sendKeys("953");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"cartao_cartao_parcelas\"]/option[2]")).click();

		// Clicar em Finalizar compra

		driver.findElement(By.id("finalizarCompra")).click();

		// Validação se encerra com o retorno de critica, pois por se tratar de ambiente
		// produtivo, não iremos completar a compra.

	}

}
