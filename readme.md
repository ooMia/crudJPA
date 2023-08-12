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

![before.png](before.png)
<figcaption align = "center">before</figcaption>

![after.png](after.png)
<figcaption align = "center">after</figcaption>

![get.png](get.png)
<figcaption align = "center">get</figcaption>