# Capstone-Server
2022-1 Ajou SW Capstone Project 아주만능이조  


## Commit Message 규칙
### 7가지 commit 유형(type)  
FEAT: 새로운 기능의 추가  
FIX: 버그 수정  
DCS: 문서 수정  
STYLE: 스타일 관련 기능(코드 포맷팅, 세미콜론 누락, 코드 자체의 변경이 없는 경우)  
REFACTOR: 코드 리팩토링  
TEST: 테스트 코드, 리팩토링 테스트 코드 추가  
CHORE: 빌드 업무 수정, 패키지 매니저 수정(ex. gitignore 수정)   


## 소스 구조 설명
### DTO
1. UserDto: 회원 정보(db랑 일치)
2. PostDto: 게시글 정보(db랑 일치)
3. MainPostDto: 게시글-음식점 정보 조인한 경우에 사용하기 위한 dto. "/main"에서 보이는 게시글 정보를 담기 위함(title, r_name, order_time 등)
4. RestaurantDto: 음식점 정보(db랑 일치)
