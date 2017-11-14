import javax.swing.*;
import java.awt.*;

public class MenuAddEmployee extends JPanel {
    public JButton buttonBack = new JButton("Return");

    public JLabel nameLabel = new JLabel("Name : ");
    public JTextField nameInput = new JTextField();

    public JLabel lastnameLabel = new JLabel("Lastname : ");
    public JTextField lastnameInput = new JTextField();

    public JLabel ageLabel = new JLabel("Age : ");
    public JTextField ageInput = new JTextField();

    public JLabel hiredateLabel = new JLabel("Hiredate : ");
    public JTextField hiredateInput = new JTextField();

    public JLabel jobLabel = new JLabel("Job : ");
    public String[] tab = {"Representant", "Manutentionnaire", "Tecnicien", "Vendeux"};
    public JComboBox jobSelect;

    public JLabel salaryLabel = new JLabel("Salary");
    public JTextField salaryInput = new JTextField();

    public JButton buttonValidate  = new JButton("Validate");

    public MenuAddEmployee(Viewmanager viewmanager){
        viewmanager.setTitle("Employee Manager/Add");

        this.setLayout(new GridLayout(0,1));
        jobSelect = new JComboBox(tab);
        this.add(buttonBack);
        this.add(nameLabel);
        this.add(nameInput);
        this.add(lastnameLabel);
        this.add(lastnameInput);
        this.add(ageLabel);
        this.add(ageInput);
        this.add(hiredateLabel);
        this.add(hiredateInput);
        this.add(jobLabel);
        this.add(jobSelect);
        this.add(salaryLabel);
        this.add(salaryInput);
        this.add(buttonValidate);

        buttonBack.addActionListener(e -> viewmanager.displayMenu());
        buttonValidate.addActionListener(e -> createEmployee());
    }

    public void createEmployee(){
        System.out.println("createEmployee()");
        EmployeeManager employeeManager = new EmployeeManager();

        int ageParse = Integer.parseInt(ageInput.getText());
        int hiredateParse = Integer.valueOf(hiredateInput.getText());
        int salaryInputParse = Integer.parseInt(salaryInput.getText());
        Employee employee = new Employee(nameInput.getText(), lastnameInput.getText(), ageParse, hiredateParse, (String) jobSelect.getSelectedItem(), salaryInputParse);

        employeeManager.getInstance().addEmployeeToList(employee);
    }
}
