package com.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class City {
	private String name;
	private double temperature;

	public City(String name, double temperature) {
		this.name = name;
		this.temperature = temperature;
	}

	public String getName() {
		return name;
	}

	public Double getTemperature() {
		return temperature;
	}

}

public class TerminalExample {
	private static List<City> prepareTemperature() {
		List<City> cities = new ArrayList<>();
		cities.add(new City("New Delhi", 33.5));
		cities.add(new City("Mexico", 14));
		cities.add(new City("New York", 13));
		cities.add(new City("Dubai", 43));
		cities.add(new City("London", 15));
		cities.add(new City("Alaska", 1));
		cities.add(new City("Kolkata", 30));
		cities.add(new City("Sydney", 11));
		cities.add(new City("Mexico", 14));
		cities.add(new City("Dubai", 43));
		return cities;
	}

	public static void main(String[] args) {
		System.out.println(prepareTemperature().stream().filter(f -> f.getTemperature() > 10).map(f -> f.getName())
				.collect(Collectors.toList()));
	}
}