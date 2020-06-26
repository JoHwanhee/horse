
public class Main {
    public static void main(String[] args) {
        HorseManager horseManager = new HorseManager();
        horseManager.setHorseScreen(new ConsoleScreen());

        horseManager.addHorse(HorseFactory.create(HorseType.Jeju));
        horseManager.addHorse(HorseFactory.create(HorseType.My));
        horseManager.addHorse(HorseFactory.create(HorseType.Black));
        horseManager.playGame();
    }
}
