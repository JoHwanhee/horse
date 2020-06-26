public class HorseBase {
    private HorseRunnable run;
    private HorseScore horseScore;
    private String horseName;

    HorseBase() { }
    private HorseBase(HorseBuilder builder){
        run = builder.run;
        horseScore = builder.horseScore;
        horseName = builder.horseName;
    }

    protected void run(){
        if(run != null)
            horseScore.addScore(run.run());
    }

    public void setRun(HorseRunnable run) {
        this.run = run;
    }

    public HorseScore getHorseScore() {
        return horseScore;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    static class HorseBuilder{
        private HorseRunnable run;
        private HorseScore horseScore = new HorseScore(0);
        private String horseName;

        public HorseBuilder setRun(HorseRunnable run) {
            this.run = run;
            return this;
        }

        public HorseBuilder setHorseScore(HorseScore horseScore) {
            this.horseScore = horseScore;
            return this;
        }

        public HorseBuilder setHorseName(String horseName) {
            this.horseName = horseName;
            return this;
        }

        public HorseBase build() {
            return new HorseBase(this);
        }
    }
}


