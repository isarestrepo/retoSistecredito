package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SistecreditoPayPage extends PageObject {
    public static final Target SEARCH_PRODUCTS = Target.the("Escribir el producto")
            .located(By.id("testId-SearchBar-Input"));
    public static final Target SEARCH_PRODUCTS_OK = Target.the("Buscar las coincidencias del producto")
            .located(By.xpath("//*[@id='testId-search-wrapper']/div[3]/section[3]/ul/li[2]/a"));
    public static final Target SELECT_PRODUCT = Target.the("Seleccionar producto")
            .located(By.id("testId-Pod-action-prod12460027"));
    public static final Target VIEW_PRODUCT_POPUP = Target.the("Ver el producto seleccionado en popup")
            .located(By.id("linkButton"));
    public static final Target GO_SHOPPING = Target.the("Continuar con los datos")
            .located(By.xpath("//div[@class='fb-order-status__cta']"));
    public static final Target INPUT_EMAIL = Target.the("escribir el email")
            .located(By.id("emailAddress"));
    public static final Target EMAIL_CONTINUE = Target.the("Continuar datos dirección")
            .located(By.xpath("//div[@class='fbra_emailInputForm__submitButtonWrapper fbra_test_emailInputForm__submitButtonWrapper fbra_labelSpacing']"));
    public static final Target SELECT_DEPARTMENT = Target.the("seleccionar el departamento")
            .located(By.id("region"));
    public static final Target SELECT_CITY = Target.the("seleccionar la ciudad")
            .located(By.id("ciudad"));
    public static final Target SELECT_NEIGHBORHOOD = Target.the("seleccionar el barrio")
            .located(By.id("comuna"));
    public static final Target CONTINUE_PAY_BUTTON = Target.the("Continuar con el pago")
            .located(By.xpath("//*[@id='fbra_checkoutRegionAndComuna']/div/section/section/form/div/div[4]/div"));
     public static final Target INPUT_ADRESS = Target.the("Escribir la dirección")
            .located(By.id("address"));
    public static final Target INPUT_OFFICE = Target.the("Escribir la torre, oficina, casa...")
            .located(By.id("departmentNumber"));
    public static final Target ENTER_ADRESS = Target.the("Confirmar datos")
            .located(By.xpath("//*[@id='fbra_checkoutDeliverAndCollect']/div/div/div[1]/div/div[2]/div/div/form/section/div/div[4]"));
    public static final Target GO_PAY = Target.the("Ir al pago")
                .located(By.xpath("//*[@id='fbra_checkoutDeliveryActions']/div/div/span/div/div/div/div[2]/button"));
    public static final Target NAME_CONFIRMATION = Target.the("Nombre de confirmación")
            .located(By.xpath("//h2[contains(text(),'Elige tu medio de pago')]"));


}
