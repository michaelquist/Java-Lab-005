/**
 * @author Trevor Hartman
 * @author Mike Quist
 * @date 02/23/2023
 */

import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public void play() {
        Player current = this.p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        System.out.println(announceWinner());
    }

    public Player nextPlayer(Player current) {
        if (current == p1) {
            return p2;
        } else {
            return p1;
        }
            }

            public void takeTurn (Player player){
                player.toss(this.die);
            }

            public String announceWinner () {
                System.out.println("Player 1's score is: " + p1.getScore());
                System.out.println("Player 2's score is: " + p2.getScore());
                if (p1.getScore() == p2.getScore()) {
                    return "We have a tie game!";
                } else if (p1.getScore() > p2.getScore()) {
                    return "Player 1 is the winner!";
                } else {
                    return "Player 2 is the winner!";
                }
            }
                public static void main (String[]args) {
                    Scanner s = new Scanner(System.in);
                    Game g = new Game();
                    g.p1 = new Player("Player 1");
                    g.p2 = new Player("Player 2");
                    g.die = new Dice(6);
                    g.play();
                }
            }
