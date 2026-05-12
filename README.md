# ContCoffee - Contador de Café

Esta aplicación es un ejemplo básico desarrollado con **Jetpack Compose** en Kotlin, enfocado en el aprendizaje de la gestión de estados en la interfaz de usuario.

## Objetivo
Desarrollar una interfaz de usuario funcional aplicando los siguientes conceptos fundamentales:
- **State (Estado)**: Manejo de datos dinámicos.
- **remember**: Persistencia de valores durante la recomposición.
- **mutableStateOf**: Creación de estados observables.
- **State Hoisting**: Elevación de estado para mejorar la modularidad y pruebas.
- **Interacción**: Uso de botones y eventos.
- **Condicionales**: Lógica visual basada en el estado.

## Características
- **Contador de Tazas**: Inicia en `0`.
- **Incrementar**: Botón "Añadir taza" que aumenta el contador en `+1`.
- **Reiniciar**: Botón "Reiniciar" que vuelve el contador a `0`.
- **Advertencia de Cafeína**: Si el contador supera las `10` tazas, se muestra el mensaje:  
  `¡Demasiada cafeína!` en color rojo.

## Estructura del Código
El código se organiza siguiendo el patrón de **State Hoisting**:
- `CoffeeScreen`: Composable de nivel superior que gestiona el estado (`count`).
- `CoffeeCounter`: Composable "stateless" (sin estado) que solo se encarga de mostrar la UI y notificar eventos.

## Requisitos
- Android Studio Iguana o superior.
- Kotlin 1.9+.
- Jetpack Compose.
