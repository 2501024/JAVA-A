public class OutputHandler {

    protected void display(Employee[] employees){
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].toString());
        }
    }
}