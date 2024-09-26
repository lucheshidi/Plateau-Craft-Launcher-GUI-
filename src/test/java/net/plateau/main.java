package net.plateau;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class main extends JFrame {

    private void init() {
        this.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        final JLabel topLabel = new JLabel("North");
        topPanel.add(topLabel);
        this.add(topPanel, BorderLayout.NORTH);

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel firstTabCont = new JPanel();
        firstTabCont.add(new JLabel("First"));
        tabbedPane.addTab("First", firstTabCont);

        JPanel secondTabCont = new JPanel();
        secondTabCont.add(new JLabel("Second"));
        tabbedPane.addTab("Second", secondTabCont);

        this.add(tabbedPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        final JLabel bottomLabel = new JLabel("South");
        bottomPanel.add(bottomLabel);
        this.add(bottomPanel, BorderLayout.SOUTH);

        tabbedPane.addChangeListener(evt -> {
            JTabbedPane pane = (JTabbedPane) evt.getSource();
            int selectedIndex = pane.getSelectedIndex();
            if (selectedIndex == 0) {
                topLabel.setText("");
                topLabel.setText("Hi");

                bottomLabel.setText("");
                bottomLabel.setText("Bye");
            } else {
                topLabel.setText("");
                topLabel.setText("Bye");

                bottomLabel.setText("");
                bottomLabel.setText("Hi");
            }

        });
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new main().init();
    }
}