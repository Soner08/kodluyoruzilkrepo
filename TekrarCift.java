public class TekrarCift {

    static boolean isFind(int[] arr, int value){

            for(int i : arr){
                if(i == value){
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[] list = {4,5,6,7,4,8,5,8,9,10,11,12,34,36,37,12,16};

            int[] evenNumber = new int[list.length];

            int startIndex = 0;

            for(int i=0; i < list.length; i++){

                for(int j=0; j < list.length; j++){

                    if(i != j && list[i]==list[j] ){
                        if( !isFind(evenNumber , list[i] )){
                            evenNumber[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
            for(int value : evenNumber){
                if(value !=0 && value % 2 == 0 ){
                    System.out.print( value + " ," );
                }
            }
    }
}
