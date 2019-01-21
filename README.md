# Code for exercises on continuous integration for use in bootcamps

This code is a simplified implementation of the rules for UK vehicle tax as of 2017 (the full rules can be found here https://www.gov.uk/vehicle-tax-rate-tables)

## The rules for use in the exercises are summarized below:

### Story 1

##### First tax payment when you register the vehicle


|C02 g/km  |Petrol |
|-----------|-------|
|0	        |£0	    |
|1 - 50	    |£10	|
|51 - 75	|£25	|
|76 - 90	|£105	|
|91 - 100	|£125	|
|101 - 110	|£145	|
|111 - 130	|£165	|
|131 - 150	|£205	|
|151 - 170	|£515	|
|171 - 190	|£830	|
|191 - 225	|£1,240	|
|226 - 255	|£1,760	|
|Over 255	|£2,070	|

---

### Story 2

##### First tax payment when you register the vehicle

|C02 g/km   |Diesel |
|-----------|-------|
|0	        |£0     |
|1 - 50	    |£25	|
|51 - 75	|£105	|
|76 - 90	|£125	|
|91 - 100	|£145	|
|101 - 110	|£165	|
|111 - 130	|£205	|
|131 - 150	|£515	|
|151 - 170	|£830	|
|171 - 190	|£1,240	|
|191 - 225	|£1,760	|
|226 - 255	|£2,070	|
|Over 255	|£2,070	|

---

### Story 3

##### First tax payment when you register the vehicle

|C02 g/km   |Alternative Fuel|
|-----------|-------|
|0	        |£0|
|1 - 50	    |£0|
|51 - 75	|£15|
|76 - 90	|£95|
|91 - 100	|£115|
|101 - 110	|£135|
|111 - 130	|£155|
|131 - 150	|£195|
|151 - 170	|£505|
|171 - 190	|£820|
|191 - 225	|£1,230|
|226 - 255	|£1,750|
|Over 255	|£2,060|

---

### Story 4

##### Rates for second tax payment onwards

|Fuel                   |Cost    |
|-----------------------|--------|
|Petrol or Diesel       |£140    |
|Electric               |£0      |
|Alternative            |£130    |

---

### Story 5

##### Vehicles with a list price of more than £40,000

|Fuel                   |Cost    |
|-----------------------|--------|
|Petrol or Diesel       |£450    |
|Electric               |£310    |
|Alternative            |£440    |
