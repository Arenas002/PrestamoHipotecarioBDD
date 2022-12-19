# language: es
Característica: Pago cuota credito hipotecario

  Escenario:03 - Retraso en pago de cuota de credito hipotecario

    Dado un usuario se retrasa con el pago de la cuota
    Cuando se cumple el tiempo de pago  consignando 0 a la cuota de 800000
    Entonces se presenta un incremento en el interes de mora


  Esquema del escenario:04 - Pago de cuota de credito hipotecario exitoso
    Dado un usuario requiere pagar su cuota
    Cuando consignar la cuota de 800000 en los siguientes "<dias del mes>"
    Entonces se presenta un descuento en la siguiente cuota
    Ejemplos:
      |dias del mes|
      |10          |
      |20          |
      |30          |
