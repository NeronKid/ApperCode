# API для работы с локациями, категориями, пользователями и ценами

Этот API предоставляет возможность управлять данными о локациях, категориях, пользователях и ценах.

## Локации

### Получить локацию по ID

GET /api_v1/location/{id}


Пример ответа:

json { "id": 100, "name": "Бисерть" }


### Получить все локации

GET /api_v1/location


Пример ответа:

json [ { "id": 100, "name": "Бисерть" }, { "id": 101, "name": "NL" } ]


## Категории

### Получить категорию по ID

GET /api_v1/category/{id}


Пример ответа:

json { "id": 4, "name": "Услуги" }


### Получить все категории

GET /api_v1/category


Пример ответа:

json [ { "id": 2, "name": "Услуги" }, { "id": 3, "name": "Услуги" } ]


## Пользователи

### Получить всех пользователей

GET /api_v1/user
Пример ответа:
json [ { "id": 2, "name": "Имя", "discount": [1,2,3,4,5] }, { "id": 2, "name": "Имя", "discount": [1,2,3,4,5] } ]


### Получить пользователя по ID

GET /api_v1/user/{id}

Пример ответа:
json { "id": 2, "name": "Имя", "discount": [1,2,3,4,5] }

## Цена

### Получить цену по ID локации и ID категории

GET /api_v1/price/{idLocation}/{idCategory}

Пример ответа:
json { "category": { "id": 4, "name": "Животные" }, "location": { "id": 3, "name": "Черногорск" }, "userAndPrice": [ { "id": 2, "name": "Имя", "discount": [1,2,3,4,5] }, { "id": 2, "name": "Имя", "discount": [1,2,3,4,5] } ], "price": 0 }


### Создать цену

POST /api_v1/price

Пример запроса:
json { "idLocation": 200, "idCategory": 20, "price": 200, "isUser": 8 }

Пример ответа:
json { "category": { "id": 20, "name": "Ноутбуки" }, "location": { "id": 200, "name": "Боринское" }, "userAndPrice": [ { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 8, "name": "Bujhm", "discount": [] }, { "id": 7, "name": "Bujhm", "discount": [] }, { "id": 7, "name": "Bujhm", "discount": [] } ], "price": 200 }


## Создание пользователя

POST /api_v1/user
Пример запроса:
json { "name": "Илья" }

Пример ответа:
json { "id": 2, "name": "Имя", "discount": [1,2,3,4,5] }

# Для запуска локально

### 1.Для запуска локально устанавливаем докер:
[get-started docker](https://www.docker.com/get-started/)

### 2. При сборке проекта обязательно выполняем:
```mvn clean```
```mvn install```

### 3. Развернуть контейнер с переменными окружения .env file
```docker-compose --env-file .env up --build -d```

### 4. Остановить контейнер
```docker-compose --env-file .env stop```

