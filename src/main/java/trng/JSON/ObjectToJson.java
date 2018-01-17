package trng.JSON;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import trng.JSON.Customer;
import trng.JSON.Address;
import trng.JSON.PaymentMethod;

public class ObjectToJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException,
			DatatypeConfigurationException, ParseException {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		File file = new File("C:\\Users\\jimmy\\New folder\\Employee\\src\\main\\java\\trng\\Employee.json");
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(df);
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

		mapper.writeValue(System.out, getCustomer());
		mapper.writeValue(file, getCustomer());
	}

	public static Customer getCustomer() throws DatatypeConfigurationException, ParseException {
		Calendar cal = Calendar.getInstance();
		cal.set(2012, 11, 31);

		Customer customer = new Customer();
		Address address = new Address();
		PaymentMethod payment = new PaymentMethod();
		customer.setCustomerId(111);
		customer.setName("Jimmy");
		customer.setAnnualSalary(59000);
		customer.setDateOfBirth(cal.getTime());
		customer.setAddress(address);
		customer.setPayment(payment);

		address.setStreet("884 kinwest parkway");
		address.setAptNo(231);
		address.setCity("Irving");
		address.setState("Texas");
		address.setCountry("USA");
		address.setZipCode(75063);

		payment.setCardName("Discover Bank");
		payment.setCardNumber(123456786);
		List<String> cardType = new ArrayList<String>();
		cardType.add("CreditCard");
		cardType.add("DebitCard");
		payment.setCardType(cardType);
		cal.set(2016, 9, 12);
		payment.setDateFrom(cal.getTime());

		cal.set(2020, 9, 11);
		payment.setDateTo(cal.getTime());
		return customer;

	}
}
