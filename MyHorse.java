public class MyHorse implements HorseRunnable{
    private final int speed = 5;

    @Override
    public HorseScore run() {
        return new HorseScore((int)((Math.random()*10000)%speed));
    }
}
