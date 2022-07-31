package se.lexicon.rajashree.model.dto;

import se.lexicon.rajashree.model.CustomerDetails;

import java.time.LocalDate;
import lombok.*;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CustomerView {


    private String customerId;
    private String email;
    private LocalDate regDate = LocalDate.now();
    private boolean active= true;
    private CustomerDetails details;



}
