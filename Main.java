public class LinearRegression{
    public static void main(String[] args){
        double[][] ice_cream = {
            {14.2, 215}, {16.4, 325},
            {11.9, 185}, {15.2, 332},
            {18.5, 406}, {22.1, 522},
            {19.4, 412}, {25.1, 614},
            {23.4, 544}, {18.1, 421},
            {22.6, 445}, {17.2, 408} };

        System.out.println(calcM(ice_cream));

        System.out.println(calcB(ice_cream, calcM(ice_cream)));
    }


    public static double calcM(double[][] xy_values){
        double[] xy = new double[12];
        double sum_xy = 0;

        double[] x = new double[12];
        double sum_x = 0;

        double[] y = new double[12];
        double sum_y = 0;

        double sum_x_squared = 0;

       

        for (int i=0; i<xy_values.length; i++){
       
            x[i] = xy_values[i][0];
            y[i] = xy_values[i][1];
         
        }

        for (double x_value:x){
            sum_x += x_value;
            sum_x_squared+= x_value*x_value;
        }

        for (double y_value:y){
            sum_y += y_value;
        }

        for (int j = 0; j<x.length; j++){

            xy[j] = x[j]*y[j];

        }

        for (double xy_value:xy){
            sum_xy+=xy_value;
        }

        double m = (12*sum_xy-sum_x*sum_y)/(12*sum_x_squared-sum_x*sum_x);


       

        return m;
    }

    public static double calcB(double[][] xy_values, double m){
        double[] xy = new double[12];
        double sum_xy = 0;

        double[] x = new double[12];
        double sum_x = 0;

        double[] y = new double[12];
        double sum_y = 0;

        double sum_x_squared = 0;

       

        for (int i=0; i<xy_values.length; i++){
       
            x[i] = xy_values[i][0];
            y[i] = xy_values[i][1];
         
        }

        for (double x_value:x){
            sum_x += x_value;
            sum_x_squared+= x_value*x_value;
        }

        for (double y_value:y){
            sum_y += y_value;
        }

        for (int j = 0; j<x.length; j++){

            xy[j] = x[j]*y[j];

        }

        for (double xy_value:xy){
            sum_xy+=xy_value;
        }

        double b = (sum_y-m*sum_x)/12;


       

        return b;
    }
}
