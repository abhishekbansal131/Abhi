package Live;

import music.Playable;
import music.string.Veena;
import music.wind.SaxoPhone;

public class Test {
    public static void main(String[] args) {
        Veena obj1 = new Veena();
        obj1.play();
        SaxoPhone obj2 = new SaxoPhone();
        obj2.play();
        Playable p = new Veena();
        p.play();
        Playable q = new SaxoPhone();
        q.play();
    }


}
