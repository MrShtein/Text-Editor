package editor;

import javax.swing.*;

public class TextEditor extends JFrame {
    public TextEditor() {
        setTitle("The first stage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        initComponents();
        setVisible(true);
        setLayout(null);
    }

    private void initComponents() {
        JPanel common = new JPanel();
        common.setSize(280, 280);
        common.setBounds(5,5,100,100);

        JTextArea textArea = new JTextArea();

        common.add(new TextArea(15, 20));

        add(common);


    }
}
