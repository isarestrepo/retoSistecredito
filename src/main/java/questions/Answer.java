package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static userinterface.SistecreditoPayPage.NAME_CONFIRMATION;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String nameConfirmation = NAME_CONFIRMATION.resolveFor(actor).getText();
        if (question.equals(nameConfirmation)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
