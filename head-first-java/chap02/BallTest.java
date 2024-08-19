package chap02;

public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new SoccerBall();
        Ball ball3 = new BasketBall();

        int x = 10;

        while (x > 0) {
            Ball aBall = null;

            if ((x%2)==0){
                aBall = ball2;
            } else {
                aBall = ball3;
            }
            aBall.bounce();
            x = x - 1;

        }
    }
}
