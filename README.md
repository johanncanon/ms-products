# ms-products

## Descripción

`ms-products` es un microservicio desarrollado con Spring Boot que gestiona productos. Proporciona endpoints para listar productos y obtener detalles de un producto específico.

## Características

- Listar todos los productos.
- Obtener detalles de un producto por su ID.

## Requisitos

- Java 11 o superior
- Gradle 6.8 o superior

## Instalación

1. Clona el repositorio:

   ```sh
   git clone https://github.com/johanncanon/ms-products.git
   ```

2. Navega al directorio del proyecto:

   ```sh
   cd ms-products
   ```

3. Compila el proyecto:

   ```sh
   ./gradlew build
   ```

## Ejecución

Para ejecutar el microservicio localmente, usa el siguiente comando:

```sh
./gradlew bootRun
```

El microservicio estará disponible en http://localhost:8080.

## Endpoints

Listar productos

- URL: `/products`
- Método: ` GET`
- Descripción: Devuelve una lista de todos los productos.
- Parametros:
  - ` id` (Long): : ID del producto.

## Estructura del Proyecto

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

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama `(git checkout -b feature/nueva-funcionalidad)`.
3. Realiza tus cambios y haz commit `(git commit -am 'Añadir nueva funcionalidad')`.
4. Haz push a la rama `(git push origin feature/nueva-funcionalidad)`.
5. Abre un Pull Request.

### Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
