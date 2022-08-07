# kafka-springboot
Manejo de Stream Data y EventSource con Kafa y SpringBoot

## EndPoints

### Abrir Cuenta Bancaria
```
POST /api/v1/openBankAccount HTTP/1.1
Host: localhost:5000
Content-Type: application/json
Cache-Control: no-cache
Postman-Token: 0d76ebfa-dafc-416f-7b6a-5f371d39d5c8

{
	"accountHolder": "Carlos Ramirez",
	"accountType": "SAVINGS",
	"openingBalance": 70.0
}
```

### Depositar Fondos por ID
```
PUT /api/v1/depositFunds/5a456d39-7b86-49ca-88b1-f97fdad11a04 HTTP/1.1
Host: localhost:5000
Content-Type: application/json
Cache-Control: no-cache
Postman-Token: 14224e89-828c-20f2-cc7a-dfe43048bf53

{
	"amount": 3500
}
```

### Retirar Fondos por ID
```
PUT /api/v1/withdrawFunds/5a456d39-7b86-49ca-88b1-f97fdad11a04 HTTP/1.1
Host: localhost:5000
Content-Type: application/json
Cache-Control: no-cache
Postman-Token: 461f434b-71b8-ed81-0283-340c84449009

{
	"amount": 100
}
```

### Cerrar Cuenta Bancaria
```
DELETE /api/v1/closeAccount/fe09c247-7ff5-4fd0-b7a3-ebe0f9d651e9 HTTP/1.1
Host: localhost:5000
Cache-Control: no-cache
Postman-Token: a2f7fc5a-7aee-2769-9abf-d91cfd98a92b
Content-Type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW
```

### Obtener Todas las Cuentas
```
GET /api/v1/bankAccountLookup/ HTTP/1.1
Host: localhost:5001
Cache-Control: no-cache
Postman-Token: 648a1bf2-243e-fc47-f536-c4c462ce1355
```

### Obtener Todas las Cuentas por ID
```
GET /api/v1/bankAccountLookup/byId/5a456d39-7b86-49ca-88b1-f97fdad11a04 HTTP/1.1
Host: localhost:5001
Cache-Control: no-cache
Postman-Token: 0c870e22-ada0-7727-3ce1-b9210a765bc1
```

### Obetener Todas las Cuentas por Nombre de Cliente
```
GET /api/v1/bankAccountLookup/byHolder/Berenice Acosta HTTP/1.1
Host: localhost:5001
Cache-Control: no-cache
Postman-Token: d91a9110-d839-bb8f-3097-a28fe57b7387
```

### Obtener Todas las Cuentas con Balance MayorQue
```
GET /api/v1/bankAccountLookup/withBalance/LESS_THAN/1000 HTTP/1.1
Host: localhost:5001
Cache-Control: no-cache
Postman-Token: 2f84fae0-ed95-f395-dc5e-43d6b94cdb45
```

### Obtener Todas las Cuentas con Balance MenorQue
```
GET /api/v1/bankAccountLookup/withBalance/GREATER_THAN/50 HTTP/1.1
Host: localhost:5001
Cache-Control: no-cache
Postman-Token: 224af092-133b-9c7e-b68b-384ea6d86659
```
