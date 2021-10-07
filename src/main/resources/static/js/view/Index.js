import {listBoardTemplate} from '/js/util/template.js'


const $boardList = document.querySelector("#board-list");
const $createButton = document.querySelector("#create-button");

function Index() {

    //TODO - CREATE-BOARD  --- 새게임 버튼 누르면 콜
    const onCreateBoard = async (event) => {
        event.preventDefault();
        // url 컨트롤러 보낸다? 요청한다
        const boardTemplate = await fetch("/api/create", {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                // 'accept': 'application/json'
            }
        }).then(data => console.log(data));
            // data => data.json())
            // .then(boards => listBoardTemplate(boards.boardMap));

            // .then(boards => boards.map(board => square => listBoardTemplate(square)).join(""))
        // $boardList.innerHTML = boardTemplate;
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