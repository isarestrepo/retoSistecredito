package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.SistecreditoPayPage;

public class Pay implements Task {
    public static Pay onThePage(){
        return Tasks.instrumented(Pay.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(SistecreditoPayPage.CLOSE_BUTTON)
                Enter.theValue("celular redmi note").into(SistecreditoPayPage.SEARCH_PRODUCTS),
                Click.on(SistecreditoPayPage.SEARCH_PRODUCTS_OK),
                Click.on(SistecreditoPayPage.SELECT_PRODUCT),
                Click.on(SistecreditoPayPage.VIEW_PRODUCT_POPUP),
                Click.on(SistecreditoPayPage.GO_SHOPPING),
                Enter.theValue("mrestrepor@choucairtesting.com").into(SistecreditoPayPage.INPUT_EMAIL),
                Click.on(SistecreditoPayPage.EMAIL_CONTINUE),
                SelectFromOptions.byVisibleText("ANTIOQUIA").from(SistecreditoPayPage.SELECT_DEPARTMENT),
                SelectFromOptions.byVisibleText("MEDELLIN").from(SistecreditoPayPage.SELECT_CITY),
                SelectFromOptions.byVisibleText("MEDELLIN").from(SistecreditoPayPage.SELECT_NEIGHBORHOOD),
                Click.on(SistecreditoPayPage.CONTINUE_PAY_BUTTON),
                Enter.theValue("CL 100B SUR - 42-123").into(SistecreditoPayPage.INPUT_ADRESS),
                Enter.theValue("Oficina 123").into(SistecreditoPayPage.INPUT_OFFICE),
                Click.on(SistecreditoPayPage.ENTER_ADRESS),
                Click.on(SistecreditoPayPage.GO_PAY)
        );
    }
}
