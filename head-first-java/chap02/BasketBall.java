package chap02;

public class BasketBall extends Ball{
    public BasketBall() {
        size = 60;
    }    

    public void bounce() {
        System.out.println(size+"cm Basketball boucing!");
    }
}
