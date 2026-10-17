abstract class Account {
    private double balance;

    public double interest() {
        return balance * 0.05;
    }

    public abstract void close();
}

class FixedDeposit extends Account {
    @Override
    public double interest() {
        return 0.0;
    }

    @Override
    public void close() {
        System.out.println("Fixed deposit account closed");
    }
}