package chainOfResponsibility.model;

public class NormalMessage extends BusinessModel {
	private String clientIdentifier;
	private Long amount;
	
	public NormalMessage(String clientIdentifier, Long amount) {
		super();
		this.clientIdentifier = clientIdentifier;
		this.amount = amount;
	}

	public String getClientIdentifier() {
		return clientIdentifier;
	}

	public Long getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "NormalMessage [clientIdentifier=" + clientIdentifier + ", amount=" + amount + "]";
	}
	
	
}
