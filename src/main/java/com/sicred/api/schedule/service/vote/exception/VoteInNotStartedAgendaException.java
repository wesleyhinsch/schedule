package com.sicred.api.schedule.service.vote.exception;

import com.sicred.api.schedule.exception.impl.BaseRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class VoteInNotStartedAgendaException extends BaseRuntimeException {
    private static final String KEY = "rulles.bussines.vote.invalid.name";

    public VoteInNotStartedAgendaException() {
        super();
    }

    @Override
    public String getExceptionKey() {
        return KEY;
    }
}