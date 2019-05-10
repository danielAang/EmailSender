# Email Sender :email:
Simple Springboot project, designed to send emails using the java library JavaMailSender.


## Installation

1. Clone the project
2. Start the springboot app

#### Usage
Make a request to GET request to http://localhost:8080/service/send and use the follow json into the request body:
```json
{
    "email": "destination@provider.com",
    "pdf64": "A pdf in base64 format"
}
```