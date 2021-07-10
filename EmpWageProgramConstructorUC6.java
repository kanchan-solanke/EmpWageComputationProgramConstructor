public class EmpWageComputationProgramConstructorUC6 {
    public static int isPartTime;
    public static int isFullTime;
    public static int empRatePerHr;
    public static int numWorkingDays;
    public static int Max_hrs_in_month;

    public EmpWageComputationProgramConstructorUC6() {

    }

    public EmpWageComputationProgramConstructorUC6(int a, int b, int c, int d, int e) {
        this.isPartTime = a;
        this.isFullTime = b;
        this.empRatePerHr = c;
        this.numWorkingDays = d;
        this.Max_hrs_in_month = e;
    }

    void display(EmpWageComputationProgramConstructorUC6 object) {

        this.empRatePerHr = object.empRatePerHr;
        this.numWorkingDays = object.numWorkingDays;
        this.Max_hrs_in_month = object.Max_hrs_in_month;
    }

    public static void main(String[] args) {
        EmpWageComputationProgramConstructorUC6 s1 = new EmpWageComputationProgramConstructorUC6(1, 2, 20, 2, 10);

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= Max_hrs_in_month && totalWorkingDays < numWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day:" + totalWorkingDays + "Emp Hr:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total emp wage:" + totalEmpWage);
    }
}
