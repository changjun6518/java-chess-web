export const boardTemplate = (board) => {
    return `
    <div class="board-row">
        <div class="white-square"><img id="a1" src="/images/${board.squares.a1}.png" alt=""></div>
        <div class="black-square"><img id="b1" src="/images/${board.squares.b1}.png" alt=""></div>
        <div class="white-square"><img id="c1" src="/images/${board.squares.c1}.png" alt=""></div>
        <div class="black-square"><img id="d1" src="/images/${board.squares.d1}.png" alt=""></div>
        <div class="white-square"><img id="e1" src="/images/${board.squares.e1}.png" alt=""></div>
        <div class="black-square"><img id="f1" src="/images/${board.squares.f1}.png" alt=""></div>
        <div class="white-square"><img id="g1" src="/images/${board.squares.g1}.png" alt=""></div>
        <div class="black-square"><img id="h1" src="/images/${board.squares.h1}.png" alt=""></div>
    </div>
    <div class="board-row">
        <div class="black-square"><img id="a2" src="/images/${board.squares.a2}.png" alt=""></div>
        <div class="white-square"><img id="b2" src="/images/${board.squares.b2}.png" alt=""></div>
        <div class="black-square"><img id="c2" src="/images/${board.squares.c2}.png" alt=""></div>
        <div class="white-square"><img id="d2" src="/images/${board.squares.d2}.png" alt=""></div>
        <div class="black-square"><img id="e2" src="/images/${board.squares.e2}.png" alt=""></div>
        <div class="white-square"><img id="f2" src="/images/${board.squares.f2}.png" alt=""></div>
        <div class="black-square"><img id="g2" src="/images/${board.squares.g2}.png" alt=""></div>
        <div class="white-square"><img id="h2" src="/images/${board.squares.h2}.png" alt=""></div>
    </div>
    <div class="board-row">
        <div class="white-square"><img id="a3" src="/images/${board.squares.a3}.png" alt=""></div>
        <div class="black-square"><img id="b3" src="/images/${board.squares.b3}.png" alt=""></div>
        <div class="white-square"><img id="c3" src="/images/${board.squares.c3}.png" alt=""></div>
        <div class="black-square"><img id="d3" src="/images/${board.squares.d3}.png" alt=""></div>
        <div class="white-square"><img id="e3" src="/images/${board.squares.e3}.png" alt=""></div>
        <div class="black-square"><img id="f3" src="/images/${board.squares.f3}.png" alt=""></div>
        <div class="white-square"><img id="g3" src="/images/${board.squares.g3}.png" alt=""></div>
        <div class="black-square"><img id="h3" src="/images/${board.squares.h3}.png" alt=""></div>
    </div>
    <div class="board-row">
        <div class="black-square"><img id="a4" src="/images/${board.squares.a4}.png" alt=""></div>
        <div class="white-square"><img id="b4" src="/images/${board.squares.b4}.png" alt=""></div>
        <div class="black-square"><img id="c4" src="/images/${board.squares.c4}.png" alt=""></div>
        <div class="white-square"><img id="d4" src="/images/${board.squares.d4}.png" alt=""></div>
        <div class="black-square"><img id="e4" src="/images/${board.squares.e4}.png" alt=""></div>
        <div class="white-square"><img id="f4" src="/images/${board.squares.f4}.png" alt=""></div>
        <div class="black-square"><img id="g4" src="/images/${board.squares.g4}.png" alt=""></div>
        <div class="white-square"><img id="h4" src="/images/${board.squares.h4}.png" alt=""></div>
    </div>
    <div class="board-row">
        <div class="white-square"><img id="a5" src="/images/${board.squares.a5}.png" alt=""></div>
        <div class="black-square"><img id="b5" src="/images/${board.squares.b5}.png" alt=""></div>
        <div class="white-square"><img id="c5" src="/images/${board.squares.c5}.png" alt=""></div>
        <div class="black-square"><img id="d5" src="/images/${board.squares.d5}.png" alt=""></div>
        <div class="white-square"><img id="e5" src="/images/${board.squares.e5}.png" alt=""></div>
        <div class="black-square"><img id="f5" src="/images/${board.squares.f5}.png" alt=""></div>
        <div class="white-square"><img id="g5" src="/images/${board.squares.g5}.png" alt=""></div>
        <div class="black-square"><img id="h5" src="/images/${board.squares.h5}.png" alt=""></div>
    </div>
    <div class="board-row">
        <div class="black-square"><img id="a6" src="/images/${board.squares.a6}.png" alt=""></div>
        <div class="white-square"><img id="b6" src="/images/${board.squares.b6}.png" alt=""></div>
        <div class="black-square"><img id="c6" src="/images/${board.squares.c6}.png" alt=""></div>
        <div class="white-square"><img id="d6" src="/images/${board.squares.d6}.png" alt=""></div>
        <div class="black-square"><img id="e6" src="/images/${board.squares.e6}.png" alt=""></div>
        <div class="white-square"><img id="f6" src="/images/${board.squares.f6}.png" alt=""></div>
        <div class="black-square"><img id="g6" src="/images/${board.squares.g6}.png" alt=""></div>
        <div class="white-square"><img id="h6" src="/images/${board.squares.h6}.png" alt=""></div>
    </div>
    <div class="board-row">
        <div class="white-square"><img id="a7" src="/images/${board.squares.a7}.png" alt=""></div>
        <div class="black-square"><img id="b7" src="/images/${board.squares.b7}.png" alt=""></div>
        <div class="white-square"><img id="c7" src="/images/${board.squares.c7}.png" alt=""></div>
        <div class="black-square"><img id="d7" src="/images/${board.squares.d7}.png" alt=""></div>
        <div class="white-square"><img id="e7" src="/images/${board.squares.e7}.png" alt=""></div>
        <div class="black-square"><img id="f7" src="/images/${board.squares.f7}.png" alt=""></div>
        <div class="white-square"><img id="g7" src="/images/${board.squares.g7}.png" alt=""></div>
        <div class="black-square"><img id="h7" src="/images/${board.squares.h7}.png" alt=""></div>
    </div>
    <div class="board-row">
        <div class="black-square"><img id="a8" src="/images/${board.squares.a8}.png" alt=""></div>
        <div class="white-square"><img id="b8" src="/images/${board.squares.b8}.png" alt=""></div>
        <div class="black-square"><img id="c8" src="/images/${board.squares.c8}.png" alt=""></div>
        <div class="white-square"><img id="d8" src="/images/${board.squares.d8}.png" alt=""></div>
        <div class="black-square"><img id="e8" src="/images/${board.squares.e8}.png" alt=""></div>
        <div class="white-square"><img id="f8" src="/images/${board.squares.f8}.png" alt=""></div>
        <div class="black-square"><img id="g8" src="/images/${board.squares.g8}.png" alt=""></div>
        <div class="white-square"><img id="h8" src="/images/${board.squares.h8}.png" alt=""></div>
    </div>
    `
};



export const boardListTemplate = (boardId) => {
    return `
        <div class="list-row" data-board-id="${boardId}">
            <span id="${boardId}">board ${boardId}</span>
            <button id="start-btn">시작하기</button>
            <button id="delete-btn">삭제하기</button>
        </div>
    `
}