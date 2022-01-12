package CodeWars;

public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        // your code
        if (h < 0 || bounce <= 0 || bounce >= 1 || window > h) return -1;
        int count = 0;
        while (h > window){
            h *= bounce;
            count += 2;
        }
        return count-1;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(3,0.66,1.5));
        System.out.println(bouncingBall(30.0,0.66,1.5));
    }
}
