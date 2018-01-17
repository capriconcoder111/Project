package trng.JSON;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Address {

	private String street;
	private int aptNo;
	private String city;
	private String state;
	private String country;
	private int zipCode;
}
