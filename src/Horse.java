public class Horse extends ChessPiece{
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
       // все кординаты сущ
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)){
            // стартовая клетка не равна конечной
            if (line != toLine && column != toColumn &&
            // конечная клетка пустая или цвет фигуры в кон не равен текущему
                    (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].color.equals(this.color))
                            // стартовая клетка не пустая
                    && chessBoard.board[line][column] != null) {
                // если стартовая клетка не конь не ходим
                if (!chessBoard.board[line][column].equals(this))
                    return false;
            }

            // vse variantu dlia konia

            int [][] position = new int [] [] {

                    {line -2, column -1}, {line -2, column +1},
                    {line +2, column -1}, {line +2, column +1},
                    {line -1, column -2}, {line -1, column +2},
                    {line +1, column -2}, {line +1, column +2}};

            for (int i = 0; i < position.length; i++) {
                if (position[i][0] == toLine && position[i][1] == toColumn)
                    return true;

            }


        } else return false;
               return false;
        }

    @Override
    public String getSymbol() {
        return "H";
    }

    }
