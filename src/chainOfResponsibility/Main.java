package chainOfResponsibility;

import chainOfResponsibility.model.AdminMessage;
import chainOfResponsibility.model.BusinessModel;
import chainOfResponsibility.model.NormalMessage;
import chainOfResponsibility.model.UnknowMessage;
import chainOfResponsibility.model.VipMessage;

public class Main {
	private static Handler normalHandler;
	private static Handler vipHandler;
	private static Handler adminHandler;

	public static void main(String[] args) {
		setupHandlers();
		chainHandlers();

		// Creamos objetos de pruebas
		BusinessModel normal = new NormalMessage("pepito", 5932L);
		BusinessModel vip = new VipMessage("vipID", "VipLocale", 9876L, 23L);
		BusinessModel admin = new AdminMessage("24 x 7 al pie del cañón");
		BusinessModel unknow = new UnknowMessage();

		// Llamamos a nuestros handlers (siempre vamos a llamar al primero de la cadena)
		handle(admin);
		System.out.println("------------------");
		handle(vip);
		System.out.println("------------------");
		handle(normal);
		System.out.println("------------------");
		handle(unknow);
		System.out.println("------------------");
	}
	
	/*
	 * Instanciamos los handlers
	 */
	private static void setupHandlers() {
		normalHandler = new NormalHandler();
		vipHandler = new VipHandler();
		adminHandler = new AdminHandler();
	}
	
	/*
	 * Encadenamos los handlers
	 */
	private static void chainHandlers() {
		normalHandler.setNext(vipHandler);
		vipHandler.setNext(adminHandler);
	}
	
	/*
	 * Llamamos al primer eslabón de la cadena
	 */
	private static void handle(BusinessModel message) {
		normalHandler.handle(message);
	}

}
