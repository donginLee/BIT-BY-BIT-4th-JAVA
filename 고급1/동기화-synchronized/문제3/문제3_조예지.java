/* 
다음에서 value 필드(멤버 변수)는 공유되는 값이다. 멀티스레드 상황에서 문제가 될 수 있을까?

class Immutable {
    private final int value;
    
    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
*/

// final 키워드를 사용하여 값을 수정할 수 없기 때문에 문제가 되지 않는다.
