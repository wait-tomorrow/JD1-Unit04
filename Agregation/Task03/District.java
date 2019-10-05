package by.htp.Aggregation.Task03;

import java.util.ArrayList;
import java.util.List;

//район
public class District {
    private String districtName;
    private List<City> cities;
    private double area;

    public District(String districtName, double area) {
	this.districtName = districtName;
	this.cities = new ArrayList<City>();
	this.area = area;
    }

    public String getDistrictName() {
	return districtName;
    }

    public void addCity(City city) {
	cities.add(city);
    }
    
    public void setDistrictName(String districtName) {
	this.districtName = districtName;
    }

    public List<City> getCities() {
	return cities;
    }

    public void setCities(List<City> cities) {
	this.cities = cities;
    }

    public double getArea() {
	return area;
    }

    public void setArea(double area) {
	this.area = area;
    }

    @Override
    public String toString() {
	return "District [districtName=" + districtName + ", area=" + area + ", cities=" + cities + "]";
    }
}
