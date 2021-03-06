package editor;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;

public class TextEditor extends JFrame {
   // final String path = System.getProperty("user.dir") + "/Text Editor/task/";

    public TextEditor() {
        setTitle("The first stage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 370);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setName("MenuFile");

        JMenuItem loadMenuItem = new JMenuItem("Load");
        loadMenuItem.setName("MenuLoad");

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.setName("MenuSave");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setName("MenuExit");
        exitMenuItem.addActionListener(new Exit(this));

        JPanel topPanel = new JPanel();
        topPanel.setSize(600, 100);

        JTextField textField = new JTextField();
        textField.setName("FilenameField");
        textField.setPreferredSize(new Dimension(230, 27));

        JTextArea textArea = new JTextArea();
        textArea.setName("TextArea");

        JButton saveBtn = new JButton("Save");
        saveBtn.setName("SaveButton");
        saveBtn.setPreferredSize(new Dimension(100, 27));
        saveBtn.addActionListener(new Save(textField, textArea));

        saveMenuItem.addActionListener(new Save(textField, textArea));



        JButton loadBtn = new JButton("Load");
        loadBtn.setName("LoadButton");
        loadBtn.setPreferredSize(new Dimension(100, 27));
        loadBtn.addActionListener(new Load(textField, textArea));

        loadMenuItem.addActionListener(new Load(textField, textArea));



        topPanel.add(textField);
        topPanel.add(saveBtn);
        topPanel.add(loadBtn);



        JPanel bottomPanel = new JPanel();
        bottomPanel.setSize(600, 400);



        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setName("ScrollPane");
        scrollPane.setPreferredSize(new Dimension(440, 250));



        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);



        bottomPanel.add(scrollPane);
        add(topPanel);
        add(bottomPanel);

        fileMenu.add(loadMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);



    }
}
