**Sistema de Gestión de Precios y Registro de Olimpiadas
Descripción**
Este proyecto contiene dos ejercicios desarrollados en Java como parte de la asignatura Desarrollo de Software en la Escuela Politécnica Nacional.  
Se aplican conceptos de colecciones (ArrayList), programación orientada a objetos (clases, herencia, polimorfismo) y excepciones personalizadas, junto con diagramas UML.
**Ejercicio 1 – Gestión de Precios Inmobiliarios**
Programa en consola que permite gestionar precios de casas y departamentos usando `ArrayList<Double>`.
**Funcionalidades**
- Ingresar precio (validando que sea mayor a 0).
- Mostrar todos los precios registrados.
- Mostrar precio más alto.
- Mostrar precio más bajo.
- Mostrar precios iguales.
- Buscar un precio específico.
- Salir del sistema.
<img width="619" height="329" alt="image" src="https://github.com/user-attachments/assets/624fe224-a1c8-4d82-af08-860e0f9456c3" />
<img width="619" height="329" alt="image" src="https://github.com/user-attachments/assets/37d4a01f-5a54-4496-8823-16b76c568af2" />

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**Ejercicio 2 – Sistema de Registro de Olimpiadas**
Aplicación orientada a objetos para registrar información de una Olimpiada, sus eventos y participantes.
**Clases Principales**
- Participante (abstracta)  
  Atributos: nombre, código, cédula, género, edad  
  Método abstracto: `MostrarInformacion()`
- Atleta (hereda de Participante)  
  Atributo: disciplina  
  Método sobrescrito: `MostrarInformacion()`
- Entrenador (hereda de Participante)  
  Atributo: especialidad  
  Método sobrescrito: `MostrarInformacion()`
- Equipo  
  Atributos: nombreEquipo, integrantes (ArrayList<Atleta>)  
  Métodos: `agregarIntegrante()`, `mostrarIntegrantes()`
- Evento  
  Atributos: nombreEvento, participantes (ArrayList<Participante>)  
  Métodos: `agregarParticipante()`, `listarParticipantes()`
- Olimpiada  
  Atributos: nombreOlimpiada, eventos (ArrayList<Evento>)  
  Métodos: `agregarEvento()`, `listarEventos()`
- ExcepcionDatosInvalidos (hereda de Exception)  
  Constructor con mensaje personalizado.
- Main  
  Contiene el menú principal para interactuar con el sistema.
<img width="619" height="512" alt="image" src="https://github.com/user-attachments/assets/e429a3c2-0232-4c14-9b48-c607bc8385b4" />
<img width="619" height="471" alt="image" src="https://github.com/user-attachments/assets/d5e130e7-e726-4fc0-993d-b6d2cb7bc8ba" />





