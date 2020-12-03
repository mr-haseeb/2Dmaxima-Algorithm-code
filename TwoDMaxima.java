

public class TwoDMaxima {

    public static void main(String [] args){

        // declare an Array
        // Points are collect from slides

        int[][] array = { { 7,13 },{4,11},{9,10},{7,7},{11,5},{13,3},{5,1},{4,4},{2,5},{12,12},{14,10},{15,7}};

        // Passsing value to function
        findMaxima(array.length,array);

    }

    public static void findMaxima(int n,int[][] Point){
       // code by haseeb shinwari CS120172069
        for (int i=0;i<n;i++){
            Boolean maxima=true;

            for (int j=0;j<n;j++){

                if((i != j) && (Point[i][0]<= Point[j][0]) && (Point[i][1] <= Point[j][1])){
                    maxima=false;
                    break;
                }
            }

            if(maxima==true){
                System.out.println("("+ Point[i][0]+ ","+Point[i][1]+")");
            }

        }


    }
}
