public class PrimoPiatto extends Portata {
    boolean isIntegral;
    public PrimoPiatto(String name, double price, boolean isIntegral) {
        super(name, price);
        this.isIntegral=isIntegral;
    }
}