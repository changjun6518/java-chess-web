package web.controller.command;

import web.controller.Calculator;
import web.domain.board.Board;
import web.view.Output;

public class Status implements Command{
    public Status() {
    }

    @Override
    public void execute(Board board) {
        Calculator.calcScore(board);
        Output.printBoard(board);
    }
}
