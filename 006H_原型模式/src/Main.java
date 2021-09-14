public class Main {
    public static void main(String[]argv){
        Profile profile1=new Profile("gaowanlu","man");
        profile1.setWork("2021","github");
        Profile profile2=(Profile)profile1.clone();
        profile2.setName("xiaoming");
        profile2.setWork("2022","slagoteam");
        profile1.display();
        profile2.display();
    }
}
