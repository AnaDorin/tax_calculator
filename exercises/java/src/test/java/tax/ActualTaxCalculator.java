package tax;

public class ActualTaxCalculator extends TaxCalculator {

    public int calculateTax(Vehicle vehicle) {

        //Petrol Fuel
        if (vehicle.getCo2Emissions() == 0 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 0;
        }
        if (vehicle.getCo2Emissions() <= 50 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 10;
        }
        if (vehicle.getCo2Emissions() <= 75 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 25;
        }
        if (vehicle.getCo2Emissions() <= 90 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 105;
        }
        if (vehicle.getCo2Emissions() <= 100 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 125;
        }
        if (vehicle.getCo2Emissions() <= 110 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 145;
        }
        if (vehicle.getCo2Emissions() <= 130 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 165;
        }
        if (vehicle.getCo2Emissions() <= 150 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 205;
        }
        if (vehicle.getCo2Emissions() <= 170 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 515;
        }
        if (vehicle.getCo2Emissions() <= 190 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 830;
        }
        if (vehicle.getCo2Emissions() <= 225 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 1240;
        }
        if (vehicle.getCo2Emissions() <= 255 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 1760;
        }
        if (vehicle.getCo2Emissions() > 255 & vehicle.getFuelType().equals(FuelType.PETROL)) {
            return 2070;
        }

        //Diesel Fuel
        if (vehicle.getCo2Emissions() == 0 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 0;
        }
        if (vehicle.getCo2Emissions() <= 50 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 25;
        }
        if (vehicle.getCo2Emissions() <= 75 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 105;
        }
        if (vehicle.getCo2Emissions() <= 90 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 125;
        }
        if (vehicle.getCo2Emissions() <= 100 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 145;
        }
        if (vehicle.getCo2Emissions() <= 110 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 165;
        }
        if (vehicle.getCo2Emissions() <= 130 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 205;
        }
        if (vehicle.getCo2Emissions() <= 150 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 515;
        }
        if (vehicle.getCo2Emissions() <= 170 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 830;
        }
        if (vehicle.getCo2Emissions() <= 190 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 1240;
        }
        if (vehicle.getCo2Emissions() <= 225 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 1760;
        }
        if (vehicle.getCo2Emissions() <= 255 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 2070;
        }
        if (vehicle.getCo2Emissions() > 255 & vehicle.getFuelType().equals(FuelType.DIESEL)) {
            return 2070;
        }

        return -1;
    }
}
