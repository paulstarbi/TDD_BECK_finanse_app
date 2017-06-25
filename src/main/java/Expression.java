/**
 * Created by paul on 24.06.17.
 */
public interface Expression {
    Money reduce(Bank banj, String to);


    Expression plus(Expression tenFrancs);

    Expression times(int i);
}
