# Input
 
^[0-9\s]+$

숫자와 공백의 문자열

### ex: "123 456"

# Output

공백을 제거한 숫자들의 합

### ex: 168

# Limit

split 함수를 제외 (StringTokenizer 같은 함수도 사용 불가)

# 나의 풀이
-> 문자열을 순회하며, String에 각각의 문자열을 담은 후,
공백이 나올 경우 List에 저장.
마지막으로 List를 순회하면서 담겨있던 원소들을 더함.

# 풀이에 대한 질문

Q: 가변길이가 아닌 방법으로 해당 문제를 푼다면 어떤 방식으로 풀겠냐?

정답: String 으로 바로 연산해 나아가는 방식으로 풀면 된다고 대답 받음.


asdfasdf
asdfadsfsadfsda