//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printEvery3() {
        int i = 1;
        while (i<=88) {
            System.out.println(i);
            i+=3;
        }
    }
    public static void ninetable(){
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <= 9; j++) {
                int m = i*j;
                System.out.println(i+" x "+j+" = "+ m);
            }
        }
    }
    public static int findMax(int[] arr){
        int i = 1;
        int max = arr[0];
        while (i < arr.length) {
            if(max<arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
//        printEvery3();
//        ninetable();
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        System.out.println(findMax(array));
    }
}