public class Animal {
    int legs;
    String name;
    boolean hasTail;

    public Animal(int legs, String name, boolean hasTail) {
        this.legs = legs;
        this.name = name;
        this.hasTail = hasTail;
    }


    @Override
    public String toString() {
        return "Animal [legs=" + legs + ", name=" + name + ", hasTail=" + hasTail + "]";
    }


    public String speak(){
        System.out.println("speak...");
        return "trrrr...";
    }

    
    void walk(){
        System.out.println("walk...");
    }

    public static void main(String[] args) {
        Animal elephant = new Animal(4, "Elephant", true);
        System.out.println(elephant);
        elephant.walk();
    }
}
