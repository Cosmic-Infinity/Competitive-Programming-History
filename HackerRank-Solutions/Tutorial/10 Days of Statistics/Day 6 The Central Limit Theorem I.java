//this code is again ai generated because the tutorial was impossibly bad

public class ElevatorProblem {
    
    public static double normalCDF(double z) {
        if (z < 0) return 1 - normalCDF(-z);
        
        double t = 1.0 / (1.0 + 0.2316419 * z);
        double d = 0.3989423 * Math.exp(-z * z / 2.0);
        double prob = d * t * (0.3193815 + t * (-0.3565638 + t * (1.7814779 + t * (-1.8212560 + t * 1.3302744))));
        return 1.0 - prob;
    }
    
    public static void main(String[] args) {
        // Individual box parameters
        double boxMean = 205.0;
        double boxStdDev = 15.0;
        int numBoxes = 49;
        // Sum parameters using Central Limit Theorem
        double sumMean = numBoxes * boxMean;
        double sumStdDev = Math.sqrt(numBoxes) * boxStdDev;
        // Calculate P(Total weight 9800)
        double z = (9800 - sumMean) / sumStdDev;
        double probability = normalCDF(z);
        // Print with exactly 4 decimal places as requested
        System.out.printf("%.4f%n", probability);
    }
}