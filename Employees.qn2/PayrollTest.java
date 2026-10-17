public class PayrollTest {
    public static void main(String[] args) {
        Payable[] employees = new Payable[2];

        employees[0] = new SalariedEmployee("S001", "Alice", 5000.0);
        employees[1] = new HourlyEmployee("H001", "Bob", 10, 300.0);

        double totalPayroll = 0.0;

        for (Payable p : employees) {
            double payment = p.getPaymentAmount();
            System.out.println(payment);
            totalPayroll += payment;
        }

        System.out.println("Total payroll: " + totalPayroll);
    }
}