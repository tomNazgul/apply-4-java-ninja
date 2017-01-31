package org.jboss.as.quickstarts.kitchensink.exceptions;

import javax.validation.ValidationException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tomas on 31/01/17.
 */
public class UniqueViolationException extends ValidationException {
    private final Set<String> fields;

    public UniqueViolationException(HashSet<String> fields) {
        this.fields = fields;
    }

    @Override
    public String getMessage() {
        return String.format("Unique %s Violation", fields) ;
    }

    public Set<String> getFields() {
        return fields;
    }
}
