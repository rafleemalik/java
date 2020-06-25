public class Puppy {
    public Puppy(final String name) {
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name);
    }
    public static void main(final String[] args) {
        // Following statement would create an object myPuppy
        final Puppy myPuppy = new Puppy("tommy page macbook");
    }
}