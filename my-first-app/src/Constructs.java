public class Constructs {

    int x;
    int y;

    public int add(){
        System.out.println(x + y);
        return x + y;
    }
    public static void main(String[] args) {

       
        Constructs c = new Constructs();
        c.x =32;
        c.y= 3;

        int result = c.add();
        System.out.println(result);
        System.out.println(c.x);

        int z = c.x * c.y;
        System.out.println(z);

        float f =34.34f;

        byte b = (byte)128;

        System.out.println(b);

        // for (; ; ){
        //     System.out.println("test");
        // }
    }
}
