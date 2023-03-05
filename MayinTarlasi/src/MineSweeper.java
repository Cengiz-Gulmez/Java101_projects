import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int row;
    int column;

    public MineSweeper(int row, int column){

        this.column=column;
        this.row=row;

    }
    public void run(){

        Random rastgele=new Random();

        String[][] tablo=new String[this.row][this.column];

        int stars=(this.row*this.column)/4;
        int a, b;

        for (int i=0;i<this.row;i++){
            for (int j=0;j<this.column;j++){
                tablo[i][j]="- ";
            }
        }

        for (int i=0;i<stars;i++){

            a=rastgele.nextInt(this.row);
            b=rastgele.nextInt(this.column);


            if (tablo[a][b].equals("* ")){
                i--;
                continue;
            }

            tablo[a][b]="* ";

        }
        System.out.println("MAYINLAR BURDA");

        for (int i=0;i<this.row;i++){
            System.out.println(" ");
            for (int j=0;j<this.column;j++){
                System.out.print(tablo[i][j]);
            }
        }
        System.out.println();
        System.out.println("****************************");


        Scanner input=new Scanner(System.in);

        int r,c;
        boolean isEnd=false;
        
        String[][] matrix=new String[this.row][this.column];




        for (int i=0;i<this.row;i++){
            for (int j=0;j<this.column;j++){
                matrix[i][j]="- ";
            }
        }//kullanıcının göreceği tablo.



            while (!isEnd){


                for (int i=0;i<this.row;i++){
                    System.out.println(" ");
                    for (int j=0;j<this.column;j++){
                        System.out.print(matrix[i][j]);
                    }
                }
                System.out.println();
                System.out.print("Satır numarasını giriniz: ");
                r=input.nextInt();
                System.out.print("Sütun numarasını giriniz: ");
                c=input.nextInt(); //her döngü başında tablonun son hali bastırılıyor ve kordinatlar isteniyor.




                if (tablo[r][c].equals("* ")){
                    System.out.println("GAME OVER");

                    isEnd=true;
                }// mayına basma durumu



                if (tablo[r][c].equals("- ")){


                    if (r==0 && c==0){
                        int count=0;
                        if (tablo[0][1].equals("* ")){
                            count++;
                        }
                        if (tablo[1][0].equals("* ")){
                            count++;
                        }
                        if (tablo[1][1].equals("* ")){
                            count++;
                        }
                        String s=Integer.toString(count);
                    matrix[0][0]=s + " ";
                    tablo[0][0]=matrix[0][0];

                    }// 0 a 0 köşesi...


                    else if (r==this.row-1 && c==0){
                        int count=0;
                        if (tablo[this.row - 1][1].equals("* ")){
                            count++;
                        }
                        if (tablo[this.row - 2][0].equals("* ")){
                            count++;
                        }
                        if (tablo[this.row - 2][1].equals("* ")){
                            count++;
                        }
                        String s=Integer.toString(count);
                        matrix[this.row-1][0]=s + " ";
                        tablo[this.row-1][0]=matrix[this.row-1][0];

                    }//alt sol köşe...

                    else if (r==0 && c==this.column-1){
                        int count=0;
                        if (tablo[0][this.column - 2].equals("* ")){
                            count++;
                        }
                        if (tablo[1][this.column - 2].equals("* ")){
                            count++;
                        }
                        if (tablo[1][this.column - 1].equals("* ")){
                            count++;
                        }
                        String s=Integer.toString(count);
                        matrix[0][this.column-1]=s + " ";
                        tablo[0][this.column-1]=matrix[0][this.column-1];

                    } // sağ üst köşe...

                    else if (r==this.row-1 && c==this.column-1){
                        int count=0;
                        if (tablo[this.row - 1][this.column - 2].equals("* ")){
                            count++;
                        }
                        if (tablo[this.row - 2][this.column - 2].equals("* ")){
                            count++;
                        }
                        if (tablo[this.row - 2][this.column - 1].equals("* ")){
                            count++;
                        }
                        String s=Integer.toString(count);
                        matrix[this.row-1][this.column-1]=s + " ";
                        tablo[this.row-1][this.column-1]=matrix[this.row-1][this.column-1];

                    }// sağ alt köşe...

                    else if (r==0) {
                        int count=0;
                        if (tablo[0][c - 1].equals("* ")){
                            count++;
                        }
                        if (tablo[0][c + 1].equals("* ")){
                            count++;
                        }
                        if (tablo[1][c - 1].equals("* ")){
                            count++;
                        }
                        if (tablo[1][c].equals("* ")){
                            count++;
                        }
                        if (tablo[1][c + 1].equals("* ")){
                            count++;
                        }
                        String s=Integer.toString(count);
                        matrix[0][c]=s + " ";
                        tablo[0][c]=matrix[0][c];


                    }//üst kenar...


                    else if (c==0) {
                        int count=0;
                        if (tablo[r - 1][0].equals("* ")){
                            count++;
                        }
                        if (tablo[r + 1][0].equals("* ")){
                            count++;
                        }
                        if (tablo[r - 1][1].equals("* ")){
                            count++;
                        }
                        if (tablo[r][1].equals("* ")){
                            count++;
                        }
                        if (tablo[r + 1][1].equals("* ")){
                            count++;
                        }
                        String s=Integer.toString(count);
                        matrix[r][0]=s + " ";
                        tablo[r][0]=matrix[r][0];


                    }//sol kenar...

                    else if (r==this.row-1) {
                        int count=0;
                        if (tablo[this.row - 1][c - 1].equals("* ")){
                            count++;
                        }
                        if (tablo[this.row - 1][c + 1].equals("* ")){
                            count++;
                        }
                        if (tablo[this.row - 2][c - 1].equals("* ")){
                            count++;
                        }
                        if (tablo[this.row - 2][c].equals("* ")){
                            count++;
                        }
                        if (tablo[this.row - 2][c + 1].equals("* ")){
                            count++;
                        }
                        String s=Integer.toString(count);
                        matrix[this.row-1][c]=s + " ";
                        tablo[this.row-1][c]=matrix[this.row-1][c];


                    }//alt kenar...


                    else if (c==this.column-1) {
                        int count=0;
                        if (tablo[r - 1][this.column - 1].equals("* ")){
                            count++;
                        }
                        if (tablo[r + 1][this.column - 1].equals("* ")){
                            count++;
                        }
                        if (tablo[r - 1][this.column - 2].equals("* ")){
                            count++;
                        }
                        if (tablo[r][this.column - 2].equals("* ")){
                            count++;
                        }
                        if (tablo[r + 1][this.column - 2].equals("* ")){
                            count++;
                        }
                        String s=Integer.toString(count);
                        matrix[r][this.column-1]=s + " ";
                        tablo[r][this.column-1]=matrix[r][0];


                    }//sağ kenar
                    else {
                        int count=0;
                        if (tablo[r][c - 1].equals("* ")){
                            count++;
                        }
                        if (tablo[r][c + 1].equals("* ")){
                            count++;
                        }
                        if (tablo[r - 1][c - 1].equals("* ")){
                            count++;
                        }
                        if (tablo[r - 1][c].equals("* ")){
                            count++;
                        }
                        if (tablo[r - 1][c + 1].equals("* ")){
                            count++;
                        }
                        if (tablo[r + 1][c - 1].equals("* ")){
                            count++;
                        }
                        if (tablo[r + 1][c].equals("* ")){
                            count++;
                        }
                        if (tablo[r + 1][c + 1].equals("* ")){
                            count++;
                        }
                        String s=Integer.toString(count);
                        matrix[r][c]=s + " ";
                        tablo[r][c]=matrix[r][c];

                    }// orta noktalar



                    if (isWin(tablo)){
                        System.out.println("kazandınız");
                        for (int i=0;i<this.row;i++){
                            System.out.println(" ");
                            for (int j=0;j<this.column;j++){
                                System.out.print(tablo[i][j]);
                            }
                        }
                        isEnd=true;
                    }

                }


            }//Döngünün Sonu


    }//END OF THE RUN...

    public boolean isWin(String[][] tablo){

        for (int i=0;i<this.row;i++){
            for (int j=0;j<this.column;j++){

                if (tablo[i][j].equals("- ")){
                    return false;
                }


            }
        }

        return true;
    }





}//end of the program
