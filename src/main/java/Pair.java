/**
 * Created by paul on 24.06.17.
 */
public class Pair {
    private String from;
    private String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        Pair pair = (Pair) o;
        return from.equals(pair.from)&&to.equals(pair.to);
    }

    @Override
    public int hashCode() {
        return 0;
        //        int result = from != null ? from.hashCode() : 0;
//        result = 31 * result + (to != null ? to.hashCode() : 0);
//        return result;
    }
}
