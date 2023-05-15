public class Main {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.err.println(numeros[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}