package me.Done;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Config {

    Config() {
        File f = new File(System.getenv("APPDATA") + "/SimplyDone/Data.dat");
        if(!f.exists()) {
            f.mkdir();
            try {
                Files.copy(new File("Data.dat").toPath(), f.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                System.err.println("Couldn't create Data File in \"" + f.getAbsolutePath() + "\".");
                e.printStackTrace();
                System.exit(-1);
            }
        }
    }

}
