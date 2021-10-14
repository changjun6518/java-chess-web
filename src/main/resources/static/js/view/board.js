import { boardTemplate } from '/js/util/template.js';

const $board = document.querySelector("#board");

function Board() {
    const id = window.location.hash.substring(1)

    const showBoard = async () => {
        const template = await fetch(`/api/start/${id}`, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            }
        })
            .then(date => date.json())
            .then(board => {
                console.log(board);
                return boardTemplate(board.boardMap);
            });

        $board.innerHTML = template;
    }

    let clickList = [];

    const movePiece = async (event) => {
        clickList.push(event.target.id);

        if (clickList.length === 2) {
            await fetch(`/api/move/${id}?from=${clickList[0]}&to=${clickList[1]}`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json',
                }
            });

            clickList = [];
            showBoard();
        }

    };

    this.init = () => {
        showBoard();
        $board.addEventListener("click", movePiece);
    }
}


const board = new Board();
board.init();