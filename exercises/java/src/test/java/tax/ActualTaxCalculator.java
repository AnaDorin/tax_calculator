package tax;

public class ActualTaxCalculator extends TaxCalculator {
    boolean story4IsOn = true;
    boolean oldVehicle = true;

    public int calculateTax(Vehicle vehicle) {
        if (getYear() - vehicle.getDateOfFirstRegistration().getYear() == 0) {
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

            if (vehicle.getCo2Emissions() <= 0 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 0;
            }
            if (vehicle.getCo2Emissions() <= 50 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 0;
            }
            if (vehicle.getCo2Emissions() <= 75 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 15;
            }
            if (vehicle.getCo2Emissions() <= 90 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 95;
            }
            if (vehicle.getCo2Emissions() <= 100 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 115;
            }
            if (vehicle.getCo2Emissions() <= 110 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 135;
            }
            if (vehicle.getCo2Emissions() <= 130 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 155;
            }
            if (vehicle.getCo2Emissions() <= 150 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 195;
            }
            if (vehicle.getCo2Emissions() <= 170 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 505;
            }
            if (vehicle.getCo2Emissions() <= 190 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 820;
            }
            if (vehicle.getCo2Emissions() <= 225 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 1230;
            }
            if (vehicle.getCo2Emissions() <= 255 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 1750;
            }
            if (vehicle.getCo2Emissions() > 255 & vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return 2060;
            }

            if (vehicle.getFuelType().equals(FuelType.ELECTRIC)) {
                return 0;
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
        }
        if (story4IsOn && oldVehicle) {
            if (getYear() - vehicle.getDateOfFirstRegistration().getYear() >= 1 &
                    (vehicle.getFuelType().equals(FuelType.PETROL) | vehicle.getFuelType().equals(FuelType.DIESEL))
                    & vehicle.getListPrice() <= 40_000) {
                return 140;
            } else if (getYear() - vehicle.getDateOfFirstRegistration().getYear() >= 1 &
                    (vehicle.getFuelType().equals(FuelType.PETROL) | vehicle.getFuelType().equals(FuelType.DIESEL))
                    & !(vehicle.getListPrice() <= 40_000)) {
                return 450;
            } else if (getYear() - vehicle.getDateOfFirstRegistration().getYear() >= 1 &
                    vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)
                    & vehicle.getListPrice() <= 40_000) {
                return 130;
            } else if (getYear() - vehicle.getDateOfFirstRegistration().getYear() >= 1 &
                    vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)
                    & !(vehicle.getListPrice() <= 40_000)) {
                return 440;
            } else if (vehicle.getFuelType().equals(FuelType.ELECTRIC) & vehicle.getListPrice() <= 40_000) {
                return 0;
            } else if (vehicle.getFuelType().equals(FuelType.ELECTRIC) & !(vehicle.getListPrice() <= 40_000)) {
                return 310;
            }
        }
        return -1;
    }
}


