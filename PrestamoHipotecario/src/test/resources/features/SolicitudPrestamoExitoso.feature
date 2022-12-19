# language: es
  Característica: Solicitud de prestamo hipotecario

    Escenario: 01 - petición de prestamo hipotecario exitoso

      Dado un usuario requiere un prestamo hipotecario
      Cuando cumple con todos los requisitos del formulario del credito hipotecario
      Y sus ingresos son  mayores de 1 SMMLV
      Entonces el prestamo hipotecario es exitoso


    Escenario: 02 - petición de prestamo hipotecario rechazado

      Dado un usuario requiere un prestamo hipotecario
      Cuando no cumple con los requisitos del formulario del credito hipotecario
      Y sus ingresos son menores de 1 SMMLV
      Entonces el prestamo hipotecario es rechazado