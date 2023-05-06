# 상속(Inheritance)

Java에는 상속(Inheritance)이라는 개념이 존재한다.

상위 클래스와 하위 클래스가 있으며, 하위 클래스르는 상위 클래스를 상속하여, 해당 상위 클래스의 멤버(변수), 메서드 등을 그대로 사용 할 수 있다.

단, 상속받더라도 모든 것을 다 사용할 수는 없다.

- 상위 클래스에 접근 제한자가 private 인 변수, 메서드 등의 경우 사용 할 수 없다.
- 상위 클래스와 하위 클래스의 패키지가 서로 다르다면, 상위 클래스의 접근 제한자가 default 인 변수, 메서드 등의 사용 할 수 없다.
- 그 외의 모든 것은 사용이 가능하다.

```java
public class Parent {
    String name;
    String nickname;

    public Parent(String name, String nickname) {
        System.out.println("호출 될까요? 안될까요?");
        this.name = name;
        this.nickname = nickname;
    }

    public void print() {
        System.out.println(this.name + " " + this.nickname);
    }
}

public class Child extends Parent {
    public Child(String name, String nickname) {
        super(name, nickname);
    }

    public static void main(String[] args) {
        Child p = new Child("name Test", "nickName Test");
        p.print();
    }
}
```

이 경우 main 메서드에서 Parent 클래스를 상속받는 Child 클래스를 생성해 주었다.
그런데 실행시키게 된다면 Parent 클래스의 생성자에 작성된 System.out.println()이 실행되는 것을 볼 수 있다.

그 이유는, 자바에서는 하위 클래스를 생성할 경우 상위 클래스를 먼저 생성한 후, 하위 클래스가 생성된다.
나는 하위 클래스만 생성한 줄 알았는데, 사실 상위 클래스가 먼저 생성되고 하위 클래스가 생성되는 것이다.

해당 역할을 해주는 것이 `super()` 메서드이다.

그렇다면 밑의 코드를 보면 얘는 어떻게 되는 걸까 생각해보자.

```java
public class Parent {
    public String name;
    public String nickName;

    public void print() {
        System.out.println(this.name + " " + this.nickName);
    }
}

public class Child extends Parent {
    
    public Child(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }
    
    public static void main(String[] args) {
        Child child = new Child("test Name", "test NickName");
        child.print();
    }
}


```

이 경우에는 상위 클래스에 생성자도 존재하지 않고, 하위 클래스에 `super()` 메서드도 존재하지 않는다.
그런데 문제가 없다.

이 경우는 '명시적인 생성자가 존재 하지 않는 경우'이다.
이때는 컴파일러가 해당 메서드를 실행할 경우 기본 생성자를 생성하여 호출한다.

즉, 하위 클래스의 생성자의 맨 첫라인에 super(); 라는 줄이 들어가게 되고 이는 상위 클래스의 기본 생성자를 호출하게 된다.

그렇다면 또 재밌는걸 한번 보자.

```java
public class Parent {
    public String name;
    public String nickName;

    public Parent(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }
    
    public void print() {
        System.out.println(this.name + " " + this.nickName);
    }
}

public class Child extends Parent{
    public Child(String name, String nickName) {
        System.out.println("메롱");
        super(name, nickName);
    }

    public static void main(String[] args) {
        Child child = new Child("test Name", "test NickName");
        child.print();
    }
}
```

이 경우는 명시적 생성자도 존재하고, 하위 클래스에서도 super()를 통해 상위 클래스 생성자를 호출하였다.
그런데 빨간줄이 들어오고 컴파일 에러가 발생한다.

그 이유는 `super()` 메서드는 반드시 생성자의 첫번째 라인에 위치해야 한다.

그렇다면 왜 그럴까? 이게 무슨 문제가 있어서 이런 법칙이 있을까?
그 이유는 생각보다 간단하다.
상속은 하위 클래스가 상위 클래스의 모든 멤버 변수(변수, 메서드) 등을 사용할 수 있다.(단, 접근 제한자에 이상이 없는 경우)
그렇다면 `super()` 메서드의 호출이 뒤늦게 나오는데 그 이전에 상위 클래스의 멤버 변수를 참조할 경우는? 당연히 아직 생성된것도 없으니 에러가 나게된다.

죽, 하위 클래스에서 상위 클래스의 멤버 변수를 사용할 수 있기 때문에 `super()`메서드는 항상 생성자의 첫번째 라인에 위치해야 한다.

