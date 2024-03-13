# API ��� ������ � ���������, �����������, �������������� � ������

���� API ������������� ����������� ��������� ������� � ��������, ����������, ������������� � �����.

## �������

### �������� ������� �� ID

GET /api_v1/location/{id}


������ ������:

json { "id": 100, "name": "�������" }


### �������� ��� �������

GET /api_v1/location


������ ������:

json [ { "id": 100, "name": "�������" }, { "id": 101, "name": "NL" } ]


## ���������

### �������� ��������� �� ID

GET /api_v1/category/{id}


������ ������:

json { "id": 4, "name": "������" }


### �������� ��� ���������

GET /api_v1/category


������ ������:

json [ { "id": 2, "name": "������" }, { "id": 3, "name": "������" } ]


## ������������

### �������� ���� �������������

GET /api_v1/user
������ ������:
json [ { "id": 2, "name": "���", "discount": [1,2,3,4,5] }, { "id": 2, "name": "���", "discount": [1,2,3,4,5] } ]


### �������� ������������ �� ID

GET /api_v1/user/{id}

������ ������:
json { "id": 2, "name": "���", "discount": [1,2,3,4,5] }

## ����

### �������� ���� �� ID ������� � ID ���������

GET /api_v1/price/{idLocation}/{idCategory}

������ ������:
json { "category": { "id": 4, "name": "��������" }, "location": { "id": 3, "name": "����������" }, "userAndPrice": [ { "id": 2, "name": "���", "discount": [1,2,3,4,5] }, { "id": 2, "name": "���", "discount": [1,2,3,4,5] } ], "price": 0 }


### ������� ����

POST /api_v1/price

������ �������:
json { "idLocation": 200, "idCategory": 20, "price": 200, "isUser": 8 }

������ ������:
json { "category": { "id": 20, "name": "��������" }, "location": { "id": 200, "name": "���������" }, "userAndPrice": [ { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 10, "name": "Bujhm", "discount": [] }, { "id": 8, "name": "Bujhm", "discount": [] }, { "id": 7, "name": "Bujhm", "discount": [] }, { "id": 7, "name": "Bujhm", "discount": [] } ], "price": 200 }


## �������� ������������

POST /api_v1/user
������ �������:
json { "name": "����" }

������ ������:
json { "id": 2, "name": "���", "discount": [1,2,3,4,5] }

# ��� ������� ��������

### 1.��� ������� �������� ������������� �����:
[get-started docker](https://www.docker.com/get-started/)

### 2. ��� ������ ������� ����������� ���������:
```mvn clean```
```mvn install```

### 3. ���������� ��������� � ����������� ��������� .env file
```docker-compose --env-file .env up --build -d```

### 4. ���������� ���������
```docker-compose --env-file .env stop```

