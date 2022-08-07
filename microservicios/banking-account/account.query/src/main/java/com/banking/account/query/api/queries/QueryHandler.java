package com.banking.account.query.api.queries;

import com.banking.cqrs.core.domain.BaseEntity;

import java.util.List;

public interface QueryHandler {
    List<BaseEntity> hanlder(FindAllAcountsQuery query);
    List<BaseEntity> hanlder(FindAcountByIdQuery query);
    List<BaseEntity> hanlder(FindAccountByHolderQuery query);
    List<BaseEntity> hanlder(FindAccountWithBalanceQuery query);
}
