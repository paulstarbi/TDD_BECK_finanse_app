
/**
 * Created by paul on 23.06.17.
 */
 class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    String getCurrency() {
        return this.currency;
    }



    public Expression times(int multiper){
        return new Money(amount * multiper, currency);
    }


    public Expression plus(Expression addend) {

        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to){
        int rate = bank.rate(currency, to);
        return new Money(amount/rate,to);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && getCurrency().equals(money.getCurrency());
    }

    @Override
    public String toString() {
        return "Money:" +amount+" " + currency;
    }
}


