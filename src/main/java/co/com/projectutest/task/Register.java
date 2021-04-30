package co.com.projectutest.task;

import co.com.projectutest.userinterface.UtestRegisterPage;
import co.com.projectutest.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.*;

public class Register implements Task {
    private String strFirstName ;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strPassword;

    public Register(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strPassword = strPassword;

    }

    public static Register onThePage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword) {
        return Tasks.instrumented(Register.class, strFirstName, strLastName, strEmail, strMonth, strDay, strYear, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on( UtestRegisterPage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(UtestRegisterPage.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byValue(strMonth).from(UtestRegisterPage.SELECT_MONTH),
                SelectFromOptions.byValue(strDay).from(UtestRegisterPage.SELECT_DAY),
                SelectFromOptions.byValue(strYear).from(UtestRegisterPage.SELECT_YEAR),
                Enter.theValue(strPassword).into(UtestRegisterPage.INPUT_PASSWORD),
                Click.on(UtestRegisterPage.ENTER_BUTTON)
        );

    }
}