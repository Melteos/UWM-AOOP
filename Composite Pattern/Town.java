public class Town implements Place {

    private String name;
    private String plateCode;

    public Town(String name, String plateCode){
        this.name=name;
        this.plateCode=plateCode;
    }

    @java.lang.Override
    public void showPlaceDetails() {
        System.out.println(this.plateCode + " town " + this.name);
    }
}
