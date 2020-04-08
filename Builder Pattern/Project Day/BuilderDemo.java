public class BuilderDemo {
    public static void main(String args[])
    {
        Day day = Day.Builder.newInstance()
                .setDay(1)
                .setMonth("February")
                .setSeason("Winter")
                .setAvgTemp(8.2)
                .setWindSpeed(22.6)
                .setLocation("Warsaw")
                .setIsNiceDay(false)
                .build();
        System.out.println(day);

        Day goodDay = Day.Builder.newInstance()
                .setDay(8)
                .setMonth("April")
                .setSeason("Spring")
                .setAvgTemp(20.4)
                .setWindSpeed(11.1)
                .setLocation("Olsztyn")
                .setIsNiceDay(true)
                .build();

        System.out.println(goodDay);

    }
}
