package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/PagoCuota.feature"
        , glue = {"stepdefinitions"}
        , plugin = {"pretty", "html:target/cucumber/ReporteCuotaCredito.html", "json:target/TransferenciasRunner.json"})

public class PagoCuotaRunner {
}
