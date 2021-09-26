package Ques5;

class Emp implements Cloneable{
    private int id;
    private String name;

    public Emp(){}

    public Emp(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Emp(Emp emp){
        this.id = emp.id;
        this.name = emp.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

}

public class ObjectClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Emp emp1 = new Emp(1,"vaishali");
        System.out.println("emp1 obj= " + emp1);

        Emp emp2 = (Emp)emp1.clone();
        System.out.println("After Copying From emp1: " + emp2);

        emp2.setName("Nidhi");

        System.out.println("After Modification emp2: " + emp2);
        System.out.println("After Modification emp1: " + emp1);
    }
}
