# Abstract
손 안의 카드를 정렬하는 방법과 유사하다.

Insertion Sort는 Selection Sort와 유사하지만, 좀 더 효율적인 정렬 알고리즘이다.

Insertion Sort는 2번째 원소부터 시작하여 그 앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후, 원소를 뒤로 옮기고 지정된 자리에 자료를 삽입 하여 정렬하는 알고리즘이다.

최선의 경우 O(N)이라는 엄청나게 빠른 효율성을 가지고 있어, 다른 정렬 알고리즘의 일부로 사용될 만큼 좋은 정렬 알고리즘이다.

# Process (Ascending)

1. 정렬은 2번째 위치(index)의 값을 temp에 저장한다.
2. temp와 이전에 있는 원소들과 비교하며 삽입해나간다.
3. '1'번으로 돌아가 다음 위치(index)의 값을 temp에 저장하고, 반복한다