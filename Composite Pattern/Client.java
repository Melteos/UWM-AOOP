public class Client {

    public static void main(String[] args) {

        City c1 = new City("Olsztyn", "NO");
        City c2 = new City("Krakow","KR");

        Town t1 = new Town("Sopot", "GSP");
        Town t2 = new Town("Kazimierz Dolny", "TKA");

        Country polskaCities = new Country();
        polskaCities.addPlace(c1);
        polskaCities.addPlace(c2);

        Country polskaTowns = new Country();
        polskaTowns.addPlace(t1);
        polskaTowns.addPlace(t2);

        Country polska = new Country();
        polska.addPlace(polskaCities);
        polska.addPlace(polskaTowns);

        polska.showPlaceDetails();
    }
}
