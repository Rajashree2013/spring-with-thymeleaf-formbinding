package se.lexicon.rajashree.model.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDetailsForm
{
    @NotEmpty(message = "detailsId must not be empty")
    @Size(min = 3, message = "detailsId should have at least 3 characters")
    private String detailsId;








}
