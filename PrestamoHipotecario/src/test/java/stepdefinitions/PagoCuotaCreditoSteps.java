package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;

public class PagoCuotaCreditoSteps {
    @Dado("un usuario se retrasa con el pago de la cuota")
    public void unUsuarioSeRetrasaConElPagoDeLaCuota() {
        System.out.println("Inicia prueba");
    }

    @Entonces("se presenta un incremento en el interes de mora")
    public void sePresentaUnIncrementoEnElInteresDeMora() {
        System.out.println("finaliza prueba");
    }

    @Dado("un usuario requiere pagar su cuota")
    public void unUsuarioRequierePagarSuCuota() {
        System.out.println("inicia prueba");
    }

    @Cuando("consignar la cuota de {int} en los siguientes {string}")
    public void consignarLaCuotaDeEnLosSiguientes(int cuota, String dia) {
        Assert.assertEquals(cuota>=800000,true);
        System.out.println("dia de pago"+ dia);
        System.out.println("Paso 1");
    }

    @Entonces("se presenta un descuento en la siguiente cuota")
    public void sePresentaUnDescuentoEnLaSiguienteCuota() {
        System.out.println("Finaliza prueba ");
    }

    @Cuando("se cumple el tiempo de pago  consignando {int} a la cuota de {int}")
    public void seCumpleElTiempoDePagoConsignandoALaCuotaDe(int pago, int cuota) {
        Assert.assertEquals(pago<cuota,true);
        System.out.println("Paso 1");
    }
}
