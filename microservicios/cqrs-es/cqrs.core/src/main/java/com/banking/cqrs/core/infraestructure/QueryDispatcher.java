package com.banking.cqrs.core.infraestructure;

import com.banking.cqrs.core.domain.BaseEntity;
import com.banking.cqrs.core.queries.BasicQuery;
import com.banking.cqrs.core.queries.QueryHandlerMethod;

import java.util.List;

public interface QueryDispatcher {
    <T extends BasicQuery> void registerHandler(Class<T> type, QueryHandlerMethod<T> hanlder);
    <U extends BaseEntity> List<U> send(BasicQuery query);
}
