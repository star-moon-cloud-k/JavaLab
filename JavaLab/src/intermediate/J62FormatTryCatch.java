package intermediate;

public class J62FormatTryCatch {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";
        try {
            int a = Integer.parseInt(sNum); //문자열을 기본 타입으로 변환할 때는 wrapper 클래스를 사용
            System.out.println(a);
        } catch (NumberFormatException ee) {
            System.out.println("int 입력 확인");
            System.err.println(ee.getMessage());
        } catch (Exception ee) {
            System.out.println("입력바람");
        }finally {
            System.out.println("수행되야함");
        }
    }
}
