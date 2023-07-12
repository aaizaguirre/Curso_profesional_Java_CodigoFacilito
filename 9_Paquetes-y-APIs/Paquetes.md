- Paquete: nos permite agrupar clases relacionadas entre sí (por finalidad o herencia). Resuelven la problemática de conflicto de nombre. Además, permite establecer privilegios de acceso.
- Para importar clases dentro de paquetes:
    import nombrePaquete.nombreClase;
- Para importar todas las clases de un paquete:
    import nombrePaquete.*;
  No es recomendable, usa mucha memoria.
- No es necesario importar el paquete Java.Lang. Por ejemplo la clase System pertenece a este paquete. 
- Para solicitar la entrada de datos a nuestro programa:
    Scanner sc = new Scanner(System.in);
- "protected" : únicamente pueden ser utilizados por clases y métodos pertenecientes al mismo paquete. 