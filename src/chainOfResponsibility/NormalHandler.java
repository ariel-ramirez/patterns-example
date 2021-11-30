package chainOfResponsibility;

import chainOfResponsibility.model.BusinessModel;
import chainOfResponsibility.model.NormalMessage;

public class NormalHandler extends BaseHandler {

	@Override
	public void handle(BusinessModel message) {
		if (message instanceof NormalMessage) {
			System.out.println("Este es el handler Normal y tiene este mensaje: " + message.toString());
		} else {
			next.handle(message);
		}
	}

	
}
