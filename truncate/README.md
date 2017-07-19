
This is a spring boot project.
It uses spring MVC architecture.

It provides REST service to subscribe(not implemented).
The StringUtils class provides a truncate method to truncate a long string to limit length. 
The default limit length is 250.
Subscribe service uses the truncate method to log orderDetails


HTTP METHOD: GET

HTTP REQUEST: /subscribe?orderDetails=

HTTP RESPONSE: String

Log: truncated orderDetails




