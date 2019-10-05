package by.htp.Aggregation.Task03;

public class CountryLogic {
    public static Country createBelarus() {
	City minsk = createCity("Минск");
	City brest = createCity("Брест");
	City vitebsk = createCity("Витебск");
	City gomel = createCity("Гомель");
	City grodno = createCity("Гродно");
	City mogilev = createCity("Могилёв");

	Country belarus = new Country("Беларусь", minsk);

	Region region1 = new Region("Брестская область", brest);
	Region region2 = new Region("Витебская область", vitebsk);
	Region region3 = new Region("Гомельская область", gomel);
	Region region4 = new Region("Гродненская область", grodno);
	Region region5 = new Region("Минская область", minsk);
	Region region6 = new Region("Могилёвская область", mogilev);

	District district11 = new District("Брестский район", 10000);
	district11.addCity(brest);
	region1.addDistrict(district11);

	District district21 = new District("Витебский район", 10000);
	district21.addCity(vitebsk);

	District district22 = new District("Оршанский район", 5000);
	district22.addCity(createCity("Орша"));
	region2.addDistrict(district21);
	region2.addDistrict(district22);

	District district31 = new District("Гомельский район", 10000);
	district31.addCity(gomel);
	region3.addDistrict(district31);

	District district41 = new District("Гродненский район", 10000);
	district41.addCity(grodno);
	region4.addDistrict(district41);

	District district51 = new District("Минский район", 10000);
	district51.addCity(minsk);
	region5.addDistrict(district51);

	District district61 = new District("Могилёвский район", 10000);
	district61.addCity(mogilev);
	region6.addDistrict(district61);

	belarus.addRegion(region1);
	belarus.addRegion(region2);
	belarus.addRegion(region3);
	belarus.addRegion(region4);
	belarus.addRegion(region5);
	belarus.addRegion(region6);

	return belarus;
    }

    private static City createCity(String city) {
	return new City(city);
    }

    public static String getCapitalName(Country country) {
	return country.getCapital().getCityName();
    }

    public static int calculateRegionCount(Country country) {
	return country.getRegions().size();
    }

    public static String getRegionsCentersCities(Country country) {
	String result = "";

	for (Region region : country.getRegions()) {
	    result = result + "\n" + region.getRegionalCenter().getCityName();
	}

	return result;
    }
    
    public static double calculateCountryArea(Country country) {
	double area = 0;
	
	for (Region region : country.getRegions()) {
	    for (District district : region.getDistricts()) {
		area = area + district.getArea();
	    }
	}
	
	return area;
    }
}
