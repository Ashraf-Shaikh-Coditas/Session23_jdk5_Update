package Week5.Session23_jdk5Update;

enum Signal {

    GREEN("GO"), RED("STOP"),YELLOW("DRIVE VERY SLOW");

    String msg;

    Signal(String msg) {
        this.msg = msg;
    }

}
public class EnumDemo {
    public static void main(String[] args) {
        Signal array[] = Signal.values();

        for(Signal s : array) {
            System.out.println(s+" MEANS "+s.msg);
        }
    }
}

/*

GREEN MEANS GO
RED MEANS STOP
YELLOW MEANS DRIVE VERY SLOW

* */