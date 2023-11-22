public class maxmin {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=20;
        a[1] = 30;
        a[2] = 40;
        a[3] = 50;
        a[4] = 60;
        int max = a[0];
        int min = a[0];
        for(int s=0; s<5; s++){
            if(a[s]>max){
                max = a[s];
            }
            if(a[s]<min){
                min = a[s];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
