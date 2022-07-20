public class MartEvent {
    public static void main(String[] args) {
        int ratio;
        ratio = 15;

        // 나눗셈할때 소숫점으로 나누면 소숫점으로 나오지만 정수로 나누면 뒤에 소수점은 생략됨
        System.out.println(2330 * ratio / 100.0);
        System.out.println(2333 * ratio / 100.0);
        System.out.println(2330 * ratio / 100);
        System.out.println(2333* ratio / 100);
    }
}
