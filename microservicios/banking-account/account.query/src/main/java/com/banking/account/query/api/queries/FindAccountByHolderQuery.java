package com.banking.account.query.api.queries;

import com.banking.cqrs.core.queries.BasicQuery;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAccountByHolderQuery extends BasicQuery {
    private String accountHolder;
}
