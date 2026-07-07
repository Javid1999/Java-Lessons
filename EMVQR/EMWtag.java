package EMVQR;

public enum EMWtag {

    PAYLOAD_FORMAT("00"),
    MERCHANT_NAME("59"),
    MERCHANT_CITY("60");

    private final String code;

    EMWtag(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

