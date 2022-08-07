package com.banking.account.query;

import com.banking.account.query.api.queries.*;
import com.banking.cqrs.core.infraestructure.QueryDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class QueryApplication {
	@Autowired
	private QueryDispatcher queryDispatcher;

	@Autowired
	private QueryHandler queryHandler;

	public static void main(String[] args) {
		SpringApplication.run(QueryApplication.class, args);
	}

	@PostConstruct
	public void registerHandlers() {
		queryDispatcher.registerHandler(FindAllAcountsQuery.class, queryHandler::hanlder);
		queryDispatcher.registerHandler(FindAcountByIdQuery.class, queryHandler::hanlder);
		queryDispatcher.registerHandler(FindAccountByHolderQuery.class, queryHandler::hanlder);
		queryDispatcher.registerHandler(FindAccountWithBalanceQuery.class, queryHandler::hanlder);
	}
}
