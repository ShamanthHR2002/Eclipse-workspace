package com.xworkz.collection1;  

public class CountryDTO {
    private String name;
    private CountryCode code;
    private long population;
    private String presidentName;
    private Continent continent;

    
    public CountryDTO(String name, CountryCode code, long population, String presidentName, Continent continent) {
        this.name = name;
        this.code = code;
        this.population = population;
        this.presidentName = presidentName;
        this.continent = continent;
    }

    
    public String getName() {
        return name;
    }

    public CountryCode getCode() {
        return code;
    }

    public long getPopulation() {
        return population;
    }

    public String getPresidentName() {
        return presidentName;
    }

    public Continent getContinent() {
        return continent;
    }


	@Override
	public String toString() {
		return "CountryDTO [getName()=" + getName() + ", getCode()=" + getCode() + ", getPopulation()="
				+ getPopulation() + ", getPresidentName()=" + getPresidentName() + ", getContinent()=" + getContinent()
				+ "]";
	}

   
   
    }

