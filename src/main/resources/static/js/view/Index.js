
const $boardList = document.querySelector("#board-list");
const $createButton = document.querySelector("#create-button");

function Index() {

    //TODO - CREATE-BOARD  --- 새게임 버튼 누르면 콜
    const onCreateBoard = (event) => {
        event.preventDefault();
        // url 컨트롤러 보낸다? 요청한다
        const boardTemplate = fetch("/api/create", {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                // 'accept': 'application/json'
            }
        }).then(data => data.json())
            .then(board => {return listBoardTemplate(board)});
        $boardList.innerHTML = boardTemplate;
    };
    //TODO - DELETE_BOARD  --- 게임삭제 버튼 누르면 콜

    //TODO - START_GAME    --- 이어서 게임하기 누르면 콜

    //TODO - LIST_BOARD     --- 게임중인 보드 리스트 나열

    this.init = () => {
        $createButton.addEventListener("click", onCreateBoard);
    }
}

const index = new Index();
index.init();



const listBoardTemplate = (board) =>
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
        <div class="white-square">${board.boardMap.squares.a8}</div>
        <div class="black-square">${board.boardMap.squares.a7}</div>
        <div class="white-square">${board.boardMap.squares.b8}</div>
        <div class="black-square"></div>
        <div class="white-square"></div>
        <div class="black-square"></div>
        <div class="white-square"></div>
        <div class="black-square"></div>
    </div>

</div>`;