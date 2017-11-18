public class Solution529 {
    public char[][] updateBoard(char[][] board, int[] click) {

        int x = click[1], y = click[0];
        char selected = board[y][x];
        if (selected == 'M') {
            board[y][x] = 'X';
            return board;
        }

        if (selected == 'E') {
            int weight = board[0].length, height = board.length;
            int leftX = x - 1, leftY = y,
                    upX = x, upY = y - 1,
                    rightX = x + 1, rightY = y,
                    downX = x, downY = y + 1,

                    luX = x - 1, luY = y - 1,
                    ruX = x + 1, ruY = y - 1,
                    ldX = x - 1, ldY = y + 1,
                    rdX = x + 1, rdY = y + 1;


            char res = searchNeighbor(board, click);
            if (res == 'B') {
                board[y][x] = 'B';
                int[] newClick = new int[2];
                if (leftX >= 0) {

                    newClick[1] = leftX;
                    newClick[0] = leftY;
                    updateBoard(board, newClick);

                }
                if (upY >= 0) {

                    newClick[1] = upX;
                    newClick[0] = upY;
                    updateBoard(board, newClick);

                }
                if (rightX < weight) {

                    newClick[1] = rightX;
                    newClick[0] = rightY;
                    updateBoard(board, newClick);

                }
                if (downY < height) {

                    newClick[1] = downX;
                    newClick[0] = downY;
                    updateBoard(board, newClick);

                }

                if (luX >= 0 && luY >= 0) {

                    newClick[1] = luX;
                    newClick[0] = luY;
                    updateBoard(board, newClick);

                }
                if (ruX < weight && ruY >= 0) {

                    newClick[1] = ruX;
                    newClick[0] = ruY;
                    updateBoard(board, newClick);

                }
                if (ldX >= 0 && ldY < height) {

                    newClick[1] = ldX;
                    newClick[0] = ldY;
                    updateBoard(board, newClick);

                }
                if (rdX < weight && rdY < height) {

                    newClick[1] = rdX;
                    newClick[0] = rdY;
                    updateBoard(board, newClick);

                }


            } else {
                board[y][x] = res;
            }

            return board;
        }
        return board;

    }

    public char searchNeighbor(char[][] board, int[] selectCell) {
        int x = selectCell[1], y = selectCell[0];
        int weight = board[0].length, height = board.length;
        int leftX = x - 1, leftY = y,
                upX = x, upY = y - 1,
                rightX = x + 1, rightY = y,
                downX = x, downY = y + 1,

                luX = x - 1, luY = y - 1,
                ruX = x + 1, ruY = y - 1,
                ldX = x - 1, ldY = y + 1,
                rdX = x + 1, rdY = y + 1;
        int count = 0;
        if (leftX >= 0) {
            if (board[leftY][leftX] == 'M') {
                count++;
            }
        }
        if (upY >= 0) {
            if (board[upY][upX] == 'M') {
                count++;
            }
        }
        if (rightX < weight) {
            if (board[rightY][rightX] == 'M') {
                count++;
            }
        }
        if (downY < height) {
            if (board[downY][downX] == 'M') {
                count++;
            }
        }

        if (luX >= 0 && luY >= 0) {
            if (board[luY][luX] == 'M') {
                count++;
            }
        }
        if (ruX < weight && ruY >= 0) {
            if (board[ruY][ruX] == 'M') {
                count++;
            }
        }
        if (ldX >= 0 && ldY < height) {
            if (board[ldY][ldX] == 'M') {
                count++;
            }
        }
        if (rdX < weight && rdY < height) {
            if (board[rdY][rdX] == 'M') {
                count++;
            }
        }

        if (count == 0) {
            return 'B';
        } else {
            return (count + "").charAt(0);
        }

    }

    public static void main(String[] args) {
        char[][] board = {{'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}};
        char[][] board2 = {
                {'E', 'E'},
                {'E', 'E'}
        };
        int[] click = {3, 0};
        char[][] res = new Solution529().updateBoard(board, click);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(board[i][j] + ",");
            }
            System.out.println();
        }
    }
}
