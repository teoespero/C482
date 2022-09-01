public class Loan {
    private double interestRate;
    private double monthsToPay;
    private double principal;
    private java.util.Date loanDate;

    static int loanCounter;

    public Loan(){
        this(10.0, 3.0, 5000.00);
        loanCounter++;
    }

    public Loan(double interestRate, double monthsToPay, double principal){
        this.interestRate = interestRate;
        this.monthsToPay = monthsToPay;
        this.principal = principal;
        loanCounter++;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getPrincipal(){
        return principal;
    }

    public double getMonthsToPay(){
        return monthsToPay;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public void setPrincipal(double principal){
        this.principal = principal;
    }

    public void setMonthsToPay(double monthsToPay){
        this.monthsToPay = monthsToPay;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = principal * (interestRate / 100);
        double monthlyPayment = ((monthlyInterestRate * monthsToPay) + principal) / monthsToPay;
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * monthsToPay;
        return totalPayment;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }

    public int getLoanCounter(){
        return loanCounter;
    }
}
