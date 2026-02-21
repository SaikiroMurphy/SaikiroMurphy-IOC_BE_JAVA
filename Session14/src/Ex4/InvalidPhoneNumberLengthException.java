package Ex4;

public class InvalidPhoneNumberLengthException extends Exception {

    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }

    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberLengthException {
        if (!phoneNumber.matches("\\d+")) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại phải chỉ chứa chữ số.");
        } else if (phoneNumber.length() != 10) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại phải có đúng 10 chữ số.");
        }
    }
}
