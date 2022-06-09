package controller;


import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;

public class SearchData extends FileController {

    //consulta la db de palabras
    public RandomAccessFile fileReader;

    public SearchData() {

        //super(Config.pathTxtFile); 

        try {
            fileReader = new RandomAccessFile(file, "r");

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Database not found",
                    "DATABASE ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            e.printStackTrace();
        }
    }

    public String translate(String word) {

        String translation = "ok";
        String savedWord = "";

        int counter = 0, counterOne = 0;

        try {

            String line = fileReader.readLine();
            boolean find = false;

            while (line != null && find != true) {

                String[] tuple = line.split("#");
                String[] tupleTwo = word.split(" ");

                for (int i = 0; i <= tupleTwo.length - 1; i++) {
                    for (int j = 0; j <= tuple.length - 1; j++) {
                        if (tupleTwo[i].equalsIgnoreCase(tuple[j])) {
                            translation = tuple[tuple.length - 1];
                            counter++;
                        }
                    }
                }

                if (counter >= counterOne) {
                    counterOne = counter;
                    savedWord = translation;
                    
                }

                counter = 0;
                line = fileReader.readLine();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "translate db does error",
                    "TRANSLATE DB ERROR",
                    JOptionPane.ERROR_MESSAGE
            );

            e.printStackTrace();
        } finally {

            try {
                fileReader.close();

            } catch (IOException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "close db error",
                        "TRANSLATE DB ERROR",
                        JOptionPane.ERROR_MESSAGE
                );

                e.printStackTrace();
            }

            return savedWord;
        }
    }
}