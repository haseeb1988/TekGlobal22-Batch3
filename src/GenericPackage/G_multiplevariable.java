package GenericPackage;


// key and value are just name of the variable
public class G_multiplevariable <myKey ,myValue>{
    private  myKey v1;
    private myValue v2;

    public G_multiplevariable(myKey v1, myValue v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public G_multiplevariable()
    {

    }

    public myKey getV1() {
        return v1;
    }

    public void setV1(myKey v1) {
        this.v1 = v1;
    }

    public myValue getV2() {
        return v2;
    }

    public void setV2(myValue v2) {
        this.v2 = v2;
    }
    public void printBothVariable()
    {
        System.out.println("Value of v1: " + this.v1);
        System.out.println("Value of  v2: " + this.v2);
    }
}
