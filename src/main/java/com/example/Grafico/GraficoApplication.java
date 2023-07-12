package com.example.Grafico;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Grafico.controllers.ForandStream;


@SpringBootApplication
public class GraficoApplication  {

    
 

	private static void openHomePage() throws IOException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080");

		
	}
		
	public static void main(String[] args) throws IOException  {
		SpringApplication.run(GraficoApplication.class, args);	

		openHomePage();

		ForandStream F = new ForandStream();

		F.For();
		F.ForStream();
	}





}


