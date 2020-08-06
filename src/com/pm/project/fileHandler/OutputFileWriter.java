package com.pm.project.fileHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Parham on 17-Apr-18.
 */
public class OutputFileWriter {
    public OutputFileWriter(ArrayList<String> inputStrings, int i) throws IOException {
        FileWriter file = new FileWriter("inputs/address_" + i + ".txt");
        String s = inputStrings.get(0);
        for (int j = 1; j < 500; j++)
            s = s + "\r\n" + inputStrings.get(j);
        file.write(s);
        file.close();
    }
}
