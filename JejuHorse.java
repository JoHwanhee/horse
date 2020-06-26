public class JejuHorse implements HorseRunnable{
    private final int speed = 3;

    @Override
    public HorseScore run() {
        return new HorseScore((int)((Math.random()*10000)%speed));
    }
}
