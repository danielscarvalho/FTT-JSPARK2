package ftt.ec.controller;

//Caico Eduardo - 082180008 - Conversor de temperatura

public class ConverteTemperatura {
	
	public double ConverteParaCelsius (Double fahrenheit) {
		
		return  (fahrenheit-32)/1.8
	}
	
	public double ConverteParaFahrenheit (Double celsius) {
			
		return 1.8*celsius+32
	}

}
