package trng.JSON;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String file = "C:\\Users\\jimmy\\New folder\\Employee\\src\\main\\java\\trng\\Employee.json";

		byte[] jsonData = Files.readAllBytes(Paths.get(file));

		ObjectMapper mapper = new ObjectMapper();

		Customer customer = mapper.readValue(jsonData, Customer.class);

		System.out.println(customer);
	}

}
