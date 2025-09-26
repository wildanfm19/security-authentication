Spring Boot Auth Template



A starter template for Spring Boot projects with Spring Security and JWT authentication, ready to bootstrap secure applications quickly.

Features

User registration & login

JWT authentication & role-based access

Password hashing and security best practices

Configurable database (H2 for dev, PostgreSQL/MySQL for prod)

Ready-to-use Spring Security setup

Swagger/OpenAPI integration for API testing

Quick Start
git clone https://github.com/your-username/springboot-auth-template.git
cd springboot-auth-template
./mvnw spring-boot:run


Access H2 console: http://localhost:8080/h2-console

API Endpoints
Endpoint	Description
POST /api/auth/register	Register new user
POST /api/auth/login	Authenticate & get JWT
GET /api/user/me	Get current user info

Usage

Clone this template to start new Spring Boot projects with authentication and security already configured. Extend with your custom features as needed.

License

MIT © [WildanFariezkyMaaruf]
