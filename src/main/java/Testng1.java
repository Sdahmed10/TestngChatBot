import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testng1 {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.get("https://postebubble.messaggera.com/");
    }

    @Test
    public void AlimenterEdinar() throws InterruptedException {
        // Locate and click on the chat icon
        WebElement messagera = driver.findElement(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img"));
        messagera.click();
        // Locate and click on the 'Utilisation D17' option
        WebElement utilisation = driver.findElement(By.xpath("//p[normalize-space()='Utilisation D17']"));
        utilisation.click();
        Thread.sleep(3000);

        // List of questions to ask
        String[] questions = {
                "Comment alimenter la carte e-dinar ?",
//                "Pourriez-vous m'expliquer la procédure pour alimenter une carte e-dinar ?",
//                "Comment je fais pour recharger ma carte e-dinar ?",
//                "Pouvez-vous me dire comment procéder pour alimenter ma carte e-dinar ?",
//                "Quelle est la démarche pour alimenter une carte e-dinar et quels sont les moyens disponibles pour effectuer cette opération ?",
        };

        for (int i = 0; i < questions.length; i++) {
            WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='textarea-chatbox-footer']")));
            // Debugging information
            System.out.println("Message box is displayed: " + message.isDisplayed());
            System.out.println("Message box is enabled: " + message.isEnabled());

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", message);
            message.sendKeys(questions[i]);
            message.sendKeys(Keys.ENTER);

            String responseXPath = "(//div[contains(@class,'message-operator ai-message')])[" + (i + 1) + "]";
            WebElement responseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(responseXPath)));
            String responseText = responseElement.getText();
            System.out.println("Response to \"" + questions[i] + "\": " + responseText);

            Thread.sleep(5000);
        }
    }

    @Test
    public void BloquageD17() throws InterruptedException {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img")));
        // Locate and click on the chat icon
        WebElement messagera = driver.findElement(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img"));
        messagera.click();
        Thread.sleep(3000);

        // List of questions to ask
        String[] questions = {
                "Peut-on bloquer la carte via D17 ?",
//                "Est-il possible de bloquer la carte en utilisant D17 ?",
//                "On peut bloquer la carte avec D17, non ?",
//                "Pourriez-vous me confirmer si D17 permet de bloquer la carte ?",
//                "D17 offre-t-il la possibilité de bloquer la carte, et si oui, comment cela fonctionne-t-il ?",
        };

        for (int i = 0; i < questions.length; i++) {
            WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='textarea-chatbox-footer']")));
            // Debugging information
            System.out.println("Message box is displayed: " + message.isDisplayed());
            System.out.println("Message box is enabled: " + message.isEnabled());

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", message);
            message.sendKeys(questions[i]);
            message.sendKeys(Keys.ENTER);

            String responseXPath = "(//div[contains(@class,'message-operator ai-message')])[" + (i + 1) + "]";
            WebElement responseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(responseXPath)));
            String responseText = responseElement.getText();
            System.out.println("Response to \"" + questions[i] + "\": " + responseText);

            Thread.sleep(5000);
        }
    }

    @Test
    public void CNAMCNSS() throws InterruptedException {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img")));
        // Locate and click on the chat icon
        WebElement messagera = driver.findElement(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img"));
        messagera.click();
        Thread.sleep(3000);

        // List of questions to ask
        String[] questions = {
                "Je n’arrive pas à encaisser les mandats CNAM, CNSS, CNRPS par D17. Que dois-je faire ?",
//                "Pourriez-vous m’assister ? Je rencontre des difficultés pour encaisser les mandats CNAM, CNSS, CNRPS via D17.",
//                "Je n’arrive pas à encaisser les mandats CNAM, CNSS, CNRPS avec D17, comment je fais ?|",
//                "Pouvez-vous me dire comment résoudre le problème d’encaissement des mandats CNAM, CNSS, CNRPS par D17 ?",
//                "Quel est le processus pour encaisser les mandats CNAM, CNSS, CNRPS avec D17, et que faire si cela ne fonctionne pas comme prévu ?",
        };

        for (int i = 0; i < questions.length; i++) {
            WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='textarea-chatbox-footer']")));
            // Debugging information
            System.out.println("Message box is displayed: " + message.isDisplayed());
            System.out.println("Message box is enabled: " + message.isEnabled());

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", message);
            message.sendKeys(questions[i]);
            message.sendKeys(Keys.ENTER);

            String responseXPath = "(//div[contains(@class,'message-operator ai-message')])[" + (i + 1) + "]";
            WebElement responseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(responseXPath)));
            String responseText = responseElement.getText();
            System.out.println("Response to \"" + questions[i] + "\": " + responseText);

            Thread.sleep(5000);
        }
    }


    @Test
    public void CartePerdu() throws InterruptedException {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img")));
        // Locate and click on the chat icon
        WebElement messagera = driver.findElement(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img"));
        messagera.click();
        Thread.sleep(3000);

        // List of questions to ask
        String[] questions = {
                "J'ai perdu ma carte. Comment puis-je la bloquer ?",
//                "Pourriez-vous m'aider ? J'ai perdu ma carte et je souhaite la bloquer.",
//                "J'ai perdu ma carte, comment je fais pour la bloquer ?",
//                "Pouvez-vous me dire comment bloquer ma carte que j'ai perdue ?",
//                "Que dois-je faire pour bloquer ma carte si je l'ai perdue ? Y a-t-il une procédure spécifique ?",
        };

        for (int i = 0; i < questions.length; i++) {
            WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='textarea-chatbox-footer']")));
            // Debugging information
            System.out.println("Message box is displayed: " + message.isDisplayed());
            System.out.println("Message box is enabled: " + message.isEnabled());

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", message);
            message.sendKeys(questions[i]);
            message.sendKeys(Keys.ENTER);

            String responseXPath = "(//div[contains(@class,'message-operator ai-message')])[" + (i + 1) + "]";
            WebElement responseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(responseXPath)));
            String responseText = responseElement.getText();
            System.out.println("Response to \"" + questions[i] + "\": " + responseText);

            Thread.sleep(5000);
        }
    }

    @Test
    public void Chagementtelephone() throws InterruptedException {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img")));
        // Locate and click on the chat icon
        WebElement messagera = driver.findElement(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img"));
        messagera.click();
        Thread.sleep(3000);

        // List of questions to ask
        String[] questions = {
                "Qu'arrive-t-il si je transfère mes données vers un nouveau téléphone ?",
//                "Que se passe-t-il avec mes applications si je change d'appareil ?",
//                "Comment mes contacts sont-ils affectés si je change de téléphone ?",
//                "Quelles sont les étapes à suivre si je veux passer à un autre téléphone ?",
//                "Que devient ma configuration initiale si je passe à un nouveau smartphone ?",
        };

        for (int i = 0; i < questions.length; i++) {
            WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='textarea-chatbox-footer']")));
            // Debugging information
            System.out.println("Message box is displayed: " + message.isDisplayed());
            System.out.println("Message box is enabled: " + message.isEnabled());

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", message);
            message.sendKeys(questions[i]);
            message.sendKeys(Keys.ENTER);

            String responseXPath = "(//div[contains(@class,'message-operator ai-message')])[" + (i + 1) + "]";
            WebElement responseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(responseXPath)));
            String responseText = responseElement.getText();
            System.out.println("Response to \"" + questions[i] + "\": " + responseText);

            Thread.sleep(5000);
        }
    }

    @Test
    public void CodePIN() throws InterruptedException {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img")));
        // Locate and click on the chat icon
        WebElement messagera = driver.findElement(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img"));
        messagera.click();
        Thread.sleep(3000);

        // List of questions to ask
        String[] questions = {
                "Qu'est-ce que le code PIN ?",
//                "Pouvez-vous m'expliquer ce qu'est un code PIN ?",
//                "C’est quoi exactement un code PIN ?",
//                "Pourriez-vous me dire ce qu'est un code PIN et à quoi il sert ?",
//                "Quel est le rôle d'un code PIN et comment est-il utilisé dans les transactions ou les systèmes de sécurité ?",

        };

        for (int i = 0; i < questions.length; i++) {
            WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='textarea-chatbox-footer']")));
            // Debugging information
            System.out.println("Message box is displayed: " + message.isDisplayed());
            System.out.println("Message box is enabled: " + message.isEnabled());

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", message);
            message.sendKeys(questions[i]);
            message.sendKeys(Keys.ENTER);

            String responseXPath = "(//div[contains(@class,'message-operator ai-message')])[" + (i + 1) + "]";
            WebElement responseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(responseXPath)));
            String responseText = responseElement.getText();
            System.out.println("Response to \"" + questions[i] + "\": " + responseText);

            Thread.sleep(5000);
        }
    }

    @Test
    public void CombiencaCoute() throws InterruptedException {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img")));
        // Locate and click on the chat icon
        WebElement messagera = driver.findElement(By.xpath("//*[@id=\"taki-chat-XM-47\"]/div/div[3]/div/img"));
        messagera.click();
        Thread.sleep(3000);

        // List of questions to ask
        String[] questions = {
                "Combien coûte l'envoi d'un mandat ?",
//                "Pourriez-vous me renseigner sur le coût associé à l'envoi d'un mandat ?",
//                "C’est combien pour envoyer un mandat ?",
//                "Pouvez-vous me dire combien il en coûte pour envoyer un mandat ?",
//                "Quel est le tarif pour l’envoi d’un mandat et est-ce que le coût varie en fonction du montant ou du type de mandat ?",

        };

        for (int i = 0; i < questions.length; i++) {
            WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='textarea-chatbox-footer']")));
            // Debugging information
            System.out.println("Message box is displayed: " + message.isDisplayed());
            System.out.println("Message box is enabled: " + message.isEnabled());

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", message);
            message.sendKeys(questions[i]);
            message.sendKeys(Keys.ENTER);

            String responseXPath = "(//div[contains(@class,'message-operator ai-message')])[" + (i + 1) + "]";
            WebElement responseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(responseXPath)));
            String responseText = responseElement.getText();
            System.out.println("Response to \"" + questions[i] + "\": " + responseText);

            Thread.sleep(5000);
        }
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

