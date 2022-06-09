package controller;


import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;

public class FileController {

    protected File file = new File(Config.pathTxtFile);

//    public FileController(String file) {
//        this.file = new File(file);
//    }
//
//    public FileController(File file) {
//        this.file = file;
//    }

    public String getFileContent() throws IOException {

        StringBuilder fileContent = new StringBuilder();

        try {

            RandomAccessFile fileReader = new RandomAccessFile(file, "r");
            String line = fileReader.readLine();

            while (line != null) {
                fileContent.append("\n").append(line);
                line = fileReader.readLine();
            }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "File does not exist",
                    "FILE ERROR",
                    JOptionPane.ERROR_MESSAGE
            );

            e.printStackTrace();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error reading file",
                    "FILE ERROR",
                    JOptionPane.ERROR_MESSAGE
            );

            e.printStackTrace();
        }

        return fileContent.toString();
    }

    public void save(String fileContent) {
        try {
            
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            ps.println(fileContent);
            ps.flush();
            ps.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "File does not exist",
                    "FILE ERROR",
                    JOptionPane.ERROR_MESSAGE
            );

            e.printStackTrace();
        }
    }

}