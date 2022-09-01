public class TestLoan {
    public static void main(String[] args){
        Loan esperoLoan = new Loan(10.00, 6.0, 30000);

        System.out.println("Espero Loan");
        System.out.println("Loan amount: " + esperoLoan.getPrincipal());
        System.out.println("Monthly Interest Rate: " + esperoLoan.getInterestRate());
        System.out.println("Monthly payment: " + esperoLoan.getMonthlyPayment());
        System.out.println("Months to pay: " + esperoLoan.getMonthsToPay());
        System.out.println("Total amount: " + esperoLoan.getTotalPayment());
        System.out.println("Borrowers: " + esperoLoan.getLoanCounter());
    }
}

