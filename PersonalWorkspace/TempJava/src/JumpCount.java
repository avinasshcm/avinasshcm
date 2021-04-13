public class JumpCount {

    public static void main(String[] args) {
        System.out.println(jumpCount(10, 2, 1));
        System.out.println(jumpCount(10, 3, 1));
        System.out.println(jumpCount(10, 10, 1));
    }

    public static int jumpCount(int height, int plus, int minus) {
        int jumps = 0;
        int curr_Height = 0;
        do {
            curr_Height = curr_Height + plus - minus;
            jumps++;
        } while (curr_Height < height);
        return jumps;
    }
}
