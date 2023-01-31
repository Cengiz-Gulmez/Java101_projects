public class AsalSayi {
    public static void main(String[] args) {
        int kontrol = 0;



        for(int i = 1;i <= 100; i++)
        {
            for(int j =1; j <=i; j++)
            {
                if(i % j == 0)
                {
                    kontrol +=1;
                }
            }
            if(kontrol == 2)
            {
                System.out.print(i + " ");
            }

            kontrol = 0;

        }


    }


}












