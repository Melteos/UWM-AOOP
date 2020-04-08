final class Day {
    private final String month;
    private final int  day;
    private final double avgTemp;
    private final String season;
    private final double windSpeed;
    private final boolean isNiceDay;
    private final String location;

    public Day(Builder builder) {
        this.month = builder.month;
        this.day = builder.day;
        this.avgTemp = builder.avgTemp;
        this.season = builder.season;
        this.windSpeed = builder.windSpeed;
        this.isNiceDay = builder.isNiceDay;
        this.location = builder.location;
    }

    public static class Builder {
        private String month;
        private int  day;
        private double avgTemp;
        private String season;
        private double windSpeed;
        private boolean isNiceDay;
        private String location;

        public static Day.Builder newInstance()
        {
            return new Day.Builder();
        }

        private Builder() {}

        public Day.Builder setMonth(String month)
        {
            this.month = month;
            return this;
        }
        public Day.Builder setDay(int day)
        {
            this.day = day;
            return this;
        }
        public Day.Builder setAvgTemp(double avgTemp)
        {
            this.avgTemp = avgTemp;
            return this;
        }
        public Day.Builder setSeason(String season)
        {
            this.season = season;
            return this;
        }
        public Day.Builder setWindSpeed(double windSpeed)
        {
            this.windSpeed = windSpeed;
            return this;
        }
        public Day.Builder setIsNiceDay(boolean isNiceDay)
        {
            this.isNiceDay = isNiceDay;
            return this;
        }
        public Day.Builder setLocation(String location)
        {
            this.location = location;
            return this;
        }

        public Day build()
        {
            return new Day(this);
        }
    }
    public String toString()
    {
        String output =  "It's " + this.day + " of " + this.month + " of season " + this.season + " in " + this.location
                + ", wind speed is " + this.windSpeed + ", and it is ";
        if(this.isNiceDay) {
            output += "a nice day";
        }
        else {
            output += "a bad day";
        }
        return output;
    }
}