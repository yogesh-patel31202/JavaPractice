public class DiffDubleEqualandEqualsMathod {
    public static void main(String[] args) {
        String name1 = "Rahul";
        String name2 = "Rahul";

        String name3 = new String("Rahul");
        String name4 = new String("Rahul");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));

        System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));



    }
    
}
