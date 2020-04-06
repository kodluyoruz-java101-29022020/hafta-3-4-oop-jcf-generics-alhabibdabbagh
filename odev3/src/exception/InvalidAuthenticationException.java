package exception;

public class InvalidAuthenticationException extends Exception {
	private String Masage;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidAuthenticationException(String Masage) {
		this.Masage=Masage;
	}
	
	
	public String getMasage() {
		return Masage;
	}
	public void setMasage(String masage) {
		Masage = masage;
	}
	public String masage(String mass) {
		return mass+"kullanci yanlis sifre veya email girdi";
	}
	

	

}
