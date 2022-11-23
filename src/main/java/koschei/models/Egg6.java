package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private Needle7 n7;

    public Egg6(Needle7 n7) {
        this.n7 = n7;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + n7.toString();
    }
}
