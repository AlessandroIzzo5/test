
public class Ripetizione {

	private String parola;
	private int numeroRipetizioni;

	public Ripetizione(String parola) {
		super();
		this.parola = parola;
	}

	public String getParola() {
		return parola;
	}

	public int getNumeroRipetizioni() {
		return numeroRipetizioni;
	}

	public void aumentaRipetizione() {
		numeroRipetizioni++;
	}

	@Override
	public String toString() {
		return "Ripetizione [parola=" + parola + ", numeroRipetizioni=" + numeroRipetizioni + "]";
	}
	
	
	
}
