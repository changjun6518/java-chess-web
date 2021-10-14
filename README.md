## jwp-chess-web

## 기능 목록
- [콘솔 기반 체스게임](https://github.com/robolovo/jwp-chess-console) 을 웹 기반(스프링 프레임워크 사용)으로 구현한다. 
- DB(h2) 연동한다.
- 콘솔 -> web.view(html, css, js) 유저인터페이스를 구현한다.

## 구현 목록
- entity
- view
  - 시작화면(index.html)
  - 게임화면(board.html)
- 유저가 게임시작을 누름 -> 컨트롤러 -> 서비스 -> 레포지토리 -> 뷰
- history
  

# To-Do
- board 줄맞춰서 시각화하기
  - css 적용
- move 적용하기
  - 기물 클릭해서 이동하고
    - [x] js 에서는 클릭 event 발생시 그 위치를 서버에 전달 (from, to)
    - [x] move(from, to) 결과?를 받아오기
  - 디비에 적용하고
    - [x] move(from, to) 결과?를 디비에 저장 -> @@ 디비 저장할때 추가로 저장되면서 forign key 문제 생김 @@
  - 바뀐 기물 위치 보드 화면에 적용 하기

# 아쉬운 점
- move 할 때 pk 오류 발생했는데 이유를 찾지 못함
  - updateSquareBy(Position.of(from), Piece.of(PieceType.NONE, Team.NONE, '.')); 실행시 문제임
  - 아무래도 빈칸을 계속해서 새로 생성하고 없어지는 빈칸에 대한 처리를 하지 않아서 발생하는 것 같은데 정확한 이유를 찾지 못함
- 포지션은 고정된 값인데 보드를 생성할 때마다 포지션도 생성돼서 낭비가 됨