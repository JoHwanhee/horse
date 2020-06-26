public class BlackHorse implements HorseRunnable{
    private final int speed = 2;

    @Override
    public HorseScore run() {
        return new HorseScore((int)((Math.random()*10000)%speed));
    }
}
