package ftt.ec;

import static spark.Spark.*;

import java.util.Date;

public class MainApi {

	public static void main(String[] args) {
		System.out.println("FTT-JSPARK2 - " + new Date());
		
		//Testar com o Postman...
		//APP Java - JAR - Java Archive
		// https://www.eclipse.org/jetty/download.php
		// https://sparkjava.com/tutorials/maven-setup
		// https://books.goalkicker.com/JavaBook/
	
		//Microserviço com Java Spark
		
		get("/hello", (req, res) -> "Hello FTT - GET - " + new Date());
		delete("/hello", (req, res) -> "Hello FTT - DELETE - " + new Date());
		post("/hello", (req, res) -> "Hello FTT - POST - " + new Date());
		put("/hello", (req, res) -> "Hello FTT - PUT - " + new Date());
	
	}

}

/* 
 * Instalação de packages com dependências
 *
 * Maven - mvn - Java
 * Python - pip
 * JavaScript - npm
 * PHP - apt (Linux)
 * 
 * 
 */
