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
- `Pedido.toString()` puede mostrar información del cliente.
- `Cliente.toString()` **NO** debe mostrar información de pedidos ni referencias a `Pedido`.
- No debe existir recursión directa ni indirecta entre los `toString()`.

---

## Ejemplo de salida esperada

