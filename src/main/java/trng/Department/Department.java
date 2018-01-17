package trng.Department;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Department {

	@Getter @Setter private int deptNo;
	@Getter @Setter private String deptName;
	@Getter @Setter private String location;
	
}
