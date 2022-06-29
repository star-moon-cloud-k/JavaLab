package enter.J010;


public class JLambda {
    @FunctionalInterface
    public interface Calculater {
        public int cal(int num, int num2);
    }

    //기본 사용법 (매개변수 타입) -> {};
    public void LambdaLearn(){
        Calculater cal = (int num1, int num2) -> {return num1 + num2;};
        System.out.println(cal.cal(1,2));
    }

    //매개변수 타입생략 (매개변수) -> {};
    public void lambdaLearn2(){
        Calculater cal = (num1, num2) -> {return num1 + num2; };
        System.out.println(cal.cal(1,2));
    }

    public void lambdaLearn3(){
//        Calculater cal = () -> {System.out.println("매개변수가 없는 경우");};
//        cal.cal();
    }

}
