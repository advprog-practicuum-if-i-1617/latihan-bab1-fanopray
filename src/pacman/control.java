package pacman;

public class control {

    int x = 10, y = 10,p = 4, q = 4, a = 0, b = 0, c = 0;
    String[][] array = new String[x][y];

    public void right() {
        this.q = q + 1;
        if (p == 0||p == 9||q == 0||q == 9||p==1&&(q==3)||p==2&&(q==3||q==5||q==6||q==7||q==8)||p==4&&(q==1||q==2||q==3)||p==6&&(q==6)||p==7&&(q==4||q==5||q==6)||p==8&&(q==6)){
            q = q - 1;
        }
    }
    public void left() {
        q = q - 1;
        if (p == 0||p == 9||q == 0||q == 9||p==1&&(q==3)||p==2&&(q==3||q==5||q==6||q==7||q==8)||p==4&&(q==1||q==2||q==3)||p==6&&(q==6)||p==7&&(q==4||q==5||q==6)||p==8&&(q==6)){
            q = q + 1;
        }
    }
     public void down() {
        this.p = p + 1;
        if (p == 0||p == 9||q == 0||q == 9||p==1&&(q==3)||p==2&&(q==3||q==5||q==6||q==7||q==8)||p==4&&(q==1||q==2||q==3)||p==6&&(q==6)||p==7&&(q==4||q==5||q==6)||p==8&&(q==6)){
            p = p - 1;
        }
    }
    public void up() {
        this.p = p - 1;
        if (p == 0||p == 9||q == 0||q == 9||p==1&&(q==3)||p==2&&(q==3||q==5||q==6||q==7||q==8)||p==4&&(q==1||q==2||q==3)||p==6&&(q==6)||p==7&&(q==4||q==5||q==6)||p==8&&(q==6)){
            p = p + 1;
        }
    }
   
    public void tampil() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if(i == 0||i == 9||j == 0||j == 9||i==1&&(j==3)||i==2&&(j==3||j==5||j==6||j==7||j==8)||i==4&&(j==1||j==2||j==3)||i==6&&(j==6)||i==7&&(j==4||j==5||j==6)||i==8&&(j==6)){
                    array[i][j] = "#";
                } else if (i==3&&(j==3)||i==4&&(j==5)||i==6&&(j==5)){
                    array[i][j] = "o";
                } else {
                    array[i][j] = " ";
                }
                if (i==p && j==q ) {
                    array[i][j] = "@";
                }
                if (p == 3 && q == 3) {
                    a = 1;
                } else if (a > 0) {
                    array[3][3] = " ";
                }
                if (p == 4 && q == 5) {
                    b = 1;
                } else if (b > 0) {
                    array[4][5] = " ";
                }
                if (p == 6 && q == 5) {
                    c = 1;
                } else if (c > 0) {
                    array[6][5] = " ";
                }
                System.out.print(array[i][j]);
            }
            System.out.println("");
            if (a > 0 && b > 0 && c > 0) {
                System.out.println("good game well played, congratulation ");
                System.exit(0);
            }
        }
    }
}