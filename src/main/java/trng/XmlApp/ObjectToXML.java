package trng.XmlApp;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import trng.jaxb.Address;
import trng.jaxb.Customer;
import trng.jaxb.PaymentMethod;

public class ObjectToXML {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\jimmy\\New folder\\Employee\\src\\main\\java\\trng\\customerInfo.xml");

		JAXBContext contextObj = JAXBContext.newInstance(Customer.class);
		Marshaller jaxbMarshaller = contextObj.createMarshaller();

		jaxbMarshaller.setProperty(jaxbMarshaller.JAXB_FORMATTED_OUTPUT, true);

		Customer cust = createCustomer();
		jaxbMarshaller.marshal(cust, file);
		jaxbMarshaller.marshal(cust, System.out);
	}

	private static Customer createCustomer() throws DatatypeConfigurationException {

		GregorianCalendar gCalandar = new GregorianCalendar();
		gCalandar.setTime(new Date());
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalandar);

		Customer customer = new Customer();
		Address address = new Address();
		PaymentMethod payment = new PaymentMethod();
		customer.setCutomerId(111);
		customer.setName("Jimmy");
		customer.setAnnualSalary(59000);
		customer.setDateOfBirth(date2);
		customer.setAddress(address);
		customer.setPaymentMethod(payment);

		address.setStreet("884 kinwest parkway");
		address.setAptNo(231);
		address.setCity("Irving");
		address.setState("Texas");
		address.setCountry("USA");
		address.setZipCode(75063);

		gCalandar.set(2016, 12, 12);
		XMLGregorianCalendar dateFrom = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalandar);

		gCalandar.set(2022, 12, 12);
		XMLGregorianCalendar dateTo = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalandar);

		payment.setCardName("Discover Bank");
		payment.setCardNumber(123456786);
		payment.setCardType("CreditCard");
		payment.setDateFrom(dateFrom);
		payment.setDateFrom(dateTo);
		return customer;
	}

}
