package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static userinterface.SistecreditoPayPage.NAME_CONFIRMATION;

public class Answer implements Question<Boolean> {
    private String question = "Elige tu medio de pago";
    static boolean result;

    public static Question<Boolean> toThe() {
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String nameConfirmation = NAME_CONFIRMATION.resolveFor(actor).getText();
        if (question.equals(nameConfirmation)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
