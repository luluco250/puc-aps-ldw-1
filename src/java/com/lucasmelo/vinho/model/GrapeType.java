package com.lucasmelo.vinho.model;

public enum GrapeType {
	NONE,
	PURPLE,
	GREEN;
	
	private static final GrapeType[] _values = GrapeType.values();
	
	public static final GrapeType fromInt(int i) {
		return _values[i];
	}
}
