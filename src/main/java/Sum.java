/**
 * Created by paul on 24.06.17.
 */
class Sum implements Expression{
    Expression augend;
    Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.addend=addend;
        this.augend=augend;
    }

    public Money reduce(Bank bank, String to) {
        int amount =augend.reduce(bank, to).amount+addend.reduce(bank,to).amount;
        return new Money(amount, to);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Expression times(int multiper) {
        return new Sum(augend.times(multiper), addend.times(multiper));
    }
}
