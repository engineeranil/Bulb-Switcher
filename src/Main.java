public class Main {
    public static void main(String[] args) {
        int n = 25;
        int count = 0;
        int increment = 0;
        while(n>0){
            for(int i =1; i<=n; i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count%2==1){
                increment++;
                count=0;
            }
            n--;
        }
        if(increment==0){
            System.out.println(increment);
        }
        if(increment!=0){
            System.out.println(increment);
        }
    }
}
