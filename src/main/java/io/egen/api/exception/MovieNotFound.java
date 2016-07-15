package io.egen.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Movie not found")
public class MovieNotFound extends RuntimeException {

	private static final long serialVersionUID = 479614122756850743L;

	public MovieNotFound(String message) {
		super(message);
	}

	public MovieNotFound(String message, Throwable cause) {
		super(message, cause);
	}
}
