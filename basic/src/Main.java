public class Main {

    public static void main(String[] args) {

        int input = 144;
        int[] arr = {0, 1};

        int sum = 0;
        int fibo = 0;//피보나치 수

        int count = 1;

        while ( fibo <= input) {
            fibo = arr[0] + arr[1];
            if(fibo % 2 == 0){
                sum += fibo;
            }
            if(count % 2 == 1) {
                arr[0] = fibo;
            }else{
                arr[1] = fibo;
            }
            count++;
        }

        System.out.println(sum);
    }
}