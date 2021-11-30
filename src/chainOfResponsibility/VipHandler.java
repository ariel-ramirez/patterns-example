package chainOfResponsibility;

import chainOfResponsibility.model.BusinessModel;
import chainOfResponsibility.model.VipMessage;

public class VipHandler extends BaseHandler {

	@Override
	public void handle(BusinessModel message) {
		if (message instanceof VipMessage) {
			System.out.println("Estes el handler VIP y tiene el siguiente mensaje: " + message.toString());
		} else {
			next.handle(message);
		}
	}
	

}
