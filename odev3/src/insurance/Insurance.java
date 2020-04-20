package insurance;

import java.util.Date;

public abstract class Insurance {

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public double getInsurancePrice() {
		return insurancePrice;
	}

	public void setInsurancePrice(double insurancePrice) {
		this.insurancePrice = insurancePrice;
	}

	public Date getInsuranceBegin() {
		return insuranceBegin;
	}

	public void setInsuranceBegin(Date insuranceBegin) {
		this.insuranceBegin = insuranceBegin;
	}

	public Date getInsuranceFinish() {
		return insuranceFinish;
	}

	public void setInsuranceFinish(Date insuranceFinish) {
		this.insuranceFinish = insuranceFinish;
	}

	public String insuranceName;
	public double insurancePrice;
	public Date insuranceBegin;
	public Date insuranceFinish;

	public abstract double calculate();
}
