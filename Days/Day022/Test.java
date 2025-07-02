package Day022;

public class Test {
    
    public static void main(String[] args) {
        
        // String imutability
        String s = "Anuradha";
        s.concat("Fernando");
        System.out.println(s);
        // output = Anuradha

        String name = "Kasun";
        name = name.concat("Vijerathne");
        System.out.println(name);
        // output = Kasun vijerathne
        


    }
}
