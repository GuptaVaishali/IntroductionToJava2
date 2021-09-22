package Ques5;

class Employee{
    int id;
    String name;

    Employee(){}

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    Employee(Employee emp){
        this.id = emp.id;
        this.name = emp.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"vaishali");
        System.out.println(emp1);

        Employee emp2 = new Employee(emp1);
        System.out.println("After Copying: " + emp2);

        emp2.setName("Nidhi");

        System.out.println("After Modification in emp2: " + emp2);
        System.out.println("After Modification in emp1: " + emp1);
    }
}
