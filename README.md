# demo-spring-boot-handle-exception

Clone : `git clone https://github.com/Nol5/demo-spring-boot-handle-exception.git`

Build : `mvn clean install`

Run : `java -jar target/demo-spring-boot-handle-exception-0.0.1-SNAPSHOT.jar`

View As : `http://localhost:8080/minusOne`

Test with :

`curl -X GET 'http://127.0.0.1:8080/minusOne'`

`curl -X GET 'http://127.0.0.1:8080/minusOne?xx=IronMan'`

`curl -X GET 'http://127.0.0.1:8080/minusOne?xx'`

`curl -X GET 'http://127.0.0.1:8080/minusOne?xx=0'`

`curl -X GET 'http://127.0.0.1:8080/minusOne?xx=-14'`

`curl -X GET 'http://127.0.0.1:8080/minusOne?xx=16'`
