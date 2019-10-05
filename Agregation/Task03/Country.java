package by.htp.Aggregation.Task03;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private List<Region> regions;
    private City capital;

    public Country(String name, City capital) {
	this.regions = new ArrayList<Region>();
	this.name = name;
	this.capital = capital;
    }

    public void addRegion(Region region) {
	regions.add(region);
    }
    
    public List<Region> getRegions() {
	return regions;
    }

    public void setRegions(List<Region> regions) {
	this.regions = regions;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public City getCapital() {
	return capital;
    }

    public void setCapital(City capital) {
	this.capital = capital;
    }
    
    @Override
    public String toString() {
	return "Country [name=" + name + ", capital=" + capital + ", regions=" + regions + "]";
    }
}