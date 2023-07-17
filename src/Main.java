import java.util.Scanner;

 class BaseToDecimal {
     public int findDecimal(int num,int base){
         int res=0,i=0;
         while(num>0){
             res+=(num%10)*(Math.pow(base,i));
             num/=10;
             i++;
         }
         return res;
     }


    public static void main(String[] args) {
         BaseToDecimal baseToDecimal=new BaseToDecimal();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int base = scanner.nextInt();
        System.out.println("Decimal: "+baseToDecimal.findDecimal(num,base));
    }
}