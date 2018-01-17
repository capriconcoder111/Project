package trng.JSON;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

	private int customerId;
	private String name;
	private Date dateOfBirth;
	private float annualSalary;
	private Address address;
	private PaymentMethod payment;

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", annualSalary=" + annualSalary + ", address=" + address + ", payment=" + payment + "]";
	}

}
