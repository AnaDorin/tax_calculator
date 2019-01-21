package tax;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static java.time.Month.APRIL;
import static tax.FuelType.*;

public class TaxCalculatorAfterFirstYearTest {

    private static final LocalDate FIRST_OF_APRIL_2017 = LocalDate.of(2017, APRIL, 1);
    private TaxCalculator taxCalculator;

    @Before
    public void setUp() {
        taxCalculator = new ActualTaxCalculator();
    }

    @Test
    public void subsequentYearsTaxForPetrol() {
        Vehicle vehicle = new Vehicle(206, PETROL, FIRST_OF_APRIL_2017, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(140);
    }

    @Test
    public void subsequentYearsTaxForElectric() {
        Vehicle vehicle = new Vehicle(206, ELECTRIC, FIRST_OF_APRIL_2017, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(0);
    }

    @Test
    public void subsequentYearsTaxForAlternativeFuel() {
        Vehicle vehicle = new Vehicle(206, ALTERNATIVE_FUEL, FIRST_OF_APRIL_2017, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(130);
    }
}
