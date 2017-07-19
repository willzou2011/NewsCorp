
This is a spring boot project.
It uses spring MVC architecture.

It provides REST service to subscribe(not implemente).
The StringUtils class provides a truncate method to truncate a long string to limit length. 
The default limit length is 250.

HTTP METHOD: GET
Request 
/subscribe?orderDetails=

Response 
String

Example

http://localhost:8080/subscribe?orderDetails=helloSydneydkldjkgjkrejglksjglsknlfshmlfkhdflhd

Response:
he ... (truncated) ... hd 
