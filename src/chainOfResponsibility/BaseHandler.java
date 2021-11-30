package chainOfResponsibility;

import chainOfResponsibility.model.BusinessModel;

public class BaseHandler implements Handler {
	protected Handler next;
	
	public BaseHandler() {}
	
	@Override
	public void handle(BusinessModel message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setNext(final Handler next) {
		this.next = next;
	}

}
