interface Merhaba{
    public String soyle();
}
public class LambdaDenemesi{
    public static void main(String[] args) {
        Merhaba m=()->{
            return "Merhaba Dünya";
        };
        System.out.println(m.soyle());
    }
}