# Travel Map API

<img width="50%" src="https://user-images.githubusercontent.com/88638457/211123615-ca458e02-b36a-4ac4-9512-87aca7ab5eab.png"/>

## Purpose
* 전국 여행 다녔던 곳을 색칠하며 다음 여행 장소를 선정하기에 용이 (실제로 사용중)
* @Mapper

## About
* REST API 통신

## Error & Solved
* 기존 AWS 프리티어는 램이 1G임에 따라 jenkins 및 서버 CI/CD 중 메모리 부족으로 서버 먹통 발생
  - [2022.05] memory swap 기능을 활용하여 이를 해결
  - [2022.11] AWS + 홈서버 구축으로 램용량 증설
  
* 서버 간 CORS 에러 발생
  - nginx 설정으로 해결 * 서버 배포시
  - controller에 crossorigin 추가하여 로컬개발에서도 해결
  - 추후 통일
  
