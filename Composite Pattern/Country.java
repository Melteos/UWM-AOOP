import java.util.ArrayList;
import java.util.List;

public class Country implements Place {

    private List<Place> placeList = new ArrayList<Place>();


    @java.lang.Override
    public void showPlaceDetails() {
        for(Place p:placeList) {
            p.showPlaceDetails();
        }
    }
    public void addPlace(Place p)
    {
        placeList.add(p);
    }

    public void removePlace(Place p)
    {
        placeList.remove(p);
    }
}
