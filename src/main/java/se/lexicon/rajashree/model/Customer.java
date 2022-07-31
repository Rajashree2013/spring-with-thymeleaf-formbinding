package se.lexicon.rajashree.model;

import java.time.LocalDate;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {

    @NotEmpty(message = "Custermerid must not be empty")
    @Size(min = 3, message = "Custermerid should have at least 3 characters")
    private String customerId;

    @NotEmpty(message = "Custermerid must not be empty")
    @Size(min = 3, message = "Custermerid should have at least 3 characters")
    private String email;
    private CustomerDetails details;
    private LocalDate regDate = LocalDate.now();
    private boolean active= true;


}
