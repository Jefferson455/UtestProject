package co.com.projectutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage {
    public static final Target REGISTER_BUTTON = Target.the( "the button that show us the form to login" )
            .located( By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']//strong[contains(text(),'Join Today')]") );
    public static  final Target INPUT_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static  final Target INPUT_LASTNAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static  final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static  final Target SELECT_MONTH = Target.the("Where do we select month")
            .located(By.xpath("//select[contains(@id, 'birthMonth')]"));
    public static  final Target SELECT_DAY = Target.the("Where do we select the day")
            .located(By.xpath("//select[contains(@id, 'birthDay')]"));
    public static  final Target SELECT_YEAR = Target.the("Where do we select the year")
            .located(By.xpath("//select[contains(@id, 'birthYear')]"));
    public static  final Target INPUT_PASSWORD = Target.the("where do write the password")
            .located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
    public static  final Target ENTER_BUTTON = Target.the("button to comfirm REGISTER")
            .located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}
