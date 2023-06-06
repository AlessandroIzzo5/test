import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		FileDiTesto file1 = FileDiTesto.create("C:\\Lavoro\\Laboratorio\\ContatoreParole\\contatoreParole\\src\\main\\resources\\Test.txt");
		FileDiTesto file2 = FileDiTesto.create("C:\\Lavoro\\Laboratorio\\ContatoreParole\\contatoreParole\\src\\main\\resources\\Test.txt");
		
		List<FileDiTesto> fileDaLeggere = new ArrayList<>();
		
		fileDaLeggere.add(file1);
		fileDaLeggere.add(file2);
		
		
		LettoreFile lettoreFile = new LettoreFile(fileDaLeggere);
		
		lettoreFile.trovaRipetizioni("ciao");
		
	}

}
