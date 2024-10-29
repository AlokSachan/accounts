package com.alok.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digit number")
    @Schema(
            description = "Account Number of ABC Bank account", example = "3454433243"
    )
    private Long accountNumber;
    @NotEmpty(message = "Account type cannot be null or empty")
    @Schema(
            description = "Account type of ABC Bank account", example = "Savings"
    )
    private String accountType;
    @NotEmpty(message = "BranchAddress cannot be null or empty")
    @Schema(
            description = "ABC Bank branch address", example = "123 NewYork"
    )
    private String branchAddress;
}
