package editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Save implements ActionListener {

    JTextField textField;
    JTextArea textArea;

    public Save(JTextField textField, JTextArea textArea) {
        this.textField = textField;
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String fileName = textField.getText();
        try {
            FileWriter fw = new FileWriter( fileName, false);
            String textToFile = textArea.getText();
            fw.write(textToFile);
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
