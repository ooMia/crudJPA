# sampleRequests
GET http://localhost:8080/api/v1/client

POST http://localhost:8080/api/v1/client/register
<br>
Content-Type: application/json
<br>
{
"id": "updateMe",
"privateCode": "1234",
"nickName": "beforeUpdate"
}

POST http://localhost:8080/api/v1/client/register
<br>
Content-Type: application/json
<br>
{
"id": "deleteMe",
"privateCode": "1234",
"nickName": "beforeDelete"
}

DELETE http://localhost:8080/api/v1/client/deleteMe?privateCode=1234

PUT http://localhost:8080/api/v1/client/updateMe?privateCode=1234&nickName=afterUpdate

GET http://localhost:8080/api/v1/client

# result

### before
![before.png](before.png)

### after
![after.png](after.png)

### get 
![get.png](get.png)

