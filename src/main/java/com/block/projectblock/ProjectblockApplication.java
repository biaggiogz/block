package com.block.projectblock;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class ProjectblockApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		SpringApplication.run(ProjectblockApplication.class, args);

	}
//	http://localhost:8080/swagger-ui/index.html
}
