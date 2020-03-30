public class Runner {

    public static void main(String args[]) {

        Dog doggy = new Dog.Builder()
                .setName("Alfie")
                .setBreed("Golden Retriever")
                .setAge(2)
                .setAdopted(true)
                .setFertile(false)
                .setLocation("Turkey")
                .setHeight(60)
                .setWeight(45)
                .build();

        System.out.println(doggy);
    }
}
