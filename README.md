# ms-products

## Description

`ms-products` is a microservice developed with Spring Boot that manages products. It provides endpoints to list products and retrieve details of a specific product.

## Features

- List all products.
- Retrieve details of a product by its ID.

## Requirements

- Java 11 or higher
- Gradle 6.8 or higher

## Installation

1. Clone the repository:

   ```sh
   git clone https://github.com/johanncanon/ms-products.git
   ```

2. Navigate to the project directory:

   ```sh
   cd ms-products
   ```

3. Compila el proyecto:

   ```sh
   ./gradlew build
   ```

## Execution

To run the microservice locally, use the following command:

```sh
./gradlew bootRun
```

The microservice will be available at http://localhost:8080.

## Endpoints

### List Products

- URL: `/products`
- Method: ` GET`
- Description: Returns a list of all products.

### Get Product Details

- URL: `/products/{id}`
- Method: ` GET`
- Description: Returns details of a specific product.
- Parameters:
  - ` id` (Long): ID of the product.

## Project Structure

```
ms-products/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── johancanon/
│   │   │           └── springcloud/
│   │   │               └── ms/
│   │   │                   └── products/
│   │   │                       ├── controllers/
│   │   │                       │   └── ProductController.java
│   │   │                       ├── entities/
│   │   │                       │   └── Product.java
│   │   │                       └── services/
│   │   │                           └── ProductService.java
│   │   └── resources/
│   │       └── application.properties
├── .gitignore
├── build.gradle
├── settings.gradle
└── README.md
```

## Contributions

Contributions are welcome. Please follow these steps:

1. Fork the project.
2. Create a new branch: `(git checkout -b feature/nueva-funcionalidad)`.
3. Make your changes and commit them: `(git commit -am 'Añadir nueva funcionalidad')`.
4. Push to the branch: `(git push origin feature/nueva-funcionalidad)`.
5. Open a Pull Request.

### License

This project is licensed under the MIT License. See the LICENSE file for more details.
