public class sumofarray {

    public static void main(String[] args) {
        int a[] = new int[5]; int sum = 0;
        a[0] = 10;
        a[1]=20;
        a[2]=30;
        a[3]=50;
        a[4]=50;
        
        for(int s = 0; s<5; s++){
            sum = sum + a[s];
        }
        System.out.println(sum);
    }
}