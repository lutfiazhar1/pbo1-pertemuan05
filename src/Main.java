public class Main {

    public static void main(String[] args) {
        mobilelegend player1 = new mobilelegend();
        mobilelegend player2 = new mobilelegend();

        player1.name = "bambang";
        player1.gold = 20;
        player1.dead = 30 ;
        player1.kill = 75;
        player1.assist=0;

        player1.Move();

        System.out.println(player1.assist);
        player1.killjungle(player2);
        System.out.println(player1.gold);
        player1.deadd(player2);
        System.out.println(player1.dead);

    }
}
