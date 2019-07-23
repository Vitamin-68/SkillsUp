package Lesson6.Interfaces;

public interface Seasons {
    Integer COUNT_OF_SEASON = 4;
    String WINTER = "Winter";
    String SPRING = "Spring";
    String SUMMER = "Summer";
    String AUTUMN = "Autumn";

    String getNameOfSeason(int number);

    /**
     * Return name of season
     *
     * @param numberOfMounth number of month
     * @return name of season
     */
    default String getNumberOfSeason(int numberOfMounth) {
        switch (numberOfMounth) {
            case 1:
            case 2:
            case 12: {
                return WINTER;
            }
            case 3:
            case 4:
            case 5: {
                return SPRING;

            }
            case 6:
            case 7:
            case 8: {
                return SUMMER;

            }
            case 9:
            case 10:
            case 11: {
                return AUTUMN;

            }
            default: {
                return "You enter wrong number of month";
            }
        }
    }

    int getNumber();

    static int getNumberOfSeason(String parameter) {
        switch (parameter) {
            case WINTER: {
                return 1;
            }
            case SPRING: {
                return 2;
            }
            case SUMMER: {
                return 3;
            }
            case AUTUMN: {
                return 4;
            }
        }
        System.out.println("You enter wrong number of month");
        return 0;
    }
}
