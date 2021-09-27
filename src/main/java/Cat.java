public class Cat implements Tradable, Domesticatable {

    @Override
    public int getPrice()
    {
        return 1000;
    }

    @Override
    /* This method returns a String*/
    public String sound()
    {
        return "Meow!";
    }
}
