package Priyansh;

import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener {

    JLabel label;
    JMenuItem newItem, openItem, saveItem, closeItem, exitItem;

    public Menu() {
        // Title and default close operation
        setTitle("Word-like Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);

        // Label to show selected action
        label = new JLabel("Select an option from File menu");
        label.setBounds(50, 100, 300, 30);
        add(label);

        // Menu bar and File menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        // Menu items
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        closeItem = new JMenuItem("Close");
        exitItem = new JMenuItem("Exit");

        // Add items to File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(closeItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);

        // Add File menu to the menu bar
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Add action listeners
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        closeItem.addActionListener(this);
        exitItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "New":
                label.setText("New File Created");
                break;
            case "Open":
                label.setText("File Opened");
                break;
            case "Save":
                label.setText("File Saved");
                break;
            case "Close":
                label.setText("File Closed");
                break;
            case "Exit":
                System.exit(0);
                break;
            default:
                label.setText("Unknown Action");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu frame = new Menu();
            frame.setVisible(true);
        });
    }
}
