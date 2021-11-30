package chainOfResponsibility.model;

public class VipMessage extends BusinessModel {
	private String vipClientIdentifier;
	private String internationalIdentifier;
	private Long localMoneyAmount;
	private Long exchangeAtTheDate;
	
	public VipMessage(String vipClientIdentifier, String internationalIdentifier, Long localMoneyAmount,
			Long exchangeAtTheDate) {
		super();
		this.vipClientIdentifier = vipClientIdentifier;
		this.internationalIdentifier = internationalIdentifier;
		this.localMoneyAmount = localMoneyAmount;
		this.exchangeAtTheDate = exchangeAtTheDate;
	}
	public String getVipClientIdentifier() {
		return vipClientIdentifier;
	}
	public void setVipClientIdentifier(String vipClientIdentifier) {
		this.vipClientIdentifier = vipClientIdentifier;
	}
	public String getInternationalIdentifier() {
		return internationalIdentifier;
	}
	public void setInternationalIdentifier(String internationalIdentifier) {
		this.internationalIdentifier = internationalIdentifier;
	}
	public Long getLocalMoneyAmount() {
		return localMoneyAmount;
	}
	public void setLocalMoneyAmount(Long localMoneyAmount) {
		this.localMoneyAmount = localMoneyAmount;
	}
	public Long getExchangeAtTheDate() {
		return exchangeAtTheDate;
	}
	public void setExchangeAtTheDate(Long exchangeAtTheDate) {
		this.exchangeAtTheDate = exchangeAtTheDate;
	}
	
	@Override
	public String toString() {
		return "VipMessage [vipClientIdentifier=" + vipClientIdentifier + ", internationalIdentifier="
				+ internationalIdentifier + ", localMoneyAmount=" + localMoneyAmount + ", exchangeAtTheDate="
				+ exchangeAtTheDate + "]";
	}
	
}
