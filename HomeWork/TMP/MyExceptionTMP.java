package TMP;

public class MyExceptionTMP extends Exception {
    public int code;
    private String message;

    public MyExceptionTMP(int code) {
        this.code = code;
    }

    public MyExceptionTMP(int code, String message) {
        this.code = code;
        this.message = message;
    }

//    public MyAddressBookException() {
//        this.code = ResponseCode.NOT_FOUND;
//        this.message = message;
//            }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
