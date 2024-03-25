package automvdantas.datumrenner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimparCarrinho {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Start driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\55119\\Desktop\\chromedriver.exe");

		// Definindo driver
		WebDriver driver = new ChromeDriver();
		long time = 3500;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

		// Acessar URL sistema
		driver.get("https://www.limedrop.com.br/");
		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id=\"google-fashion\"]/body/div[14]/div/div/a")).click();

		// Acessar tela de login

		driver.findElement(By.id("Caminho_98")).click();

		// Inserir campo E-mail

		driver.findElement(By.id("id_email")).sendKeys("automacaovdantas@gmail.com");

		// Inserir campo Senha

		driver.findElement(By.id("id_senha")).sendKeys("Teste123", Keys.ENTER);

		// Acessar carrinho

		driver.findElement(By.xpath("//*[@id=\"Componente_22_3\"]")).click();

		// Excluir carrinho

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[6]/div/a]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[2]/div/div[2]/table/tbody/tr[1]/td[6]/div")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"corpo\"]/div/div[2]/div/div[2]/table/tbody/tr[1]/td[6]/div")).click();

	}

}
