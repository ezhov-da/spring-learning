
 ```shell script
 curl -X GET --insecure https://localhost:8443/books
```

#Swagger
```
https://localhost:8443/swagger-ui.html
```


#ActiveMQ

Добавить ActiveMQ/bin в PATH

http://localhost:8161/admin/

admin:admin

```shell script
curl -X GET --insecure https://localhost:8443/books/register
```

#HTTPS

[Spring HTTPS - https://www.baeldung.com/spring-boot-https-self-signed-certificate](https://www.baeldung.com/spring-boot-https-self-signed-certificate)

[https://www.thomasvitale.com/https-spring-boot-ssl-certificate/](https://www.thomasvitale.com/https-spring-boot-ssl-certificate/)

```shell script
keytool -genkeypair -alias springlearning -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 3650
```

Ошибка при расположении хранилища сертификатов в ресурсах: [https://stackoverflow.com/questions/17298126/generated-certificate-stops-working-when-moved-to-resources-folder](https://stackoverflow.com/questions/17298126/generated-certificate-stops-working-when-moved-to-resources-folder)