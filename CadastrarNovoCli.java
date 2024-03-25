package automvdantas.datumrenner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastrarNovoCli {

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

		// Inserir campo E-mail (Sempre preencher com novos dados)

		driver.findElement(By.className("span8")).sendKeys("testeautodatum@gmail.com",  Keys.ENTER);

		// Inserir dados de segurança (Sempre preencher com novos dados)

		driver.findElement(By.id("id_confirmacao_email")).sendKeys("testeautodatum@gmail.com");
		driver.findElement(By.id("id_senha")).sendKeys("Teste@123");
		driver.findElement(By.id("id_confirmacao_senha")).sendKeys("Teste@123");

		// Inserir dados pessoais (Sempre preencher com novos dados)

		driver.findElement(By.id("id_nome")).sendKeys("Teste novo");
		driver.findElement(By.id("id_cpf")).sendKeys("664.175.270-42");
		driver.findElement(By.id("id_telefone_celular")).sendKeys("11935267362");
		driver.findElement(By.xpath("//*[@id=\"id_sexo\"]/option[2]")).click();
		driver.findElement(By.id("id_data_nascimento")).sendKeys("26/06/1997");
		Thread.sleep(1000);
		driver.findElement(By.id("id_cep")).sendKeys("04696-040");
		driver.findElement(By.id("id_numero")).sendKeys("123");

		// Confirmar cadastro
		driver.findElement(By.xpath("//*[@id=\"formCadastroCompleto\"]/form/div[4]/div/button")).click();

	}

}
