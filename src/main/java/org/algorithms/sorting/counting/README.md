# Abstract

Comparison Sort
N개 원소의 배열이 있을 때, 이를 모두 정렬하는 가짓수는 N!임

따라서, Comparison Sort를 통해 생기는 트리의 말단 노드가 N! 이상의 노드 갯수를 갖기 위해서는, 2^h >= N! 를 만족하는 h를 가져야 하고, 이 식을 h > O(nlgn)을 가져야 한다. (h는 트리의 높이,,, 즉 Comparison sort의 시간 복잡도임)

이런 O(nlgn)을 줄일 수 있는 방법은 Comparison을 하지 않는 것


# Process

시간 복잡도 : O(n + k) -> k는 배열에서 등장하는 최대값

공간 복잡도 : O(k) -> k만큼의 배열을 만들어야 함.

Counting이 필요 : 각 숫자가 몇 번 등장했는지 센다.

# 장점

O(n) 의 시간복잡도

# 단점 
배열 사이즈 N 만큼 돌 때, 증가시켜주는 Counting 배열의 크기가 큼.

(메모리 낭비가 심함)