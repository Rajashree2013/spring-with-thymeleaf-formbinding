package se.lexicon.rajashree.model.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerForm {


    @NotEmpty(message = "Custermerid must not be empty")
    @Size(min = 3, message = "Custermerid should have at least 3 characters")
    private String customerId;

    @NotEmpty (message = "email should not be null or empty")
    @Email ( message =  "email should be a valid email format")
    private  String email;
}
