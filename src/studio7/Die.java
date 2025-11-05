public class Die {

    private int n;

    public Die(int initn) {
        n = initn;
    }

    public int Roll(){
        return (int)(n * Math.random() + 1);
    }

    public static void main(String[] args){

        Die d1 = new Die(6);
        System.out.println(d1.Roll());

    }
}
