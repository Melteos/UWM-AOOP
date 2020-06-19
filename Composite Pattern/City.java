public class City implements Place {

    private String name;
    private String plateCode;

    public City(String name, String plateCode) {
        this.name=name;
        this.plateCode=plateCode;
    }

    @java.lang.Override
    public void showPlaceDetails() {
        System.out.println(plateCode + " city " + name);
    }
}
