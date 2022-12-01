public class DizidekiOrtalama {
    public static void main(String[] args) {


        int numbers [] = {5,10,15,20,50};
        double sum=0;
        for(int i : numbers) {
            sum += (1.0 / i );
        }


        double harmonicAverage = numbers.length / sum;
        System.out.println("Dizideki Harmonik Ortalama = " + harmonicAverage);
    }
}

