# MyNavigationAPP

2021111005 정재현 - Navigation 실습 (맛집 주문 앱)

## 첫 화면 (Home)

![home screen](screenshots/home_screen.png)

## 화면 구성

- HomeFragment → MenuFragment → DetailFragment → CartFragment → OrderCompleteFragment
- Navigation Component (`nav_graph.xml`) 기반 화면 전환
- Menu → Detail, Detail → Cart 단계에서 Bundle로 `menuName`, `price` 데이터 전달
- 모든 화면 ViewBinding 사용
