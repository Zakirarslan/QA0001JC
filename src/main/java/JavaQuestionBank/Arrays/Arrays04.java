package JavaQuestionBank.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        int[]a={-5,-3,-1,0,0,5,6,9,8,7,4,5,};
        int positive=0;
        int negative=0;
        int odd=0;
        int even=0;
        int zerro=0;
        for (int i=0;i<a.length;i++){
            if (a[i]<0){ negative++; }
            if (a[i]==0){ zerro++; }
            if (a[i]>0){ positive++; }
            if (a[i]%2==0){ even++; }
            if (a[i]%2!=0){ odd++; }


        }
        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
        System.out.println("zerro = " + zerro);
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

    }
}
