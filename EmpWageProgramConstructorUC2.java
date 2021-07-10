import com.company.EmpWageComputationProgramConstructorUC1;

public class EmpWageComputationProgramConstructorUC2 {

    private static int empRatePerHour;
    private static int empHrs;
    private static int empWage;
    int isFullTime = 1;
//    int empRatePerHour = 20;
//    int empHrs = 0;
//    int empWage = 0;

    public EmpWageComputationProgramConstructorUC2() {

    }
//constructor
    public EmpWageComputationProgramConstructorUC2(int a, int b, int c, int d){
        this.isFullTime = a;
        this.empRatePerHour = b;
        this.empHrs = c;
        this.empWage = d;
    }
void display(EmpWageComputationProgramConstructorUC2 object){
       this.empWage = object.empWage;
        this.empHrs = object.empHrs;
    System.out.println("Daily EmpWage:" + empWage);
}
    public static void main(String[] args) {

        EmpWageComputationProgramConstructorUC2 s1 = new EmpWageComputationProgramConstructorUC2(1,20,0,0);
        double empCheck = Math.floor(Math.random() * 10) % 2;
        double a = 0;
        if (empCheck == a )
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * empRatePerHour;
        s1.display(s1);
    }
}
