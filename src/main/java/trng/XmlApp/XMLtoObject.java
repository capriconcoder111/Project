package trng.XmlApp;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import trng.jaxb.Customer;

public class XMLtoObject {

	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\\\Users\\\\jimmy\\\\New folder\\\\Employee\\\\src\\\\main\\\\java\\\\trng\\\\customerInfo.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);

		System.out.println(ReflectionToStringBuilder.toString(customer));
	}

}
