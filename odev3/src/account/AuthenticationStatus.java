package account;

public enum AuthenticationStatus {
	//SUCCESS,FAIL;
	SUCCESS("İşlem başarılıdır."),
	FAIL("İşlem başarısızdır.");
	
private String resualt;



	private AuthenticationStatus(String resualt) {
		this.resualt=resualt;
		// TODO Auto-generated constructor stub
	}

	 

}
