package chainOfResponsibility;

import chainOfResponsibility.model.AdminMessage;
import chainOfResponsibility.model.BusinessModel;

public class AdminHandler extends BaseHandler {

	@Override
	public void handle(BusinessModel message) {
		if (message instanceof AdminMessage) {
			System.out.println("Eres el admin con este dato de login: " + message.toString());
		} else {
			System.out.println("Tu mensaje no se pudo resolver: Este es el último eslabón, no hay más handlers!");
		}
	}
	

}
