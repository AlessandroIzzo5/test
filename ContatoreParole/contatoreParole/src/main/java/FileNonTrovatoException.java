

public class FileNonTrovatoException extends Exception {

	private FileNonTrovatoException(String message) {
		super(message);
	}

	public static FileNonTrovatoException fileNonTrovato() {
		return new FileNonTrovatoException("File non trovato, controllare il percorso!");
	}

}
