export const listBoardTemplate = (board) => {
`<div class="board">
// board
    <div class="board-row">
        <div class="white-square"><img src="/images/${board.boardMap.squares.a8}.png" alt=""></div>
        <div class="black-square"><img src="/images/${board.boardMap.squares.b8}.png" alt=""></div>
        <div class="white-square"><img src="/images/${board.boardMap.squares.c8}.png" alt=""></div>
        <div class="black-square"><img src="/images/${board.boardMap.squares.d8}.png" alt=""></div>
        <div class="white-square"><img src="/images/${board.boardMap.squares.e8}.png" alt=""></div>
        <div class="black-square"><img src="/images/${board.boardMap.squares.f8}.png" alt=""></div>
        <div class="white-square"><img src="/images/${board.boardMap.squares.g8}.png" alt=""></div>
        <div class="black-square"><img src="/images/${board.boardMap.squares.h8}.png" alt=""></div>
    </div>
    <div class="board-row">
        <div class="white-square"></div>
        <div class="black-square"></div>
        <div class="white-square"></div>
        <div class="black-square"></div>
        <div class="white-square"></div>
        <div class="black-square"></div>
        <div class="white-square"></div>
        <div class="black-square"></div>
    </div>

</div>` 

    
};