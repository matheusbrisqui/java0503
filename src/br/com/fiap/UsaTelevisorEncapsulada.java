package br.com.fiap;

public class UsaTelevisorEncapsulada {

	public static void main(String[] args) {
		
		TelevisorEncapsulada tele1 = new TelevisorEncapsulada();
		
		
		tele1.setCanal(5);
		tele1.setVolume(15);
		tele1.mostrar();
		
		tele1.setCanal(9);
		tele1.aumentarVolume();
		tele1.aumentarVolume();
		tele1.aumentarVolume();
		tele1.aumentarVolume();
		tele1.aumentarVolume();
		tele1.aumentarVolume();
		tele1.mostrar();
		
		tele1.setVolume(3);
		tele1.setCanal(7);
		tele1.diminuirVolume();
		tele1.diminuirVolume();
		tele1.diminuirVolume();
		tele1.diminuirVolume();
		tele1.mostrar();

	}

}
