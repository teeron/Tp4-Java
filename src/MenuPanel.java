import javax.swing.*;

public class MenuPanel extends JPanel{

    JButton buttonAdd = new JButton("ADD");
    JButton buttonDisplay = new JButton("DISPLAY");

    public MenuPanel(Viewmanager viewmanager){
        viewmanager.setTitle("Employee Manager/Menu");

        this.add(buttonAdd);
        this.add(buttonDisplay);

        buttonAdd.addActionListener(e -> viewmanager.displayAddEmployee());
        buttonDisplay.addActionListener(e -> viewmanager.displayEmployees());
    }
}