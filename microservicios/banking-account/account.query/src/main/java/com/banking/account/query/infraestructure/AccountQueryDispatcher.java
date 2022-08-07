package com.banking.account.query.infraestructure;

import com.banking.cqrs.core.domain.BaseEntity;
import com.banking.cqrs.core.infraestructure.QueryDispatcher;
import com.banking.cqrs.core.queries.BasicQuery;
import com.banking.cqrs.core.queries.QueryHandlerMethod;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class AccountQueryDispatcher implements QueryDispatcher {
    private final Map<Class<? extends BasicQuery>, List<QueryHandlerMethod>> routes =  new HashMap<>();
    @Override
    public <T extends BasicQuery> void registerHandler(Class<T> type, QueryHandlerMethod<T> hanlder) {
        var handlers = routes.computeIfAbsent(type, c -> new LinkedList<>());
        handlers.add(hanlder);
    }

    @Override
    public <U extends BaseEntity> List<U> send(BasicQuery query) {
        var hanlders = routes.get(query.getClass());
        if (hanlders == null || hanlders.size() <= 0) {
            throw  new RuntimeException("Ningún query hanlder fue registrado para este objeto query");
        }

        if (hanlders.size() > 1) {
            throw new RuntimeException("No puede enviar un query que tenga dos o mas hanldres");
        }

        return hanlders.get(0).handle(query);
    }
}
