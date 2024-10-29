package BackTracking;

public class Nqueen {

//changed void to boolean for only one solution

    public static boolean nQueens(char board[][], int row){
        
        //base
        if( row== board.length){
            // printBoard(board);
            count++;  //this is for total count ways
            // return; //this is for all possible soln
            return true;
        }

        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
              if(nQueens(board, row+1)){//this if is for only one soln algo
                return true;
               }
                board[row][j] = 'x';
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up 
        for(int i=row-1;i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //dig right 

        for(int i = row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagnoal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    static int count = 0;

    public static void printBoard(char board[][]){
        System.out.println("-----Chess Board-----");
        for(int i=0; i<board.length; i++){
            for(int j =0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }


    //Main Function to print 
    public static void main(String[] args) {
        int n = 4;

        char board[][] = new char[n][n];

        //initialize
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                board[i][j] = 'x';
            }
        }
        // nQueens(board,0); // this is for all soln and yes/no soln 
        if(nQueens(board,0)){
            System.out.println("solution is possible");
            printBoard(board);
        }else{System.out.println("Soln is not possible");}
        
        System.out.println("This is ths total ways to solve n queens = "+ count);
    }
}
