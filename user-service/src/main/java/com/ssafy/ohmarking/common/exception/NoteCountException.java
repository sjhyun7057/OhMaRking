package com.ssafy.ohmarking.common.exception;

public class NoteCountException extends RuntimeException {
    public NoteCountException() {super("응원 메시지 수가 20개 미만입니다.");}

    public NoteCountException(String msg) {super(msg);}

    public NoteCountException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public NoteCountException(Throwable cause) {super(cause);}

    protected NoteCountException(String msg, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }
}
