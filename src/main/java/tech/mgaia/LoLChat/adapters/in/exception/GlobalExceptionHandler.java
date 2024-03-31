
@ControllerAdvice
public class GlobalExceptionHandler {

private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

@ExceptionHandler(ChampionNotFoundException.class)
public ResponseEntity<ApiError> handleDomainException(ChampionNotFoundException domainError) {
    return ResponseEntity
    .unprocessableEntity()
    .body(new ApiError(domainError.getMessage()));

}

@ExceptionHandler(Exception.class)
public ResponseEntity<ApiError> handleDomainException(Exception unexpectedError) {
    String message = "Ops! Ocorreu um erro inesperado!";

    logger.error(message, unexpectedError);
    
    return ResponseEntity
    .internalServerError()
    .body(new ApiError(domainError.getMessage()));

}


public record ApiError(String message) {}


}