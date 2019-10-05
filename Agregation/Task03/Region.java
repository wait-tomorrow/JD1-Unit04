package by.htp.Aggregation.Task03;

import java.util.ArrayList;
import java.util.List;

//область
public class Region {
    private List<District> districts;
    private String regionName;
    private City regionalCenter;

    public Region(String regionName, City regionalCenter) {
	this.regionName = regionName;
	this.districts = new ArrayList<District>();
	this.regionalCenter = regionalCenter;
    }

    public List<District> getDistricts() {
	return districts;
    }
    
    public void addDistrict(District district) {
	districts.add(district);
    }

    public void setDistricts(List<District> districts) {
	this.districts = districts;
    }

    public String getRegionName() {
	return regionName;
    }

    public void setRegionName(String regionName) {
	this.regionName = regionName;
    }

    public City getRegionalCenter() {
	return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
	this.regionalCenter = regionalCenter;
    }

    @Override
    public String toString() {
	return "Region [regionName=" + regionName + ", regionalCenter=" + regionalCenter + ", districts=" + districts
		+ "]";
    }
}
