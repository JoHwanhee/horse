public class HorseFactory {
    public static HorseBase create(HorseType type){
        HorseBase.HorseBuilder builder = new HorseBase.HorseBuilder();
        switch (type) {
            case My:
                builder.setHorseName("My Horse")
                       .setRun(new MyHorse());
                break;
            case Jeju:
                builder.setHorseName("Jeju Horse")
                       .setRun(new JejuHorse());
                break;
            case Black:
                builder.setHorseName("Black horse")
                       .setRun(new BlackHorse());
                break;
        }

        return builder.build();
    }
}

