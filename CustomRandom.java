package ict._22.RandomGenerator;

public class CustomRandom {

    private static long seed = System.currentTimeMillis(); 
     

    private static final long A = 6364136223846793005L;
    private static final long C = 1442695040888963407L;
    private static final long M = (1L << 48);


    private static double next() {
        seed = (A * seed + C) % M;
        return (double) seed / M;
    }

  

  
    public static int nextInt(int n) {
        return (int) (next() * n);
    }

  
    public static int nextInt(int min, int max) {
        return min + (int) (next() * (max - min + 1));
    }
    public static double nextDouble() {
        return next();
    }

  
    public static double nextDouble(double min, double max) {
        return min + (next() * (max - min));
    }

    
    public static float nextFloat() {
        return (float) next();
    }

    public static float nextFloat(float min, float max) {
        return min + (float) next() * (max - min);
    }


    public static Number nextMixed() {
        if (next() < 0.5)
            return nextInt(100); // integer from 0–99
        else
            return nextDouble(0, 100); // double from 0–100
    }

    
    public static void setSeed(long s) {
        seed = s;
    }

  
    public static void main(String[] args) {

        System.out.println("=== Custom Random Number Generator ===");

    
        CustomRandom.setSeed(12345);

      
        System.out.println("\nRandom Integers:");
        for (int i = 0; i < 5; i++)
            System.out.println(CustomRandom.nextInt(1, 50));

      
        System.out.println("\nRandom Doubles:");
        for (int i = 0; i < 5; i++)
            System.out.println(CustomRandom.nextDouble(0.0, 1.0));

  
        System.out.println("\nRandom Floats:");
        for (int i = 0; i < 5; i++)
            System.out.println(CustomRandom.nextFloat(10f, 20f));

        System.out.println("\nMixed Random Values:");
        for (int i = 0; i < 5; i++)
            System.out.println(CustomRandom.nextMixed());
    }
}
