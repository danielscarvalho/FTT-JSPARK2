package ftt.ec.controller;

//Gabrielle Novaes - 082180020 - Conversor Binário <> Hexadecimal

public class ConversorBinHexa {

public String convertBin (String binario) {
	
		int a = Integer.parseInt(binario, 2);;
		String hexa = Integer.toHexString(a);
		
		return String.valueOf(hexa); 
	}

public String convertHex (String hexadecimal) {
	
	int a = Integer.parseInt(hexadecimal, 16);;
	String binary = Integer.toBinaryString(a);
	
	return String.valueOf(binary); 
	
}
	
}
