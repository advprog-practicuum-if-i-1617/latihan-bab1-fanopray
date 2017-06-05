package pacman;

import java.util.Scanner;

public class Pacman {
    
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        Scanner in = new Scanner(System.in);
        int life =10;
        String direct;
        control pacman1 = new control();
        for(int i=1;i<=10;i++){
            pacman1.tampil();
            System.out.println("step   : "+life--);
            System.out.print("Masukkan arah (w,a,s,d)  : ");
            direct = in.nextLine();
            switch (direct) {
                case "w":pacman1.up();
                break;
                case "a":pacman1.left();
                break;
                case "s":pacman1.down();
                break;
                case "d":pacman1.right();
                break;
                default:System.out.println("perintah anda salah. step berkurang");
            }
            if(life==0){
                System.out.println("Game over, kamu kalah");
           
        }
    }
    }
}