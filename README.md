정리

현재 코테를 준비해야하는 방향성
1. 프로그래머스 고득점 KIT으로 잃어버렸던 감을 찾는다.
2. 자주 나오는 기출 문제를 실시간 처럼 푼다.

전제 : 우선 나는 IDE를 못쓴다는 전제하에 코드를 구현한다.

1. import java.util.*; 을 제일 먼저 쓴다.
2. 기존의 코드는 냅두고 주석 처리를 위, 아래로 구분한다.
3. System.out.println(); 을 써서 자주 자주 중간 답을 확인한다.

---

여러 데이터들이 있을 때, 중복 여부를 확인해야할 때 알아야하는 메소드
map.put 같은 경우에는 value 값을 바꿀 수 있다.<br>
만약 존재 하지 않는 경우, 생성한다. getDeafult는 없는 경우 0을 반환한다.
```java
for (String person : participant) {
	map.put(person, map.getOrDefault(person, 0) + 1);
}

for (String key : map.keySet()) {
	if (map.get(key) != 0) {
		answer = key;
	}
}
```