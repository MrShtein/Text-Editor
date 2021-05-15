package editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Load implements ActionListener {

    JTextField textField;
    JTextArea textArea;

    public Load(JTextField textField, JTextArea textArea) {
        this.textField = textField;
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String fileName = textField.getText();
        try {
            Path pathToFile = Paths.get(fileName);
            if (Files.exists(pathToFile)) {
                String textFromFile = Files.readString(pathToFile);
                textArea.setText(textFromFile);
            } else {
                textArea.setText("");
                throw new FileNotFoundException("File not found");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
