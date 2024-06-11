class Num {
    int x;
    public Num(int x){
        this.x = x;
    }
    @Override
    public String toString() {
        return "Num [x=" + x + "]";
    }
    
}

public class PassByRef {
    
    public int changeValue(int newValue){
         newValue *= 2;
         return newValue;
    }
    public int changeValue(Num newValue){
        newValue.x =  newValue.x * 2;
        return newValue.x;
    }

    public static void main(String[] args) {
        PassByRef p = new PassByRef();
        // pass by value
        // int x = 5;
        // pass by ref
        Num x = new Num(5);
        int result = p.changeValue(x);

        System.out.println(x);
        System.out.println(result);
    }
}
