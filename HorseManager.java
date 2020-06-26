import java.util.ArrayList;
import java.util.List;

public class HorseManager {
    private IHorseScreen horseScreen;
    private HorseList horseList = new HorseList();
    private final int count = 10;

    public void setHorseScreen(IHorseScreen horseScreen) {
        this.horseScreen = horseScreen;
    }
    public void addHorse(HorseBase horseBase){
        horseList.add(horseBase);
    }

    public void playGame(){
        runHorses();
        printHorses();
    }

    private void runHorses(){
        for(int i = 0; i < count; i++){
            for (HorseBase horse : horseList.getHorses()) {
                horse.run();
            }
        }
    }

    private void printHorses(){
        if (horseScreen == null){
            horseScreen = new ConsoleScreen();
        }

        for (HorseBase horse : horseList.getHorses()) {
            horseScreen.print(horse);
        }
    }
}

class HorseList {
    private final List<HorseBase> horses = new ArrayList<>();

    public List<HorseBase> getHorses() {
        return horses;
    }

    public void add(HorseBase horseBase){
        horses.add(horseBase);
    }
}