package enter.J009;
import enter.J009.JInheritance.*;
public class JInheritance2 {
    public class OddMagicSquare extends JInheritance{
        public OddMagicSquare(int n){
            super(n);
        }
        public OddMagicSquare(){
            this(3);
        }
        @Override
        public void make(){
            int x = 0;
            int y = super.n/2;      //n protected -> 자식은 public 처럼 사용
            super.magic[x][y] = 1;  //
        }

    }
}

/*
부모와 자식의 관계를 가짐
상속 관계 -> 계층 구조
자식이 부모보다 더 구체적으로 구현이 된다.

자바에서 중요한 메모리는 크게 3종류

* Static : 메서드 영역 , static 영역, 클래스 영역, 설계도
* Stack : 기본 연산의 연산이나 레퍼런스 저장
* Heap : 생성된 객체를 저장

메모리 4대 특징
* 자생부설 : 자식이 생성되면 부모도 생성된다
    힙에서 발생하는 원리
* 자설부설 : 자식의 설계도가 올라가면 부모의 설계도도 올라간다
* 생주부주 : 생성된 주소는 부모의 주소이다.
* 설공메사 : 설계도에 공개된 메서드만 사용할 수 있다.

 */