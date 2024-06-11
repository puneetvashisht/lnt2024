public class ArraysDemo {
    public static void main(String[] args) {
        // int scores[] = {34,56,3,35,67,45};
        int scores[] = new int[2];
        scores[0] = 34;
        scores[1] =3;


        // System.out.println(scores[6]);

        // for(int i=0;i<=scores.length; i++){
        //     System.out.println(scores[i]);
        // }

        for(int score: scores){
            System.out.println(score);
        }
    }
}
