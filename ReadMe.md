---
# Examen MVC
---
Gestiona dos funciones de un coche ( Avanzar y Repostar )
---

##  Estructura del Proyecto

---
- **Coche**  
  Clase que representa el vehículo, con su gasolina respectiva

- **Model**  
 La lógica para avanzar el vehículo y añadir gasolina.

- **Controller**  
  Actúa como intermediario entre la view y el model

- **View**  
  Muestra el menú de opciones

---
## Como funciona

---
- En base al diagrama realizado y al proceso y camino que tomé, la **View** pregunta al **Controller** si puede avanzar o repostar,
y de igual manera el **Controller llama al **Model** para ver si puede avanzar o repostar.
- Si el **Model** puede hacer estas acciones, devolverá al **Controller** los metros o los litros consumidos o recorridos,
que a su vez serán enviados a la **View** a través del **Controller**

- Por último tenemos a **App y Coche** que ejecutaran la aplicación y definiran la estructura del vehiculo
---