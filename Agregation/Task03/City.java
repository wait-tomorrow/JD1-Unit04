﻿package by.htp.Aggregation.Task03;

public class City {
    private String cityName;

    public City(String cityName) {
	this.cityName = cityName;
    }

    public String getCityName() {
	return cityName;
    }

    public void setCityName(String cityName) {
	this.cityName = cityName;
    }

    @Override
    public String toString() {
	return "City [cityName=" + cityName + "]";
    }
}
