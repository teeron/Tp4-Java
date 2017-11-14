import javax.swing.*;

public class MenuDisplayEmployees extends JPanel{

    public JButton buttonBack = new JButton("Return");
    String title[]={"name", "lastname", "age", "hiredate", "job"};
    String Data[][];
    JTable resultEmployees;
    EmployeeManager employeeManager;

    public MenuDisplayEmployees(Viewmanager viewmanager){
        viewmanager.setTitle("Employee Manager/Display");
        employeeManager = new EmployeeManager();

        //System.out.println(employeeManager.employees.size());

        //Là j'ai tenté de récupérer mon arrayList contenant les employées pour les afficher ici dans un JTab.

        this.add(buttonBack);

        buttonBack.addActionListener(e -> viewmanager.displayMenu());
    }
}
