public class Linear {
    public static double calcM(double[][] data) {
        int N = data.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (double[] point : data) {
            double x = point[0];
            double y = point[1];

            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }

        return (N * sumXY - sumX * sumY) / (N * sumX2 - sumX * sumX);
    }

    public static double calcB(double[][] data) {
        int N = data.length;
        double sumX = 0, sumY = 0;

        for (double[] point : data) {
            sumX += point[0];
            sumY += point[1];
        }

        double m = calcM(data);
        return (sumY - m * sumX) / N;
    }
}

public class Main {
    public static void main(String[] args) {
        // Ice cream sales data (temperature, sales)
        double[][] data = {
            {30, 200}, {35, 250}, {40, 270}, {45, 300}, {50, 330},
            {55, 360}, {60, 400}, {65, 430}, {70, 460}, {75, 490}
        };

        // Calculate slope (m) and y-intercept (b)
        double m = LinearRegression.calcM(data);
        double b = LinearRegression.calcB(data);

        // Display the equation of the regression line
        System.out.println("Linear Regression Equation: y = " + m + "x + " + b);
    }
}
