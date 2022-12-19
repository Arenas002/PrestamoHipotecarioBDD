package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/SolicitudPrestamoExitoso.feature"
        , glue = {"stepdefinitions"}
        , plugin = {"pretty", "html:target/cucumber/reporteSolicitud.html", "json:target/SolicitudPrestamoExitoso.json"})

public class SolicitudCreditoHipotecaRunner {
}
