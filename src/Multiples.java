public class Multiples {
    public static void main(String[] args){
        //Alternative way: 1000 // 3 + 999 // 5 - 1000 // 15
        int i = 1;
        int ans = 0;
        while (i < 1000){
            if (i % 3 == 0 || i % 5 == 0){
                ans++;
            }
            i++;
        }
        System.out.println(ans);
    }
}
