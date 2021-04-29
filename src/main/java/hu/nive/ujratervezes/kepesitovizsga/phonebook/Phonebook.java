package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {


    public void exportPhonebook(Map<String, String> contacts, String output) {
        StringBuilder sb = new StringBuilder();
        String result = null;
        if (contacts == null || output == null){
            throw new IllegalArgumentException("Invalid parameter!");
        }
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(output))) {
            for (Map.Entry<String, String> entry: contacts.entrySet()) {
                String item = entry.getKey() + ": " + entry.getValue() + ", ";
                sb.append(item);
            }
            result = sb.substring(0, result.length()-2);
            bufferedWriter.write(result);
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!", e);
        }
    }
}
