package chainOfResponsibility;

import chainOfResponsibility.model.BusinessModel;

public interface Handler {
	void handle(BusinessModel message);
	void setNext(Handler next);
}
