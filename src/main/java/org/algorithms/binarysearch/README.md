# 이분 탐색(Binary Search)

### 탐색 범위를 두 부분으로 분할하면서 찾는 방식

처음부터 끝까지 돌면서 탐색하는 것보다 훨씬 빠른 장점을 지님

* 시간복잡도
  전체 탐색 : O(N)
  이분 탐색 : O(logN)

# 진행 순서 

1. 정렬
2. left와 right로 mid 값 설정
3. mid와 내가 구하고자 하는 값과 비교
4. 구할 값이 mid보다 높으면 : left = mid+1 구할 값이 mid보다 낮으면 : right = mid - 1
5. left > right가 될 때까지 계속 반복하기