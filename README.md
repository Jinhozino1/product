# Product
***
### 1. 제품 등록

요청 메서드 : POST

요청 경로 : /products

제품 등록 성공(/products)


요청 바디
```JSON
[
  {
    "name" : "prod1",
    "price" : "1000",
    "amount" : 5
  },
  {
    "name": "prod2",
    "price": 3000,
    "amount": 10
  }
]

```

응답 바디
```JSON
[
  {
    "id": 1,
    "name": "prod1",
    "price": 1000,
    "amount": 5
  },
  {
    "id": 2,
    "name": "prod2",
    "price": 3000,
    "amount": 10
  }
]

```
***
### 2. 제품 전체 조회
요청 메서드 : GET

요청 경로 : /products

전체 조회 성공(/products)

요청바디
```JSON
```

응답 바디

```JSON
[
    {
        "id": 1,
        "name": "prod1",
        "price": 1000,
        "amount": 5
    },
    {
        "id": 2,
        "name": "prod2",
        "price": 3000,
        "amount": 10
    }
]
```

***
### 3. 제품 조회

요청 메서드 : GET

요청 경로 : /products/1

제품 조회 성공(/products/1)

요청 바디
```JSON
{
        "name" : "prod1",
        "price" : "1000",
        "amount" : 5
}
```

응답 바디
```JSON
{
    "id": 1,
    "name": "prod1",
    "price": 1000,
    "amount": 5
}
```
***
### 4. 제품 수정

요청 메서드 : PUT

요청 경로 : /products/1

제품 수정 성공(/products/1)

요청 바디
```JSON
{
  "name" : "prod1",
  "price" : "8000",
  "amount" : 7
}
```

응답 바디
```JSON
{
    "id": 1,
    "name": "prod1",
    "price": 8000,
    "amount": 7
}
```
***
### 5. 제품 삭제

요청 메서드 : DELETE

요청 경로 : /products/1

제품 삭제 성공(/products/1)

요청 바디
```JSON
```

응답 바디
```JSON
```
***
요청 메서드 : GET

요청 경로 : /products

결과 

요청 바디
```JSON
```
응답바디

```JSON
[
    {
        "id": 2,
        "name": "prod2",
        "price": 3000,
        "amount": 10
    }
]
```
