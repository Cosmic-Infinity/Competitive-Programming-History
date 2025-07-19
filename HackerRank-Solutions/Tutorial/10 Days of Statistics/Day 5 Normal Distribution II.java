//this code is ai generated since the "tutorial" was impossibly bad to comprehend

public class PhysicsExamGrades {
    
    // Zelen & Severo approximation for normal CDF
    public static double normalCDF(double z) {
        if (z < 0) return 1 - normalCDF(-z);
        
        double t = 1.0 / (1.0 + 0.2316419 * z);
        double d = 0.3989423 * Math.exp(-z * z / 2.0);
        double prob = d * t * (0.3193815 + t * (-0.3565638 + t * (1.7814779 + t * (-1.8212560 + t * 1.3302744))));
        return 1.0 - prob;
    }
    
    public static double normalProbability(double x, double mean, double stdDev) {
        double z = (x - mean) / stdDev;
        return normalCDF(z);
    }
    
    public static void main(String[] args) {
        double mean = 70.0;
        double stdDev = 10.0;
        
        // Question 1: P(grade > 80)
        double prob1 = 1 - normalProbability(80, mean, stdDev);
        double percentage1 = prob1 * 100;
        System.out.printf("%.2f%n", percentage1);
        
        // Question 2: P(grade >= 60) 
        double prob2 = 1 - normalProbability(60, mean, stdDev);
        double percentage2 = prob2 * 100;
        System.out.printf("%.2f%n", percentage2);
        
        // Question 3: P(grade < 60)
        double prob3 = normalProbability(60, mean, stdDev);
        double percentage3 = prob3 * 100;
        System.out.printf("%.2f%n", percentage3);
    }
}