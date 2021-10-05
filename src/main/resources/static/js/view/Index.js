import {boardListTemplate} from '/js/util/template.js';

const $boardList = document.querySelector("#board-list");
const $createButton = document.querySelector("#create-button");

function Index() {

    //TODO - CREATE-BOARD  --- 새게임 버튼 누르면 콜
    const onCreateBoard = async (event) => {
        event.preventDefault();
        const template = await fetch("/api/create", {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            }
        });

        listBoard();
        //     .then(boards => listBoardTemplate(boards.boardMap));
        //
        // $boardList.innerHTML = boardTemplate;
    };

    //TODO - DELETE_BOARD  --- 게임삭제 버튼 누르면 콜
    const onDeleteBoard = async (event) => {
        const $target = event.target;
        if ($target.id === 'start-btn') {
            return;
        }
        const id = event.target.closest('DIV').dataset.boardId;
        await fetch(`/api/${id}`, {
            method: 'DELETE',
        })

        listBoard();
    };

    //TODO - START_GAME    --- 이어서 게임하기 누르면 콜
    const onStartGame = (event) => {
        const $target = event.target;
        if ($target.id === 'delete-btn') {
            return;
        }
        const id = event.target.closest('DIV').dataset.boardId;
        window.location.href = '/start' + '#' + id;
    };

    //TODO - LIST_BOARD     --- 게임중인 보드 리스트 나열
    const listBoard = async () => {
        const template = await fetch("/api/boards", {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(data => data.json())
            .then(
                boards => boards.map(board => boardListTemplate(board)).join("")
            );

        $boardList.innerHTML = template;
    }

    this.init = () => {
        $createButton.addEventListener("click", onCreateBoard);
        $boardList.addEventListener("click", onDeleteBoard);
        $boardList.addEventListener("click", onStartGame);
    }
}

const index = new Index();
index.init();