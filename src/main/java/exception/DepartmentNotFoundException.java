package exception;

public class CountryNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -1233666078709813858L;
    private String exceptionMessage;


    public DepartmentNotFoundException(String exceptionMessage) {
        super();
        this.exceptionMessage = exceptionMessage;
    }


    public String getExceptionMessage() {
        return exceptionMessage;
    }


    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

}
