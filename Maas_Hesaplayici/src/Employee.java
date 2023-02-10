public class Employee {
    int salary;
    int workHours;
    int hireYear;
    String name;

    public Employee (String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;


    }



    public double tax(){
        if (this.salary<1000)
            return 0;
        else
            return this.salary*0.03;

    }

    public int bonus(){
        if (this.workHours>=40){

            return (this.workHours-40)*30;
        }else
            return 0;


    }
    public  double raiseSalary(){
        if (2021-this.hireYear<10)
            return salary*0.05;
        else if (2021-this.hireYear>=10 && 2021-this.hireYear<20)
            return this.salary * 0.1;
        else
            return this.salary*0.2;

    }
    public void yazdır(){
        System.out.println("Adı " + this.name);
        System.out.println("Maaşı "+ this.salary);
        System.out.println("Çalışma saati "+ this.workHours);
        System.out.println("Başlangıç Yılı "+ this.hireYear);
        System.out.println("Vergi "+ tax());
        System.out.println("Bonus "+ bonus());
        System.out.println("Maaş artışı " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş "+ (this.salary+bonus()-tax()));
        System.out.println("Toplam maaş "+ (this.salary+raiseSalary()));


    }

}
