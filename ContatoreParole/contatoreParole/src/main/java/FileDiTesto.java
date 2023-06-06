

import java.io.File;


public class FileDiTesto {

	private File file;

	private FileDiTesto(File file) {
		super();
		this.file = file;
	}

	public File getFile() {
		return file;
	}

	public static FileDiTesto create(String path) {

		File file = new File(path);

		if (file.exists()) {
			return new FileDiTesto(file);
		} else {
			System.out.println(FileNonTrovatoException.fileNonTrovato().getMessage());
			return null;
		}
		
		
	}
}
