<<<<<<< HEAD
# book-catalog-platform
This is for book cataglog platform project
=======
# Book Catalog Platform

A production-grade microservices platform for book catalog management, built with platform engineering best practices.

## Technology Stack

- **Runtime**: Java 21 (Eclipse Temurin)
- **Framework**: Spring Boot 3.4
- **Database**: PostgreSQL 16
- **Cache**: Redis 7
- **Message Broker**: Apache Kafka
- **Observability**: Prometheus, Grafana, Zipkin
- **Security**: Keycloak (OAuth2/OIDC)
- **Container**: Docker
- **Orchestration**: Kubernetes

## Quick Start

### Prerequisites

- Java 21
- Maven 3.9+
- Docker Desktop
- Task 3.x

### Local Development

```bash
# Start infrastructure
task dev:setup

# Run the service
task dev:run

# Access services:
# - Catalog API: http://localhost:8080
# - Swagger UI: http://localhost:8080/swagger-ui.html
# - Grafana: http://localhost:3000 (admin/admin)
# - Prometheus: http://localhost:9090
# - Zipkin: http://localhost:9411
# - Keycloak: http://localhost:8180
```

## Project Structure

```
book-catalog-platform/
├── catalog-service/          # Main microservice
├── catalog-contracts/        # API contracts (OpenAPI, AsyncAPI)
├── platform-commons/         # Shared libraries
├── infrastructure/           # IaC (Kubernetes, Terraform, Helm)
├── docs/                     # Architecture & runbooks
└── scripts/                  # Utility scripts
```

## Documentation

- [Architecture Decision Records](docs/architecture/ADR/)
- [Deployment Guide](docs/runbooks/deployment.md)
- [Development Setup](docs/onboarding/setup-guide.md)

## License

MIT
>>>>>>> cfacf19 (Add catalog service and contracts)
