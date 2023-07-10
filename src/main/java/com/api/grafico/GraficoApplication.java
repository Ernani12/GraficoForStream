package com.api.grafico;




import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraficoApplication {

	private static void openHomePage() throws IOException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080");
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(GraficoApplication.class, args);
		openHomePage();
	}

}
