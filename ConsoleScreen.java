public class ConsoleScreen implements IHorseScreen {
    @Override
    public void print(HorseBase horseBase) {
        System.out.print(horseBase.getHorseName() + " , " +horseBase.getHorseScore().getValue() + "\n");
    }
}
