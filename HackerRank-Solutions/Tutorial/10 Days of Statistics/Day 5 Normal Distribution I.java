//this code is ai generated since the "tutorial" was impossibly bad to comprehend

public class NormalDistribution {
    public static double normalCDF(double z) {
        if (z < 0) {
            return 1 - normalCDF(-z);
        }
        double[] a = {0.0498673470, 0.0211410061, 0.0032776263, 
                0.0000380036, 0.0000488906, 0.0000053830};
        double t = 1.0 / (1.0 + 0.2316419 * z);
        double sum = 0.0;
        double term = t;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * term;
            term *= t;
        }
        double phi = 1.0 - (1.0 / Math.sqrt(2 * Math.PI)) * Math.exp(-0.5 * z * z) * sum;
        return phi;
    }

    public static double normalCDFAlternative(double z) {
        if (z < 0) return 1 - normalCDFAlternative(-z);
        double t = 1.0 / (1.0 + 0.2316419 * z);
        double d = 0.3989423 * Math.exp(-z * z / 2.0);
        double prob = d * t * (0.3193815 + t * (-0.3565638 + t * (1.7814779 + t * (-1.8212560 + t * 1.3302744))));
        return 1.0 - prob;
    }

    public static double normalProbability(double x, double mean, double stdDev) {
        double z = (x - mean) / stdDev;
        return normalCDFAlternative(z);
    }

    public static double probabilityBetween(double x1, double x2, double mean, double stdDev) {
        return normalProbability(x2, mean, stdDev) - normalProbability(x1, mean, stdDev);
    }

    public static void main(String[] args) {
        double mean = 20.0;
        double stdDev = 2.0;

        double prob1 = normalProbability(19.5, mean, stdDev);
        System.out.format("%.3f", prob1);

        System.out.println();
        double prob2 = probabilityBetween(20, 22, mean, stdDev);
        System.out.format("%.3f", prob2);
    }
}