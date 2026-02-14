# Ejercicio 1 – toString sin recursión

## Contexto

Se está desarrollando un sistema de pedidos.  
Un `Pedido` pertenece a un `Cliente` y ambos objetos se imprimen en logs para depuración y auditoría.

Un `toString()` mal implementado puede generar:
- logs ilegibles
- recursión infinita
- errores en tiempo de ejecución

---

## Consigna

Implementar dos clases:

### Clase Cliente
Campos:
- `id` (`Long`)
- `nombre` (`String`)
- `email` (`String`)

### Clase Pedido
Campos:
- `id` (`Long`)
- `total` (`BigDecimal`)
- `cliente` (`Cliente`)

---

## Requisitos obligatorios

- Sobrescribir `toString()` en ambas clases.
- El resultado debe ser legible, finito y estable.

---

## Ejemplo de salida esperada

Pedido{id=501, total=24999.90, cliente=Cliente{id=10, nombre='Juan Perez', email='juan@mail.com'}}
