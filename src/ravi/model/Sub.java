package ravi.model;

public class Sub {
	
	
	private String accountIdentifier;
	private String success;
	
	public Sub(String accountIdentifier,String success)
	{
		this.accountIdentifier=accountIdentifier;
		this.success=success;
		
	}
	
	public  Sub(){
	
	}

	public String getAccountIdentifier() {
		return accountIdentifier;
	}

	public void setAccountIdentifier(String accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	
	
}