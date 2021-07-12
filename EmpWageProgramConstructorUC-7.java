public class EmpWageComputationProblemConstructorUC7 {

    public static final int isPartTime=0;
    public static final int isFullTime=1;
    public static int empRatePerHr;
    public static int numWorkingDays;
    public static int Max_hrs_in_month;



    public EmpWageComputationProblemConstructorUC7(int a, int b, int c, int d, int e, int isPartTime) {

        this.empRatePerHr = c;
        this.numWorkingDays = d;
        this.Max_hrs_in_month = e;


    }

    void display(EmpWageComputationProblemConstructorUC7 object) {

        this.empRatePerHr = object.empRatePerHr;
        String totalEmpWage = null;
        System.out.println("Total emp wage:" + totalEmpWage);

    }


    public static void main(String[] args) {
        EmpWageComputationProblemConstructorUC7 s1 = new EmpWageComputationProblemConstructorUC7(1, 2, 20, 2, 10, isPartTime);
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
    }
}

