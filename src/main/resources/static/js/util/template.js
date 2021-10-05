export const listBoardTemplate = (board) => {
    console.log(board);
    return `<div class="board">
    <div class="board-row">
        <div class="white-square"><img src="/images/${board.squares.a2}.png" alt=""></div>
        <div class="black-square"><img src="/images/${board.squares.b2}.png" alt=""></div>
        <div class="white-square"><img src="/images/${board.squares.c2}.png" alt=""></div>
        <div class="black-square"><img src="/images/${board.squares.d2}.png" alt=""></div>
        <div class="white-square"><img src="/images/${board.squares.e2}.png" alt=""></div>
        <div class="black-square"><img src="/images/${board.squares.f2}.png" alt=""></div>
        <div class="white-square"><img src="/images/${board.squares.g2}.png" alt=""></div>
        <div class="black-square"><img src="/images/${board.squares.h2}.png" alt=""></div>
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