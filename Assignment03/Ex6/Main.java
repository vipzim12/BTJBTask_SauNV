package Ex6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) throws IOException {

		Path source = Paths.get("C:\\Users\\SauNV\\workspace\\BTJBTask\\Assignment03\\Ex6\\fileTest.txt");
		Path destination = Paths.get("C:\\Users\\SauNV\\workspace\\BTJBTask\\Assignment03\\copyFileTest.txt");
		File file = new File(destination.toString());
		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
		if (file.exists()) {
			System.out.println("Copied file.");
		} else {
			System.out.println("Erro, Can't copy file");
		}

	}

}
