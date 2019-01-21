package tax;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;

import static java.time.Month.JANUARY;
import static org.assertj.core.api.Assertions.assertThat;
import static tax.FuelType.ALTERNATIVE_FUEL;
import static tax.FuelType.ELECTRIC;

public class TaxCalculatorAlternativeFuelTest {

    private static final LocalDate FIRST_OF_JAN_2019 = LocalDate.of(2019, JANUARY, 1);
    private TaxCalculator taxCalculator;

    @Before
    public void setUp () {
        taxCalculator = new ActualTaxCalculator();
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_0_grams_co2 () {
        Vehicle vehicle = new Vehicle(0, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(0);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_1_to_50_grams_co2 () {
        Vehicle vehicle = new Vehicle(50, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(0);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_51_to_75_grams_co2 () {
        Vehicle vehicle = new Vehicle(75, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(15);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_76_to_90_grams_co2 () {
        Vehicle vehicle = new Vehicle(90, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(95);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_91_to_100_grams_co2 () {
        Vehicle vehicle = new Vehicle(100, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(115);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_101_to_110_grams_co2 () {
        Vehicle vehicle = new Vehicle(110, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(135);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_111_to_130_grams_co2 () {
        Vehicle vehicle = new Vehicle(130, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(155);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_131_to_150_grams_co2 () {
        Vehicle vehicle = new Vehicle(150, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(195);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_151_to_170_grams_co2 () {
        Vehicle vehicle = new Vehicle(170, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(505);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_171_to_190_grams_co2 () {
        Vehicle vehicle = new Vehicle(190, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(820);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_191_to_225_grams_co2 () {
        Vehicle vehicle = new Vehicle(225, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(1230);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_226_to_255_grams_co2 () {
        Vehicle vehicle = new Vehicle(255, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(1750);
    }

    @Test
    public void firstYearsTaxForAlternativeFuel_over_255_grams_co2 () {
        Vehicle vehicle = new Vehicle(256, ALTERNATIVE_FUEL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(2060);
    }

    @Test
    public void firstYearsTaxForElectric () {
        Vehicle vehicle = new Vehicle(0, ELECTRIC, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(0);
    }
}
