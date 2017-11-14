import javax.swing.*;

public class Viewmanager extends JFrame{

    private MenuPanel menuPanel;
    private MenuAddEmployee addEmployee;
    private MenuDisplayEmployees displayEmployees;

    public Viewmanager(){
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        displayMenu();
    }

    public void displayMenu(){
        menuPanel = new MenuPanel(this);
        this.getContentPane().removeAll();
        this.getContentPane().add(menuPanel);
        this.revalidate();
        this.repaint();
        this.setVisible(true);
    }

    public void displayAddEmployee(){
        addEmployee = new MenuAddEmployee(this);
        this.getContentPane().removeAll();
        this.getContentPane().add(addEmployee);
        this.revalidate();
        this.repaint();
    }

    public void displayEmployees(){
        displayEmployees = new MenuDisplayEmployees(this);
        this.getContentPane().removeAll();
        this.getContentPane().add(displayEmployees);
        this.revalidate();
        this.repaint();
    }
}
