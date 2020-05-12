# 2주차 성장 과제 - 네이버 웹툰 뷰

![KakaoTalk_20200512_164046184_01](https://user-images.githubusercontent.com/63635840/81655508-3fc03d80-9471-11ea-8c24-1903cef20500.jpg)
![KakaoTalk_20200512_164046184_02](https://user-images.githubusercontent.com/63635840/81655516-40f16a80-9471-11ea-8fdf-a73770965b97.jpg)



## 해결하지 못해 조언이 필요한 부분
### 현 상황
 - 요일별 웹툰을 보여주기 위해 Tablayout을 상단에 위치시키고, 웹툰 홈, 베스트 도전웹툰, mypage는 bottomNavigationView를 하단에 위치시킨 상태.
 - TabLayout 스와핑, 터치 시 요일별 웹툰이 나오도록 우선 구현함.

### 조언이 필요한 부분
 - 하단에 위치한 웹툰 홈, 베스트 도전, my page부분을 터치했을 때만 반응하도록 구현하고자 함. 처음 어플을 실행했을 땐 웹툰 홈이 뜨고 그 웹툰 홈에는 TabLayout으로 구현한 요일별 웹툰이 나오고, 베스트 도전, MY를 터치했을 땐 bottomNavigationView를 제외한 View에 베스트도전, MY에 해당하는 View 생성(Fragment를 사용해야할지 ViewPager를 사용해야할지 판단이 되지않고, activity_main.xml 내의 constraintLayout에 포함되는 Viewpager처럼 새로운 View를 만들어야하는지도 궁금함.)

