public class HarmonicAverage {

    public static void main(String[] args) {
        int[] list={12,4,15,8,14};
                double averege=0.0,total=0.0;

        for (int a:list){

            total +=1.0/a;

            }
        averege=list.length/total;
        System.out.println(averege);
        }
    }

