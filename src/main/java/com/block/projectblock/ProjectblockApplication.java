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

		String post = "{\n" +
				"  \"bits\": \"222222222222\",\n" +
				"  \"blockReward\": 0,\n" +
				"  \"blockSize\": \"46464667975\",\n" +
				"  \"confirmations\": 0,\n" +
				"  \"difficulty\": \"4433434524\",\n" +
				"  \"feeReward\": 0,\n" +
				"  \"hash\": \"string\",\n" +
				"  \"height\": 0,\n" +
				"  \"merkleRoot\": \"string\",\n" +
				"  \"nonce\": \"string\",\n" +
				"  \"strippedSize\": \"string\",\n" +
				"  \"time\": \"string\",\n" +
				"  \"txCount\": 0,\n" +
				"  \"txVolume\": 0,\n" +
				"  \"version\": \"string\",\n" +
				"  \"weight\": 0\n" +
				"}";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://localhost:8080/block"))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(post))
				.build();

		HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
	}
//	http://localhost:8080/swagger-ui/index.html
}
