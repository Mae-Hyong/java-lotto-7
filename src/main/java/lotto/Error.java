package lotto;

public enum Error {
    EMPTY_INPUT("[ERROR] 값을 입력해야 합니다."),
    INVALID_INTEGER("[ERROR] 정수만 입력 가능합니다."),
    INVALID_AMOUNT_UNIT("[ERROR] 천원 단위만 입력 가능합니다."),
    INVALID_LOTTO_NUMBERS("[ERROR] 로또 번호는 6개여야 합니다."),
    DUPLICATE_WINNING_NUMBER("[ERROR] 당첨 번호에 중복된 숫자가 있습니다.");

    private final String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}