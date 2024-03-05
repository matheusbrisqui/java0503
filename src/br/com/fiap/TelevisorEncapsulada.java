package br.com.fiap;

public class TelevisorEncapsulada {

	private int volume;
	private int canal;
	
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		try {
			if (volume >=0 && volume <= 20) {
				this.volume = volume;
			} else {
				throw new Exception("Volume não permitido (0 a 20)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		try {
			if (canal == 2 || canal == 4 || canal ==5 || canal == 7 || canal == 13) {
				this.canal = canal;
			} else {
				throw new Exception("Faixa de canal não disponível (2, 4, 5, 7, 13)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void aumentarVolume() {
		if (volume < 20) {
			volume++;
		}
	}
	
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	
	public void mostrar() {
		System.out.println("Volume: " + volume + "\nCanal: " + canal);
	}
	
	
	
}
