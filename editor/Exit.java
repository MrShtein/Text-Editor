package editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Exit implements ActionListener {

    JFrame jFrame;

    public Exit(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        jFrame.dispose();
    }
}
