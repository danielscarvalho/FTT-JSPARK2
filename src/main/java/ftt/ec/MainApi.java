package ftt.ec;

import static spark.Spark.*;
import ftt.ec.controller.*;
import spark.Spark;

import java.util.Date;

import api.controller_dadosclimaticos;

public class MainApi {

	public static void main(String[] args) {
		System.out.println("FTT-JSPARK2 - " + new Date());
		
		//Testar com o Postman...
		//APP Java - JAR - Java Archive
		// https://www.eclipse.org/jetty/download.php
		// https://sparkjava.com/tutorials/maven-setup
		// https://books.goalkicker.com/JavaBook/
		
		// https://www.baeldung.com/spark-framework-rest-api
		// https://www.javatpoint.com/spark-java
	
		//Microserviço com Java Spark - http://localhost:4567/hello
		
		Spark.staticFiles.location("public");
		port(8080); //Default - 4567
		
		get("/hello", (req, res) -> "Hello FTT - GET - " + new Date());
		delete("/hello", (req, res) -> "Hello FTT - DELETE - " + new Date());
		post("/hello", (req, res) -> "Hello FTT - POST - " + new Date());
		put("/hello", (req, res) -> "Hello FTT - PUT - " + new Date());
		
		//TODO - Daniel Carvalho - API Senha segura...
	    get("/safepassword", (req,res) -> new SafePassword().getPassword());
	    
	    get("/soma/:a/:b", (req,res) -> new Calc().add(req.params(":a"),req.params(":b")));
	    
	    get("/test", (req,res) -> {
	    	res.type("application/json"); //mime type
	    	return "{\"now\":\"" + new Date().toString() + "\",\"status\":\"ok\"}";
	    });
	    
	    
	    get("/github/:query", (req,res) -> {
	    	res.type("application/json"); //mime type
	    	return new GitHubUser().getInfo(req.params(":query"));
	    });
	    
	    get("/clima/:cidade", (req, res) -> new controller_dadosclimaticos().Voltadados(req.params(":cidade")));
	    
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
