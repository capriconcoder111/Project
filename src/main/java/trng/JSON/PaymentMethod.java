package trng.JSON;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PaymentMethod {

	private int cardNumber;
	private String cardName;
	private Date dateFrom;
	private Date dateTo;
	private List<String> cardType;
}
