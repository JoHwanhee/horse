public class HorseScore {
    private int value;

    HorseScore(int value){
        this.value =value;
    }

    public int getValue() {
        return value;
    }

    public void addScore(HorseScore score) {
        this.value += score.getValue();
    }
}
