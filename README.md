# 지하철 노선도 미션
[ATDD 강의](https://edu.nextstep.camp/c/R89PYi5H) 실습을 위한 지하철 노선도 애플리케이션

## 1단계 - 지하철역 인수 테스트 작성
- [x] 지하철역 관련 인수 테스트 완성하기
  - [x] 지하철역 목록 조회 인수 테스트 작성하기
  - [x] 지하철역 삭제 인수 테스트 작성하기

## 2단계 - 지하철 노선 기능
- [x] 인수 테스트를 기반으로 아래 기능 목록 구현
  - [x] 지하철 노선 생성
  - [x] 지하철 노선 목록 조회
  - [x] 지하철 노선 조회
  - [x] 지하철 노선 수정
  - [x] 지하철 노선 삭제
- [x] 인수 테스트 격리

## 3단계 - 구간 추가
- [x] 인수 테스트를 기반으로 아래 기능 목록 구현
  - [x] 지하철 노선 구간 추가
    - [x] 역 사이에 새로운 역을 등록할 경우
    - [x] 새로운 역을 상행 종점으로 등록할 경우
    - [x] 새로운 역을 하행 종점으로 등록할 경우
    - [x] 역 사이에 새로운 역을 등록할 경우 기존 역 사이 길이보다 크거나 같으면 등록을 할 수 없음
    - [x] 상행역과 하행역이 이미 노선에 모두 등록되어 있다면 추가할 수 없음
    - [x] 상행역과 하행역 둘 중 하나도 포함되어있지 않으면 추가할 수 없음
