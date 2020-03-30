public class Dog {
    private String name;
    private String breed;
    private int age;
    private boolean adopted;
    private boolean fertile;
    private String gender;
    private String location;
    private double height;
    private double weight;

    public Dog(String name,
               String breed,
               int age,
               boolean adopted,
               boolean fertile,
               String gender,
               String location,
               double height,
               double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.adopted = adopted;
        this.fertile = fertile;
        this.gender = gender;
        this.location = location;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + name + ", Breed: " + breed + ", Age: " + age + ", Adopted: " + adopted + ", Fertile: " +
                fertile + ", Gender: " + gender + ", Location: " + location + ", Height: " + height + ", Weight: " + weight;
    }

    public static class Builder {
        private String name;
        private String breed;
        private int age;
        private boolean adopted;
        private boolean fertile;
        private String gender;
        private String location;
        private double height;
        private double weight;

        public Builder() {};

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setBreed(String breed){
            this.breed = breed;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        public Builder setAdopted(boolean adopted){
            this.adopted = adopted;
            return this;
        }
        public Builder setFertile(boolean fertile){
            this.fertile = fertile;
            return this;
        }
        public Builder setGender(String gender){
            this.gender = gender;
            return this;
        }
        public Builder setLocation(String location){
            this.location = location;
            return this;
        }
        public Builder setHeight(double height){
            this.height = height;
            return this;
        }
        public Builder setWeight(double weight){
            this.weight = weight;
            return this;
        }

        public Dog build() {
            return new Dog(name, breed, age, adopted, fertile, gender, location, height, weight);
        }
    }
}
