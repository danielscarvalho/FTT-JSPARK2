package ftt.ec.controller;

public class GrauRad {
	public double calculaRad (double grau) {
		
		double rad = (grau*Math.PI)/180;
		
		return rad;
	}
	
	public double calculaGrau (double rad) {
		
		double grau = rad * (180 / Math.PI);;
		
		return grau;
	}
}

