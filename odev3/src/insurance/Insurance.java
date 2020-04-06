package insurance;

import java.util.Date;

public abstract  class Insurance {

	String insuranceName;
	double insurancePrice;
	Date insuranceBegin;
public abstract  double calculate();
}
