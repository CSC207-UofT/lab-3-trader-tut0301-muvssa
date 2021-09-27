public class Cat implements Tradable, Domesticatable {

    @Override
    public int getPrice()
    {
        return 1000;
    }

    @Override
    /*
    This method returns an int
     */
    public String sound()
    {
        return "BARK BOWOWOWOWOW!";
    }
}
