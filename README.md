# 2주차 성장 과제 - 네이버 웹툰 뷰

![KakaoTalk_20200508_160032127_02](https://user-images.githubusercontent.com/63635840/81380091-366b6400-9145-11ea-810d-550a5c8f3d4d.jpg)
![KakaoTalk_20200508_160032127_01](https://user-images.githubusercontent.com/63635840/81380092-379c9100-9145-11ea-90cc-af99555c8034.jpg)


## cardview로 구현해보았으나 생각보다 별로라 추후 수정할 예정입니다.  
## 해결하지 못해 조언이 필요한 부분
### 현 상태
 - 요일별 웹툰을 보여주기 위해 bottomnavigationview를 상단에 위치시키고, 웹툰 홈, 베스트 도전웹툰, mypage는 하단에 위치시킨 싱태에서 요일별 웹툰을 스와핑, 터치했을 때 넘어갈 수 있도록 우선적으로 구현함.
 - 하단에 위치한 웹툰 홈, 베스트 도전, my page부분을 터치했을 때만 반응하도록 구현하고자 함. 
 - 요일별 웹툰을 보여줄 viewpager(id : main_viewPager)와 웹툰 홈, 베스트 도전 부분을 터치했을 때 보여 줄 viewpager(id : sub_viewPager)를 각각 만들고, sub_viewPager에는 setOnNavigationItemSelectedListener만 만들어 터치했을 때만 해당 viewpage로 이동하도록 했으나 코드상 아래에 위치한 부분에 대해서만 제대로 구현되고, 나머지는 구현되지 않음.
 - 요일별 웹툰 viewpager 스와핑, 요일 터치시 넘어가는 부분만 구현한 상태입니다.
