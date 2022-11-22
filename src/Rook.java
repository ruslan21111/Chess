public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if (column == toColumn) {
                for (int i = getMin(line, toLine); i < getMax(line, toLine); i++) {
                    if (chessBoard.board[i][column] != null) {
                        if (chessBoard.board[i][column] == this && i == getMax(line, toLine))
                            return false;

                        else if (chessBoard.board[i][column].getColor().equals(this.color) && i == toLine)
                            return false;

                        else if (!chessBoard.board[i][column].getColor().equals(this.color) && i == toLine)
                            return true;

                    }
                    }
                }

            }
return false;

        }


        @Override
        public String getSymbol() {
            return "R";
        }
    }
