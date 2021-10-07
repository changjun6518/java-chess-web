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

    this.init = () => {
        showBoard();
    }
}


const board = new Board();
board.init();