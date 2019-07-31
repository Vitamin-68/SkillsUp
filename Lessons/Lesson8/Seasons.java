package Lesson8;

public enum Seasons { //public static final obektu
    WINTER("December","January","February","w"),
    SPRING("March","April","May","sp"),
    SUMMER("June","July","August","su"),
    AUTUMN("September","October","November","a");

    private String monthFirst;
    private String monthSecond;
    private String monthThird;
    private String nameShort;

//    konstantu polya metodu

    private Seasons(String monthFirst, String monthSecond, String monthThird, String nameShort) {
        this.monthFirst = monthFirst;
        this.monthSecond = monthSecond;
        this.monthThird = monthThird;
        this.nameShort = nameShort;
    }

    public String getMonthFirst() {
        return monthFirst;
    }

    public String getMonthSecond() {
        return monthSecond;
    }

    public String getMonthThird() {
        return monthThird;
    }

    public String getNameShort() {
        return nameShort;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "monthFirst='" + monthFirst + '\'' +
                ", monthSecond='" + monthSecond + '\'' +
                ", monthThird='" + monthThird + '\'' +
                ", nameShort='" + nameShort + '\'' +
                '}';
    }
}
