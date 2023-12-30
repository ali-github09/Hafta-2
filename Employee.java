public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double vergi;
    int bonus;
    double maasArtısı;
    double sonMaas;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tax();
        bonus();
        riseSalary();
        toplamMaas();
    }

    public double tax() {

        if (this.salary < 1000) {
            this.vergi = 0.00;
        } else {
            this.vergi = 0.03;
        }

        return this.vergi;
    }

    public int bonus(){
        if (this.workHours > 40 ){
            this.bonus = (this.workHours - 40) * 30;
        }
        return this.bonus;
    }

    public double riseSalary(){

        if ( (2021-this.hireYear) < 10 ){
            double maasArtısı = this.salary * 0.05;
        } else if ((2021-this.hireYear) >= 10 && (2021-this.hireYear) <= 20){
            double maasArtısı = this.salary * 0.1;
        } else if ((2021-this.hireYear) > 20) {
            this.maasArtısı = this.salary * 0.15;
        }
        return this.maasArtısı;
    }

    public double toplamMaas(){
        this.sonMaas = this.salary - (this.salary* tax()) + bonus() + riseSalary();
        return this.sonMaas;
    }

    public void toStringg(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + riseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (  this.salary - (this.salary * tax()) + bonus())  );
        System.out.println("Toplam Maaş : " + toplamMaas() );
    }
}
