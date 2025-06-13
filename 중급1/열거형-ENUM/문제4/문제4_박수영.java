public enum 문제4_박수영 {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");
    private final int code;
    private final String message;

    문제4_박수영(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static 문제4_박수영 findByCode(int code) {
        for (문제4_박수영 status : values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
}