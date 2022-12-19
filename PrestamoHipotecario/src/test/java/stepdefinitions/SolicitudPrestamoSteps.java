package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

public class SolicitudPrestamoSteps {
    @Dado("un usuario requiere un prestamo hipotecario")
    public void unUsuarioRequiereUnPrestamoHipotecario() {
        System.out.println("Inicia prueba");
    }

    @Cuando("cumple con todos los requisitos del formulario del credito hipotecario")
    public void cumpleConTodosLosRequisitosDelFormularioDelCreditoHipotecario() {
        System.out.println("Paso 1");
    }

    @Y("sus ingresos son  mayores de {int} SMMLV")
    public void susIngresosSonMayoresDeSMMLV(int salario) {
        Assert.assertEquals(salario,1);
    }

    @Entonces("el prestamo hipotecario es exitoso")
    public void elPrestamoHipotecarioEsExitoso() {
        System.out.println("Finaliza prueba");
    }

    @Cuando("no cumple con los requisitos del formulario del credito hipotecario")
    public void noCumpleConLosRequisitosDelFormularioDelCreditoHipotecario() {
        System.out.println("Paso 1");
    }

    @Y("sus ingresos son menores de {int} SMMLV")
    public void susIngresosSonMenoresDeSMMLV(int salario) {
        Assert.assertEquals(salario,2);
    }

    @Entonces("el prestamo hipotecario es rechazado")
    public void elPrestamoHipotecarioEsRechazado() {
        System.out.println("finaliza prueba");
    }
}
