package com.lucasmelo.vinho.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List<String> getBrands(String color, GrapeType grapeType) {
    	List<String> brands = new ArrayList<String>();
        if (color.equals("branco")) {
			brands.add("Sauvignon Blanc");
			brands.add("Chardonnay");
        } else {
			brands.add("Cabernet Sauvignon");
			brands.add("Merlot");
    	}
        return (brands);
	}
}