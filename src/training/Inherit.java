package training;

public class Inherit {
    class Employee{
        double salary=50000;
         void display(){
            System.out.println("inside display"+salary);
        }

    }
     class Fulltimeemp extends Employee{
        double hike=0.50;
        void incsal(){
            salary=salary+0.50;
        }
    }
     class Imternemp extends Employee {
        double hike = 0.25;

        void incsal() {
            salary = salary + (salary * hike);
        }
    }
    public void main(String[] args) {
     Fulltimeemp e1=new Fulltimeemp();
     Imternemp e2=new Imternemp();
        System.out.println("sal before inc");
        e1.display();
        System.out.println("salary of an intern after inc");
        e2.display();
    }
}
//hierarchical inheritance one parent having more than one child