import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LettoreFile {

	private List<FileDiTesto> fileDaLeggere;

	public LettoreFile(List<FileDiTesto> fileDaLeggere) {
		super();
		this.fileDaLeggere = fileDaLeggere;
	}

	public List<FileDiTesto> getFileDaLeggere() {
		return fileDaLeggere;
	}

	public File trovaRipetizioni(String pathDiDestinazioneDelFile) {

		File fileDiOutput = new File(pathDiDestinazioneDelFile);

		Map<String, Ripetizione> paroleRipetute = new TreeMap<>();
		for (FileDiTesto fileDiTesto : fileDaLeggere) {
			File file = fileDiTesto.getFile();
			try {
				Scanner scanner = new Scanner(file);

				while (scanner.hasNext()) {

					String parola = scanner.next();

					Ripetizione ripetizione = paroleRipetute.get(parola);
					if (ripetizione == null) {
						ripetizione = new Ripetizione(parola);
						ripetizione.aumentaRipetizione();
						paroleRipetute.put(parola, ripetizione);
					} else {
						ripetizione.aumentaRipetizione();
					}
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}

		paroleRipetute.values().stream().forEach(System.out::println);

		return null;
	}
}
