public class Dog implements Domesticatable, Tradable {

    @Override
    public String sound() {
        return "Bark";
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String toString(){
        return "I am a Dog";
    }
}
